package Funciones;

import java.util.Scanner;

public class Ejercicio6 {

    static int valor ( int a){
        int valor = a*2;

        return valor;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un valor para saber su doble");
        System.out.println(valor(teclado.nextInt()));
    }
}
