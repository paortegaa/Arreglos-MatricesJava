package com.company;

import java.sql.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Coloca el tamaño de tu arreglo: ");
        //Se declara el tamaño del arreglo demanera dinamica al recibir el valor por teclado
        Scanner val = new Scanner (System.in);
        //El elemento que se coloca se convierte en un tipo de dato entero.
        int valor=val.nextInt();
        //Dicha variable se coloca en la instancia del arreglo
        String valores []= new String[valor];
        //Se lee el valor a leer con Scanner
        Scanner nom=new Scanner(System.in);
        String nombre1;
        for(int i=0; i<valores.length;i++){
            System.out.println("Coloca el nombre: ");
            nombre1=nom .next();
            valores[i]=nombre1;

        }
        System.out.println("Los valores del arreglo son: ");

        for(int i =0;i<valores.length;i++){
            System.out.println(valores[i]);
        }


        /*
        //Declaración del arreglo tipo String
        String nombres []= {"Paola", "Alba", "Rocio", "Adair","Jose","Pedro","Maria","Juan","Adrian"} ;
        int numeros[]={1,2,3,4,5,6,7,8,9};

        Se obtienen los valores de la siguiente forma pero está es ineficiente.
        System.out.println(nombres[0]);
        Para ello se tiene
        for(int i=0; i< nombres.length;i++){
            System.out.println("Valor de: "+i+" "+nombres[i]);
        }*/


    }
}
