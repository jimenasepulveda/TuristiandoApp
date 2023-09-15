package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaValidacionTest {

    private EmpresaValidacion validacion;

    @BeforeEach
    public void configurarPruebas(){
        this.validacion = new EmpresaValidacion();
        System.out.println("Iniciando prueba...");
    }

    @Test
    public void validarNitFuncionaCorrectamente(){
        String nitPrueba = "1234567890";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarNit(nitPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarNitFuncionaIncorrectosPorNumerosCaracteres(){
        String nitPrueba = "123456";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarNit(nitPrueba));
        Assertions.assertEquals(Mensaje.NIT_INVALIDO.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarNitFuncionaIncorrectosPorCaracteresInvalidos(){
        String nitPrueba = "jjjjjjjjjj";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarNit(nitPrueba));
        Assertions.assertEquals(Mensaje.NIT_NUMEROS_INVALIDOS.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarNombreFuncionaCorrectamente(){
        String nombreLocalPrueba = "Comfama";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarNombreEmpresa(nombreLocalPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarNombreFuncionaIncorrectamentePorNumerosCaracteres(){
        String nombreLocalPrueba = "Comfamaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarNombreEmpresa(nombreLocalPrueba));
        Assertions.assertEquals(Mensaje.NOMBRE_LOCAL_INVALIDO.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarNombreFuncionaIncorrectamentePorCaracteresNoPermitidos(){
       String nombreLocalPrueba ="Comfama23_";
       Exception respuesta =Assertions.assertThrows(Exception.class,()->this.validacion.validarNombreEmpresa(nombreLocalPrueba));
       Assertions.assertEquals(Mensaje.NOMBRE_LOCAL_CARACTERES_INVALIDOS.getMensaje(),respuesta.getMessage());
    }
}