package org.example.entidades.interfaces;

public interface IReporte {
    void generarReporte();
    void editarReporte(Integer id, String datosNuevos);
    void buscarReporte(Integer id);
}
