package com.serverless;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ResponderModelTest {
    ResponderModel responderModel = new ResponderModel();

    @Test
    public void cuandoPreguntaPorNombreRespondeizm (){
        String pregunta = "e4055dc0: what is your name";
        String respuesta = responderModel.answer(pregunta);
        assertThat(respuesta).isEqualTo("izm");
    }
}
