package com.serverless;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ResponderModelTest {
    ResponderModel responderModel = new ResponderModel();

    @Test
    public void cuandoPreguntaCuadradoYCubo2 (){
        String pregunta = "b8b3d3a0: which of the following numbers is both a square and a cube: 832, 81";
        String respuesta = responderModel.answer(pregunta);
        assertThat(respuesta).isEqualTo("832");
    }

    @Test
    public void cuandoPreguntaCuadradoYCubo (){
        String pregunta = "be7ac100: which of the following numbers is both a square and a cube: 531441, 98";
        String respuesta = responderModel.answer(pregunta);
        assertThat(respuesta).isEqualTo("531441");
    }

    @Test
    public void cuandoPreguntaElNumeroMayor (){
        String pregunta = "76b11240: which of the following numbers is the largest: 99, 305, 41, 514, 1000";
        String respuesta = responderModel.answer(pregunta);
        assertThat(respuesta).isEqualTo("1000");
    }

    @Test
    public void cuandoPreguntaElNumeroMayor2 (){
        String pregunta = "76b11240: which of the following numbers is the largest: 99, 305";
        String respuesta = responderModel.answer(pregunta);
        assertThat(respuesta).isEqualTo("305");
    }

    @Test
    public void cuandoPreguntaSuma (){
        String pregunta = "83c615f0: what is 18 plus 9";
        String respuesta = responderModel.answer(pregunta);
        assertThat(respuesta).isEqualTo("27");
    }

    @Test
    public void cuandoPreguntaSuma2 (){
        String pregunta = "8aac66f0: what is 9 plus 14";
        String respuesta = responderModel.answer(pregunta);
        assertThat(respuesta).isEqualTo("23");
    }

    @Test
    public void cuandoPreguntaPorNombreRespondeCarlos (){
        String pregunta = "428b0c80: what is your name";
        String respuesta = responderModel.answer(pregunta);
        assertThat(respuesta).isEqualTo("carlos");
    }

    @Test
    public void cuandoPreguntaVaciaRespondeCarlos (){
        String pregunta = "";
        String respuesta = responderModel.answer(pregunta);
        assertThat(respuesta).isEqualTo("carlos");
    }

    @Test
    public void cuandoPreguntaPorCiudadDeEiffelRespondeParis (){
        String pregunta = "aeeac440: which city is the Eiffel tower in";
        String respuesta = responderModel.answer(pregunta);
        assertThat(respuesta).isEqualTo("Paris");
    }

    @Test
    public void cuandoPregunta4NumeroFibonacci (){
        String pregunta = "b29458d0: what is the 4th number in the Fibonacci sequence";
        String respuesta = responderModel.answer(pregunta);
        assertThat(respuesta).isEqualTo("3");
    }

    @Test
    public void cuandoPregunta15NumeroFibonacci (){
        String pregunta = "b29458d0: what is the 15th number in the Fibonacci sequence";
        String respuesta = responderModel.answer(pregunta);
        assertThat(respuesta).isEqualTo("610");
    }

    @Test
    public void cuandoPreguntaColorBanana (){
        String pregunta = "ab5227d0: what colour is a banana";
        String respuesta = responderModel.answer(pregunta);
        assertThat(respuesta).isEqualTo("yellow");
    }

    @Test
    public void cuandoPreguntaMultiplicacion160 (){
        String pregunta = "96ff9100: what is 16 multiplied by 10";
        String respuesta = responderModel.answer(pregunta);
        assertThat(respuesta).isEqualTo("160");
    }

    @Test
    public void cuandoPreguntaMultiplicacion4 (){
        String pregunta = "96ff9100: what is 2 multiplied by 2";
        String respuesta = responderModel.answer(pregunta);
        assertThat(respuesta).isEqualTo("4");
    }



}
