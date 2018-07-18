package com.cice;

public class Multimedia {

    private String titulo;
    private double formato;
    private double duracion;


    public Multimedia(String titulo, double formato, double duracion) {
        this.titulo = titulo;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getFormato() {
        return formato;
    }

    public void setFormato(double formato) {
        this.formato = formato;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
