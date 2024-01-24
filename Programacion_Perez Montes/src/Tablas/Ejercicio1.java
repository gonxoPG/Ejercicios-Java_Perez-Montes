package Tablas;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce 5 números");
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Los números introducidos son:");
        for (int item :numeros) {
            System.out.print(item+" ");
        }
    }
}
