package application;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class SampleController {
	@FXML
    private Circle circulo;

    // Propiedad que mantiene el número de clics
    private int contador = 0;

    // Método que se ejecuta al hacer clic en el botón
    @FXML
    public void cambiarColorDelCirculo() {
        // Incrementar el contador cada vez que se hace clic
        contador++;
        System.out.println("Número de clics: " + contador);

        // Cambiar el color del círculo a un color aleatorio
        circulo.setFill(Color.color(Math.random(), Math.random(), Math.random()));

        // También cambiar la transparencia del círculo para crear un efecto visual
        circulo.setOpacity(Math.random()); // Ajusta la opacidad al azar entre 0.0 y 1.0
    }
}
