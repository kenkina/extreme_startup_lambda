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

    @Test
    public void cuandoPreguntanNombreRetornaElNombre2() {
        // Arrange
        String question = "f15e9a90: what is your name";

        // Act
        String response = responderModel.answer(question);

        // Assert
        assertThat(response).isEqualTo("Equipo-2");
    }

    @Test
    public void cuandoPreguntanPlusRetornaLaSuma() {
        // Arrange
        String question = "10f93d60: what is 16 plus 18";

        // Act
        String response = responderModel.answer(question);

        // Assert
        assertThat(response).isEqualTo("34");
    }

    @Test
    public void cuandoPreguntanPlusRetornaLaSum2a() {
        // Arrange
        String question = "what is 15 plus 14";

        // Act
        String response = responderModel.answer(question);

        // Assert
        assertThat(response).isEqualTo("29");
    }


    @Test
    public void cuandoPreguntanCualEsElNumeroMayor() {
        // Arrange
        String question = "8a4ae200: which of the following numbers is the largest: 25, 55, 908, 885";

        // Act
        String response = responderModel.answer(question);

        // Assert
        assertThat(response).isEqualTo("908");
    }

    @Test
    public void cuandoPreguntanCualEsElNumeroMayor2() {
        // Arrange
        String question = "c3796c40: which of the following numbers is the largest: 596, 91";

        // Act
        String response = responderModel.answer(question);

        // Assert
        assertThat(response).isEqualTo("596");
    }


}
