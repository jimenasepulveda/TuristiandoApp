package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfiliadoValidacionTest {

    private AfiliadoValidacion afilidadoValidacion;

    @BeforeEach
    public void configurarPruebas (){
        this.afilidadoValidacion = new AfiliadoValidacion();
    }


    @Test
    public void ValidarCostoMensualidadFuncionaCorrectamente(){
        Integer costoMensualidadPrueba = 10000;
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.afilidadoValidacion.ValidarCostoMensualidad(costoMensualidadPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void ValidarCostoMensualidadFuncionaIncorrectamente(){
        Integer costoMensualidadPrueba = -10000;
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.afilidadoValidacion.ValidarCostoMensualidad(costoMensualidadPrueba));
        Assertions.assertEquals(Mensaje.COSTO_PERSONA_INVALIDO.getMensaje(), respuesta.getMessage());
    }
}