package com.mycompany.aprendendofxcomcomponentizacaoefxml.component;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class CustomInputComponent extends VBox {

    @FXML private Label lblRotulo;
    @FXML private TextField txtCampo;

    public CustomInputComponent() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("custom_input_component.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException("Erro ao carregar o FXML do CustomInputComponent", exception);
        }
    }

    // Getters e Setters para interação com a Tela Principal
    public String getTexto() {
        return txtCampo.getText();
    }

    public void setTexto(String texto) {
        txtCampo.setText(texto);
    }

    public void setRotulo(String textoRotulo) {
        lblRotulo.setText(textoRotulo);
    }

    public void setPlaceholder(String placeholder) {
        txtCampo.setPromptText(placeholder);
    }
}