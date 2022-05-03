package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Leer un nùmero entero y muestre si es mùltiplo: ");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if(num%10==0){
            System.out.println("Si es mùltiplo");


        }else{
            System.out.println("No es mùltiplo");


        }
    }
}
