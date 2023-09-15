package org.example.validaciones;

import org.example.utilidades.Mensaje;

public class EmpresaPrivadaValidacion {

    public EmpresaPrivadaValidacion() {
    }

    public boolean ValidarnombreRepresentanteLegal (String nombreSecretaria) throws Exception{
        if (nombreSecretaria.length() > 70 ){
            throw new Exception(Mensaje.NOMBRE_SECRETARIA_INVALIDO_70.getMensaje());
        }else if (nombreSecretaria.length() < 10){
            throw new Exception(Mensaje.NOMBRE_SECRETARIA_INVALIDO_10.getMensaje());
        }else {
            return true;
        }
    }
}
