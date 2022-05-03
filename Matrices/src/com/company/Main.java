package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Ingrese la opción de la actividad a realizar: ");
        int op=scanner.nextInt();
        System.out.print("Ingrese la cantidad de filas: ");
        int fil=scanner.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        int colu=scanner.nextInt();
        int mat[][] = llenarMatriz(fil,colu);
        int mat1[][] = llenarMatriz(fil,colu);

        switch (op) {
            case 1 -> {
                System.out.println("Matriz uno");
                mostrar(mat);
                System.out.println("Matriz dos ");

                mostrar(mat1);
                System.out.println("Matriz resultante");

                int mat3[][] = suma(mat, mat1);
            }
            case 2 -> {
                System.out.println("Matriz uno");

                mostrar(mat);
                System.out.println("Matriz dos");

                mostrar(mat1);
                System.out.println("Matriz resultante");

                int mat4[][] = resta(mat, mat1);
            }
        }

    }
    public static int [][] llenarMatriz(int fil, int col){
        Scanner scanner1=new Scanner(System.in);
        int matriz[][]= new int [fil][col];
        int num;
        for(int i=0; i<fil;i++){
            for(int j=0;j<col;j++){
                System.out.print("Ingrese el valor: ["+i +","+j+"] ");
                num=scanner1.nextInt();
                matriz[i][j]=num;

            }
        }
        return matriz;
    }
    public static void mostrar(int matriz [][]){
        for(int i=0; i<matriz.length;i++){
           for(int j=0;j<matriz[0].length;j++){
            System.out.print(matriz[i][j]+"\t");
          }
        System.out.println();
    }
    }

    public static int[][]suma (int matriz1 [][],int matriz2 [][]){
        int m1F = matriz1.length;
        int m1C = matriz1[0].length;
        int m2F = matriz2.length;
        int m2C = matriz2[0].length;

        int sum[][] = new int[m1F][m1C];
        if(m1F == m2F && m1C == m2C){

            for (int i = 0; i < m1F; i++){
                for (int j = 0; j < m1C; j++){
                    sum[i][j] = matriz1[i][j] + matriz2[i][j];
                }
            }

            for (int i = 0; i < m1F; i++){
                for (int j = 0; j < m1C; j++){
                    System.out.print(sum[i][j]+"\t");
                }
                System.out.println();
            }
        }else {
            System.out.println("Las matrices deben tener las mismas dimensiones");
        }
        return sum;
    }

    public static int[][]resta (int matriz1 [][],int matriz2 [][]){
        int m1F = matriz1.length;
        int m1C = matriz1[0].length;
        int m2F = matriz2.length;
        int m2C = matriz2[0].length;

        int res[][] = new int[m1F][m1C];
        if(m1F == m2F && m1C == m2C){

            for (int i = 0; i < m1F; i++){
                for (int j = 0; j < m1C; j++){
                    res[i][j] = matriz1[i][j] - matriz2[i][j];
                }
            }

            for (int i = 0; i < m1F; i++){
                for (int j = 0; j < m1C; j++){
                    System.out.print(res[i][j]+"\t");
                }
                System.out.println();
            }
        }else {
            System.out.println("Las matrices deben tener las mismas dimensiones");
        }
        return res;
    }


}


