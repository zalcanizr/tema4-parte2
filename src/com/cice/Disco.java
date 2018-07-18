package com.cice;

import com.cice.interfaces.IPrestamo;
import com.cice.primer.orden.Multimedia;

public class Disco extends Multimedia implements IPrestamo{

    private String selloDiscografico;
    private String artista;


    private boolean prestado;



    public Disco() {
    }


    public Disco(String titulo, String formato, String duracion, String selloDiscografico, String artista, boolean prestado) {
        super(titulo, formato, duracion);
        this.selloDiscografico = selloDiscografico;
        this.artista = artista;
        this.prestado = prestado;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;

    }

    public String getSelloDiscografico() {
        return selloDiscografico;
    }

    public void setSelloDiscografico(String selloDiscografico) {
        this.selloDiscografico = selloDiscografico;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public boolean prestar() {
        if (isPrestado()){
            return false;
        }
        else {
            this.prestado = true;
            return true;
        }
    }

    @Override
    public boolean devolver() {
        if (isPrestado()){
            this.prestado=false;
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public boolean prestado() {
        return this.prestado;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "titulo='"+getArtista()+'\''+
                "formato='"+getFormato()+'\''+
                "duracion='"+getDuracion()+'\''+
                "selloDiscografico='" + selloDiscografico + '\'' +
                ", artista='" + artista + '\'' +
                ", prestado=" + prestado +
                '}';
    }
}
