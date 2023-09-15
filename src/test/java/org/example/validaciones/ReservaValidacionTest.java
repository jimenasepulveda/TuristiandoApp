package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {

    private ReservaValidacion validacion;
    @BeforeEach
    public void configurarPruebas(){
        this.validacion = new ReservaValidacion();
        System.out.println("Iniciando prueba...");
    }

    @Test
    public void validarFormatoFechaFuncionaCorrectamente(){
        String formatoFechaPrueba = "16/08/2023";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarFormatoFecha(formatoFechaPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarFormatoFechaFuncionaIncorrectamente(){
        String formatoFechaPrueba = "2023/08/16";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarFormatoFecha(formatoFechaPrueba));
        Assertions.assertEquals(Mensaje.FORMATO_FECHA_INVALIDO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarNumeroPersonasFuncionaCorrectamente(){
        Integer numeroPersonasPruebas = 2;
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarNumeroPersonas(numeroPersonasPruebas));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarNumeroPersonasFuncionaIncorrectamente(){
        Integer numeroPersonasPruebas = 5;
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarNumeroPersonas(numeroPersonasPruebas));
        Assertions.assertEquals(Mensaje.NUMERO_PERSONAS_INVALIDO.getMensaje(),respuesta.getMessage());
    }

}