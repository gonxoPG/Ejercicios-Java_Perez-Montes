package Tablas;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce 5 números");
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Los números introducidos son:");
        for (int i = numeros.length-1; i >= 0; i--) {

            System.out.println(numeros[i]);
        }
    }
}
