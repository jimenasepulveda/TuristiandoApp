package org.example.entidades;

import org.example.entidades.interfaces.IReporte;
import org.example.validaciones.EntidadCulturalValidacion;

public class EntidadCultural extends Empresa implements IReporte {

    private String nombreSecretaria;
    private String mision;

    protected EntidadCulturalValidacion validar = new EntidadCulturalValidacion();

    public EntidadCultural() {
    }

    @Override
    public boolean cobrar() {
        return false;
    }


    public EntidadCultural(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, String nombreSecretaria, String mision) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.nombreSecretaria = nombreSecretaria;
        this.mision = mision;
    }


    public String getNombreSecretaria() {
        return nombreSecretaria;
    }

    public void setNombreSecretaria(String nombreSecretaria) {
        try {
            this.validar.validarNombreSecretaria(nombreSecretaria);
            this.nombreSecretaria = nombreSecretaria;
        }catch (Exception error) {
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
        }
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        try {
            this.validar.validarMisionSecretaria(mision);
            this.mision = mision;
        }catch (Exception error) {
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
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
