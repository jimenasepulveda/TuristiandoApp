package org.example.entidades;

import org.example.entidades.interfaces.IReporte;
import org.example.validaciones.AfiliadoValidacion;

public class Afiliado extends Usuario implements IReporte {
    private Integer valorMensualidad;
    private AfiliadoValidacion validacion = new AfiliadoValidacion();
    public Afiliado() {
    }

    @Override
    public Boolean registar() {
        return null;
    }

    public Afiliado(Integer id, String documento, String nombres, String correo, Integer ubicacion, Integer valorMensualidad) {
        super(id, documento, nombres, correo, ubicacion);
        this.valorMensualidad = valorMensualidad;
    }


    public Integer getValorMensualidad() {
        return valorMensualidad;
    }

    public void setValorMensualidad(Integer valorMensualidad) {
        try {
            this.validacion.ValidarCostoMensualidad(valorMensualidad);
            this.valorMensualidad = valorMensualidad;
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
