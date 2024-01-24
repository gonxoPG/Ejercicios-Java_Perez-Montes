package Funciones;

import java.util.Scanner;

public class Ejercicio5 {

    static void maximo (int a, int b){
        //introduce dos variables int mayor, menor porque desconocemos el orden en el que el usuario lo dará
        // con un If seleccionar el mayor o el menor para que encagen bien en el fori

        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos números para saber los números que comprenden entre ellos");
        maximo(teclado.nextInt(), teclado.nextInt());
    }
}
