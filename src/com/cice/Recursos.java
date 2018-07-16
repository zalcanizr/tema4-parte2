package com.cice;



public class Recursos {


    private long fechaPublicacion;
    private String nombre;

    public Recursos(long fechaPublicacion, String nombre) {
        this.fechaPublicacion = fechaPublicacion;
        this.nombre = nombre;
    }

    
    public long getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(long fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
