package com.cice;

import com.cice.primer.orden.Publicacion;

public class Comics extends Publicacion {

    private long  numero;
    private String coleccion;


    public Comics(String fechaPublicacion, String nombre) {
        super(fechaPublicacion, nombre);
    }

    public Comics(String fechaPublicacion, String nombre, long numero, String coleccion) {
        super(fechaPublicacion, nombre);
        this.numero = numero;
        this.coleccion = coleccion;
    }



    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }
}
