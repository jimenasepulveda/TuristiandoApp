package org.example.entidades;

import org.example.entidades.interfaces.IReporte;
import org.example.validaciones.EmpresaPrivadaValidacion;

public class EmpresaPrivada extends Empresa implements IReporte {
    public  String nombreRepresentanteLegal;

    protected EmpresaPrivadaValidacion validar = new EmpresaPrivadaValidacion();

    public EmpresaPrivada() {
    }

    @Override
    public boolean cobrar() {
        return false;
    }


    public EmpresaPrivada(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, String nombreRepresentanteLegal) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.nombreRepresentanteLegal = nombreRepresentanteLegal;
    }

    public String getNombreRepresentanteLegal() {
        return nombreRepresentanteLegal;
    }

    public void setNombreRepresentanteLegal(String nombreRepresentanteLegal) {
        try {
            this.validar.ValidarnombreRepresentanteLegal(nombreRepresentanteLegal);
            this.nombreRepresentanteLegal = nombreRepresentanteLegal;
        }catch (Exception e) {
            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
        }
    }

    @Override
    public void generarReporte() {

    }

    @Override
    public void editarReporte(Integer id, String datosNuevos) {

    }

    @Override
    public void buscarReporte(Integer id) {

    }
}
