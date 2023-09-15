package org.example.validaciones;

import org.example.utilidades.Mensaje;

public class AfiliadoValidacion {

    //ValidarCostoMensualidad
    public Boolean ValidarCostoMensualidad (Integer costoMensualidad) throws  Exception{
        if (costoMensualidad < 0){
            throw new Exception(Mensaje.COSTO_PERSONA_INVALIDO.getMensaje());
        }else {
            return true;
        }
    }


    //No puede ser mayor a 100.000
}
