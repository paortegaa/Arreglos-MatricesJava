package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Coloca el tamaño de tu arreglo: ");
        Scanner val = new Scanner(System.in);
        int valor = val.nextInt();
        int valores[] = new int[valor];


        for (int i = 0; i < valores.length; i++) {
            int num = (int) (Math.random() * 100);
            valores[i] = num;

        }


        for(int j = 0;j<valores.length;j++){
            System.out.println("El valor de["+j +"]es ="+valores[j]);

        }
}
}






