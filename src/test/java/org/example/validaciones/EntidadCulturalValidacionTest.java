package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntidadCulturalValidacionTest {

    private EntidadCulturalValidacion validacion;

    @BeforeEach
    public void configurarPruebas(){
        this.validacion = new EntidadCulturalValidacion();
        System.out.println("Iniciando prueba...");
    }

    @Test
    public void validarNombreSecretariaFuncionaCorrectamente(){
       String nombreSecretaria = "regsuisftejo";
       Boolean  respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarNombreSecretaria(nombreSecretaria));
       Assertions.assertTrue(respuesta);
    }


    @Test
    public void validarNombreSecretariaFuncionaIncorrectamenteMayor70(){
        String nombreSecretaria = "khugghgujhigutgdrtfdghhihfffffffffffffffffffffffffffffffffffffffffffffffffff" +
                "fffdfsrgevdrgervnjfvnejfrvnejfvheirvkjeikhvfffffffffff";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarNombreSecretaria(nombreSecretaria));
        Assertions.assertEquals(Mensaje.NOMBRE_SECRETARIA_INVALIDO_70.getMensaje(), respuesta.getMessage());
    }


    @Test
    public void validarNombreSecretariaFuncionaIncorrectamenteMenor10(){
        String nombreSecretaria = "yhdhtge";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarNombreSecretaria(nombreSecretaria));
        Assertions.assertEquals(Mensaje.NOMBRE_SECRETARIA_INVALIDO_10.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarMisionSecretariaFuncionaCorrectamente(){
        String Mision = "regsuisftejo";
        Boolean  respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarMisionSecretaria(Mision));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarMisionSecretariaFuncionaIncorrectamenteMayor70(){
        String Mision = "khugghgujhigutgdrtfdghhihfffffffffffffffffffffffffffffffffffffffffffffffffff" +
                "fffdfsrgevdrgervnjfvnejfrvnejfvheirvkjeikhvfffffffffff";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarMisionSecretaria(Mision));
        Assertions.assertEquals(Mensaje.NOMBRE_SECRETARIA_INVALIDO_70.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarMisionSecretariaFuncionaIncorrectamenteMenor10(){
        String Mision = "yhdhtge";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarMisionSecretaria(Mision));
        Assertions.assertEquals(Mensaje.NOMBRE_SECRETARIA_INVALIDO_10.getMensaje(), respuesta.getMessage());
    }
}