package org.example.utilidades;


import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
    public boolean validarExpresionRegular(String cadena, String expresionregular){
        Pattern patron = Pattern.compile(expresionregular);
        Matcher coincidencia = patron.matcher(cadena);
        if (coincidencia.matches()){
            return true;
        }else {
            return false;
        }
    }

    public Integer idAleatorio(){
        Integer idAleatrio = (int) (Math.random() * 501);
        return idAleatrio;
    }

    public DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
}