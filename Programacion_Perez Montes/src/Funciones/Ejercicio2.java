package Funciones;

import java.util.Scanner;

public class Ejercicio2 {

    static void numeroMaximo(int a, int b){
        if (a>b){
            System.out.println("El mayor número es el "+a);
        }else{
            System.out.println("El mayor número es el "+b);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos números para saber cuál es mayor");
        numeroMaximo(teclado.nextInt(), teclado.nextInt());
    }
}
