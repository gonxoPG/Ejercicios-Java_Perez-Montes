package Funciones;

import java.util.Scanner;

public class Ejercicio1 {

    public static void mensaje (int N){
        for (int i = 0; i < N; i++) {
            System.out.println("Módulo ejecutándose");
        }
    }

    public static void main(String[] args) { //el public no haría falta estrictamente
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántas veces quieres que se repita el mensaje?");
        mensaje(scanner.nextInt());
    }
}
