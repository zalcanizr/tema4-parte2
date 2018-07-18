package com.cice;

import java.util.ArrayList;
import java.util.List;

import com.cice.interfaces.IPrestamo;
import com.cice.primer.orden.Recurso;
import com.cice.Disco;
import com.cice.Libros;

public class Main {

    public static void main(String[] args) {
	// write your code here

    List<Recurso> lista=new ArrayList<>();
    List<Boolean> listaStatus= new ArrayList<>();

    Disco disco=new Disco("Disco", "CD","60","wzrner","melendi",true);

    listaStatus.add(disco.prestar());

    lista.add(disco);
    lista.add(new Comics("enero/18","Antman",21,"Marvel"));
    lista.add(new Libros("1641","El Quijote","de bolsillo","isbn","Miguel de Cervantes Saavedra"));

    for (Recurso recurso:lista){


/*        IPrestamo prestamo=(IPrestamo) recurso;
        if(prestamo.prestado())
        {
            System.out.println(prestamo.toString());
        }
        else{
            System.out.println(prestamo.toString());
        }
*/

        if (recurso instanceof IPrestamo){

            if(((IPrestamo) recurso).prestado()){
                System.out.println(recurso.toString());
            }
            else{
                System.out.println(recurso.toString());
            }
        }else{
            System.out.println(recurso.toString());
        }
    }

    }
}
