package com.mycompany.aprendendofxcomcomponentizacaoefxml.component;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class LogoComponent extends HBox {

    @FXML private ImageView imgLogo;
    @FXML private Label lblTitulo;

    public LogoComponent() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("logo_component.fxml"));
        fxmlLoader.setRoot(this); // Define a própria classe como nó raiz
        fxmlLoader.setController(this); // Define esta classe como o Controller do FXML

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException("Erro ao carregar o FXML do LogoComponent", exception);
        }
    }

    // Métodos utilitários para personalizar o componente via código
    public void setTitulo(String titulo) {
        this.lblTitulo.setText(titulo);
    }

    public void setCaminhoImagem(String caminho) {
        this.imgLogo.setImage(new Image(caminho));
    }
}
