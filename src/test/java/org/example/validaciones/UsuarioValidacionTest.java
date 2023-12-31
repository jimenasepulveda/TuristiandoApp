package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {

    //crear un objeto de la clase que quiero probar
    private UsuarioValidacion validacion;

    //Preparar las pruebas que se van a realizar
    @BeforeEach
    public void configurarPruebas (){
        this.validacion = new UsuarioValidacion();
        System.out.println("Iniciando prueba...");
    }

    //Programar pruebas unitarias
    @Test
    public void validarNombresFuncionaCorrectamente (){
        String nombrePrueba = "Jimena Sepulveda Garcia"; //preparo la funcion
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarNombresFuncionaIncorrectosPorNumerosCaracteres(){
        String nombrePrueba = "Jimena";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarNombresFuncionaIncorrectosPorCaracteresInvalidos (){
        String nombrePrueba = "1234567890";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensaje.NOMBRE_INVALIDO.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarCorreoFuncionaCorrectamente(){
        String correoPrueba = "jimena02sepulveda@gmail.com";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarCorreo(correoPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public  void validarCorreoFuncionaIncorrectosPorFormato(){
        String correoPrueba = "jimena02.com.co";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarCorreo(correoPrueba));
        Assertions.assertEquals(Mensaje.CORREO_INVALIDO.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarUbicacionFuncionaCorrectamente(){
        Integer ubicacionPrueba = 1;
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarUbicacionFuncionaIncorrectamente(){
        Integer ubicacionPrueba = 10;
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertEquals(Mensaje.UBICACION_INVALIDA.getMensaje(),respuesta.getMessage());
    }
}