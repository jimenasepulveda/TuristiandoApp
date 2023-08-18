package org.example.entidades;

import org.example.utilidades.Util;
import org.example.validaciones.OfertaValidacion;

import java.time.LocalDate;

public class Oferta {
    private Integer id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double costoPersona;
    private  Local local;

    protected OfertaValidacion validarOferta = new OfertaValidacion();
    protected Util util = new Util();

    public Oferta() {
    }

    public Oferta(Integer id, String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, Double costoPersona, Local local) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoPersona = costoPersona;
        this.local = local;
    }


    public Integer getId() {
        return id;
    }

    public void setId() {
        this.id = util.idAleatorio();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        try {
            this.validarOferta.valiadarTitulo(titulo);
            this.titulo = titulo;
        }catch (Exception error){
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        try {
            this.validarOferta.validarFormatoFechas(fechaInicio);
            this.fechaInicio = LocalDate.parse(fechaInicio, util.formatter);

        }catch (Exception error){
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
        }
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        try {
            this.validarOferta.validarFormatoFechas(fechaFin);
            this.validarOferta.validarFechas(getFechaInicio(), LocalDate.parse(fechaFin
            ,util.formatter));
            this.fechaFin = LocalDate.parse(fechaFin,util.formatter);
        }catch (Exception error){
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
        }
    }

    public Double getCostoPersona() {
        return costoPersona;
    }

    public void setCostoPersona(Double costoPersona) {
        try {
            this.validarOferta.validarCostoPersona(costoPersona);
            this.costoPersona = costoPersona;
        }catch (Exception error){
            System.out.println("\u001B[31m" + error.getMessage() + "\u001B[0m");
        }
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
