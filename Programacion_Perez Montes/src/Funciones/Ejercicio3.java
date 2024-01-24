package Funciones;

import java.util.Scanner;

public class Ejercicio3 {

    static void numeroMaximo(int a, int b, int c){
        if (a>b && a>c){
            System.out.println("El mayor número es el "+a);
        }else if (b>a && b>c){
            System.out.println("El mayor número es el "+b);
        }else {
            System.out.println("El mayor número es el "+c);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tres números para saber cuál es mayor");
        numeroMaximo(teclado.nextInt(), teclado.nextInt(), teclado.nextInt());
    }
}
