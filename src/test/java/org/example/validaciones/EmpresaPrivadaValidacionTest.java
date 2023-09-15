package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaPrivadaValidacionTest {

    private  EmpresaPrivadaValidacion validacion;


    @BeforeEach
    public void configurarPruebas(){
        this.validacion = new EmpresaPrivadaValidacion();
        System.out.println("Iniciando prueba...");
    }

    @Test
    public void ValidarnombreRepresentanteLegalFuncionaCorrectamente(){
        String nombre = "Jimena Sepulveda Garcia";
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.ValidarnombreRepresentanteLegal(nombre));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void ValidarnombreRepresentanteLegalFuncionaIncorrectamenteMayor70(){
        String nombreRepresentante = "jidefdvdfvbwhbcshcbujchnfjvhbdjd fdjfbvshnvfbdhkfnvbdlfkjdfñvjndffh" +
                "jdbbdcshsdjcbskhfbvsjvsvsbhvbhkfvshvdfhksvfkksvhsvkshvbgvsdgcvsgb gbvgvshdfvbhvhbhsdbhsdfv";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.validacion.ValidarnombreRepresentanteLegal(nombreRepresentante));
        Assertions.assertEquals(Mensaje.NOMBRE_SECRETARIA_INVALIDO_70.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void ValidarnombreRepresentanteLegalFuncionaIncorrectamenteMenor10(){
        String nombre = "hsduhef";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.validacion.ValidarnombreRepresentanteLegal(nombre));
        Assertions.assertEquals(Mensaje.NOMBRE_SECRETARIA_INVALIDO_10.getMensaje(), respuesta.getMessage());
    }
}