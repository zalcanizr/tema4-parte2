package com.cice;

public class Libros extends Recursos implements Prestamo{

    private String edicion;
    private String isbn;
    private String autor;

    private boolean prestado;

    public Libros(long fechaPublicacion, String nombre) {

        super(fechaPublicacion, nombre);
    }


    public Libros(long fechaPublicacion, String nombre, String edicion, String isbn, String autor) {
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


    public void devolver() {
        this.prestado=false;
    }


    public void prestar() {
        this.prestado = false;
    }

    public boolean prestado(){

        return this.prestado;
    }
}
