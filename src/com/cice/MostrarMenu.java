package com.cice;


import java.util.Scanner;
import java.util.ArrayList;


public class MostrarMenu {


    private Scanner  sc = new Scanner(System.in);
        private int opcion=0;

        public void iniciarApp(){


            do {
                showMenu();
                comprobarOpcion(opcion);

            }while (opcion!=5);

        }


        private void showMenu(){


            System.out.println("==========================");
            System.out.println("1. Numero libros prestados");
            System.out.println("2. Publicaciones anteriores a una fecha");
            System.out.println("3. Listado publicaciones y discos");
            System.out.println("4. Listado publicaciones y discos diferenciado por prestado o no");
            System.out.println("5. Salir del programa");
            System.out.println();
            System.out.println("Elige una opcion: ");
            opcion= sc.nextInt();
            System.out.println("==========================");
        }


        private void comprobarOpcion(int opcion){

            switch (opcion){

                case 1:
                    numeroLibrosPrestados();
                    break;

                case 2:
                    publicacionesAnterioresA();
                    break;

                case 3:
                    listadoPublicacionesDiscos();
                    break;
                case 4:
                    listadoPublicacionesDiscosDiferenciado();
                    break;

                case 5:
                    //salimos del programa
                    break;

                default:
                    System.out.println("La opcion elegida no es valida.");


            }

    }
}
