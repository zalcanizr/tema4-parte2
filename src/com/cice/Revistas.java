package com.cice;

public class Revistas extends Recursos{

    private long numero;
    private String periodicidad;

    public Revistas(long fechaPublicacion, String nombre) {
        super(fechaPublicacion, nombre);
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }



}
