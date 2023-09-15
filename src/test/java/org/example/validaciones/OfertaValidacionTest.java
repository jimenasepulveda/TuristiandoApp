package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {

    private OfertaValidacion validacion;

    @BeforeEach
    public void configurarPruebas(){
        this.validacion = new OfertaValidacion();
        System.out.println("Iniciando prueba...");
    }


    @Test
    public void validarTituloCorrectamente (){
        String tituloPrueba = "Teatro de la luna";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.valiadarTitulo(tituloPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarTituloIncorrectamente(){
        String tituloPrueba = "Teatrooooooooooooooooooooooooooooooooooooooooooo";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.valiadarTitulo(tituloPrueba));
        Assertions.assertEquals(Mensaje.TITULO_INVALIDO_LOCAL.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarFechasFuncionaCorrectamente(){
        LocalDate fechaInicial = LocalDate.of(2023,8,15);
        LocalDate fechaFinal = LocalDate.of(2023,8,17);
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarFechas(fechaInicial,fechaFinal));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarFechasFuncionaIncorrectamente(){
        LocalDate fechaInicial = LocalDate.of(2023,8,17);
        LocalDate fechaFinal = LocalDate.of(2023,8,15);
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarFechas(fechaInicial,fechaFinal));
        Assertions.assertEquals(Mensaje.FECHA_INVALIDA.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarFormatoFechasFuncionaCorrectamente(){
        String formatoFechaPrueba = "16/08/2023";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarFormatoFechas(formatoFechaPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarFormatoFechasFuncionaIncorrectamente(){
        String formatoFechaPrueba = "2023/08/16";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarFormatoFechas(formatoFechaPrueba));
        Assertions.assertEquals(Mensaje.FORMATO_FECHA_INVALIDO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarCostoPersonaFuncionaCorrectamente(){
        Double costoPersonaPrueba = 6.000;
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarCostoPersona(costoPersonaPrueba));
        Assertions.assertTrue(respuesta);
    }


    @Test
    public void validarCostoPersonaFuncionaIncorrectamente(){
        Double costoPersonaPrueba = -10.000;
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarCostoPersona(costoPersonaPrueba));
        Assertions.assertEquals(Mensaje.COSTO_PERSONA_INVALIDO.getMensaje(), respuesta.getMessage());
    }
}