package com.cice;

import com.cice.interfaces.IPrestamo;
import com.cice.primer.orden.Publicacion;

public class Libros extends Publicacion implements IPrestamo {

    private String edicion;
    private String isbn;
    private String autor;

    private boolean prestado;

    public Libros(String fechaPublicacion, String nombre) {

        super(fechaPublicacion, nombre);
    }


    public Libros(String fechaPublicacion, String nombre, String edicion, String isbn, String autor) {
        super(fechaPublicacion, nombre);
        this.edicion = edicion;
        this.isbn = isbn;
        this.autor = autor;
        this.prestado=false;
    }



    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
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
        return "Libros{" +
                "nombre='"+getNombre()+'\''+
                "fecha publicacion='"+getFechaPublicacion()+'\''+
                "edicion='" + edicion + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", prestado=" + prestado +
                '}';
    }
}
