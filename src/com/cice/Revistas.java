package com.cice;

public class Revistas extends Recursos{

    private double numero;
    private String periodicidad;





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

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }



}
