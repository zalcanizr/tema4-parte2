package com.cice;

public class Comics extends Recursos{

    private double numero;
    private String coleccion;


    public Comics(long fechaPublicacion, String nombre) {
        super(fechaPublicacion, nombre);
    }

    public Comics(long fechaPublicacion, String nombre, double numero, String coleccion) {
        super(fechaPublicacion, nombre);
        this.numero = numero;
        this.coleccion = coleccion;
    }

    @Override
    public long getFechaPublicacion() {
        return super.getFechaPublicacion();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setFechaPublicacion(long fechaPublicacion) {
        super.setFechaPublicacion(fechaPublicacion);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }
}
