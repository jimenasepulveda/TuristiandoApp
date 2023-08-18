package org.example.utilidades;

public enum Mensaje {
    NUMERO_CARACTERES_INVALIDO("El numero de caracteres es invalido"),
    NOMBRE_INVALIDO("El nombre contiene caracteres no permitidos."),
    CORREO_INVALIDO("El correo electrónico no es válido."),
    UBICACION_INVALIDA("La ubicación no es válida, solo puede ser un numero entre 1 y 4"),


    NIT_INVALIDO("El NIT debe tener exactamente 10 dígitos."),
    NIT_NUMEROS_INVALIDOS("El NIT solo puede contener números."),
    NOMBRE_LOCAL_INVALIDO("El nombre no puede sobrepasar los 30 caracteres."),
    NOMBRE_LOCAL_CARACTERES_INVALIDOS("El nombre contiene caracteres no permitidos."),


    TITULO_INVALIDO_LOCAL("El título de la oferta no puede sobrepasar los 20 caracteres."),
    FECHA_INVALIDA("La fecha de inicio no puede ser mayor que la fecha de fin."),
    FORMATO_FECHA_INVALIDO("La fecha tiene que tener el formato 'dd/MM/yyyy'..."),
    COSTO_PERSONA_INVALIDO("El costo por persona no puede ser negativo.");






    private  String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
