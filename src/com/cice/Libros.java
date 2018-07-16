package com.cice;

public class Libros extends Recursos{

    private String edicion;
    private long isbn;
    private String autor;


    public Libros(long fechaPublicacion, String nombre) {
        super(fechaPublicacion, nombre);
    }


    public Libros(long fechaPublicacion, String nombre, String edicion, long isbn, String autor) {
        super(fechaPublicacion, nombre);
        this.edicion = edicion;
        this.isbn = isbn;
        this.autor = autor;
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

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }




}
