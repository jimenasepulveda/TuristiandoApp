package org.example.validaciones;

import org.example.utilidades.Mensaje;

public class OcacionalValidacion {
    public Boolean validarvalorEvento (Integer valorEvento) throws Exception{
        if (valorEvento < 0){
            throw new Exception(Mensaje.COSTO_PERSONA_INVALIDO.getMensaje());
        }else {
            return true;
        }
    }


    //No puede ser mayor a 200.000
}
