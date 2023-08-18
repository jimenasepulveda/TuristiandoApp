package org.example.entidades;

import org.example.utilidades.Util;
import org.example.validaciones.LocalValidacion;

public class Local {
    private Integer id;
    private String nit;
    private String nombre;
    private Integer ubicacion;
    private  String descripcion;

    protected LocalValidacion validarLocal = new LocalValidacion();
    protected Util util = new Util();

    public Local() {
    }

    public Local(Integer id, String nit, String nombre, Integer ubicacion, String descripcion) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }


    public Integer getId() {
        return id;
    }

    public void setId() {
        this.id = util.idAleatorio();
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        try {
            this.validarLocal.validarNit(nit);
            this.nit = nit;
        }catch (Exception error){
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try {
            this.validarLocal.validarNombreEmpresa(nombre);
            this.nombre = nombre;
        }catch (Exception error){
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
        }

    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
