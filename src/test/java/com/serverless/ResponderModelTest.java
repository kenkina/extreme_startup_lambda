package com.serverless;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class ResponderModelTest {

    ResponderModel responderModel = new ResponderModel();

    @Test
    public void cuandoLaPreguntaEsVaciaRetornaElNombreDelEquipo() {
        // Arrange
        String question = "";

        // Act
        String response = responderModel.answer(question);

        // Assert
        assertThat(response).isEqualTo("Equipo-2");
    }

    @Test
    public void cuandoSuma2Y2Retorna4() {
        // Arrange
        String question = "123 what is the sum of 2 and 2";

        // Act
        String response = responderModel.answer(question);

        // Assert
        assertThat(response).isEqualTo("4");
    }

    @Test
    public void cuandoPreguntanNombreRetornaElNombre() {
        // Arrange
        String question = "e0da7fe0: what is your name";

        // Act
        String response = responderModel.answer(question);

        // Assert
        assertThat(response).isEqualTo("Equipo-2");
    }
}
