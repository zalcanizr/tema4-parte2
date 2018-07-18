package com.cice;

public class Disco extends Multimedia{

    private boolean prestado;

    public Disco(String titulo, double formato, double duracion) {
        super(titulo, formato, duracion);
    }

    public Disco(String titulo, double formato, double duracion, boolean prestado) {
        super(titulo, formato, duracion);
        this.prestado = prestado;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}
