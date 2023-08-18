package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class LocalValidacion {

    protected Util util = new Util();

    public LocalValidacion() {
    }

    public boolean validarNit (String nit) throws Exception{
        if (nit.length() !=10){
            throw new Exception(Mensaje.NIT_INVALIDO.getMensaje());
        } else if (!util.validarExpresionRegular(nit, "\\d{10}")) {
            throw new Exception(Mensaje.NIT_NUMEROS_INVALIDOS.getMensaje());
        }else {
            return true;
        }
    }

    public boolean validarNombreEmpresa (String nombreEmpresa) throws Exception{
        if (nombreEmpresa.length() > 30) {
            throw new Exception(Mensaje.NOMBRE_LOCAL_INVALIDO.getMensaje());
        }else if (!util.validarExpresionRegular(nombreEmpresa, "^[a-zA-Z ]+$")){
            throw new Exception(Mensaje.NOMBRE_LOCAL_CARACTERES_INVALIDOS.getMensaje());
        }else {
            return true;
        }
    }
}
