package com.cice;

import com.cice.primer.orden.Publicacion;

public class Revistas extends Publicacion {

    private long numero;
    private String periodicidad;

    public Revistas(String fechaPublicacion, String nombre) {
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


    @Override
    public String toString() {
        return "Revistas{" +
                "numero=" + numero +
                ", periodicidad='" + periodicidad + '\'' +
                '}';
    }
}
