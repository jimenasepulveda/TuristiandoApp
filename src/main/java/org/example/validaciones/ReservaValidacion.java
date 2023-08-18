package org.example.validaciones;

import org.example.utilidades.Util;

import java.time.LocalDate;

public class ReservaValidacion {

    protected Util util = new Util();

    public ReservaValidacion() {
    }

    public boolean validarFormatoFecha(String fecha) throws Exception{
        if (!util.validarExpresionRegular(fecha, "\\b(\\d{2})/(\\d{2})/(\\d{4})\\b")){
            throw new Exception("La fecha tiene que tener el formato 'dd/MM/yyyy'.");
        }else {
            return true;
        }
    }

    public boolean validarNumeroPersonas (Integer numeroPersonas) throws  Exception{
        if (numeroPersonas > 4){
            throw new Exception("El número de personas por reserva no puede ser mayor a 4.");
        }else {
            return true;
        }
    }
}
