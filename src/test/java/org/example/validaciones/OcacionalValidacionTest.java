package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OcacionalValidacionTest {
    private OcacionalValidacion validacion = new OcacionalValidacion();

    @BeforeEach
    public void configurarPruebas (){
        this.validacion = new OcacionalValidacion();
    }

    @Test
    public void validarvalorEventoFuncionaCorrectamente(){
        Integer valorEventoPrueba = 20000;
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarvalorEvento(valorEventoPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarvalorEventoFuncionaIncorrectamente(){
        Integer valorEventoPrueba = -20000;
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarvalorEvento(valorEventoPrueba));
        Assertions.assertEquals(Mensaje.COSTO_PERSONA_INVALIDO.getMensaje(), respuesta.getMessage());
    }
}