package com.locampocam;

import java.util.Scanner;

public class Conversor {

    public static void ejecutarMenu() throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Conversor de Monedas =====");
            System.out.println("1) USD → ARS");
            System.out.println("2) ARS → USD");
            System.out.println("3) USD → BRL");
            System.out.println("4) BRL → USD");
            System.out.println("5) USD → COP");
            System.out.println("6) COP → USD");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();

            if (opcion == 7) {
                System.out.println("Gracias por usar el conversor.");
                break;
            }

            System.out.print("Ingrese el valor a convertir: ");
            double valor = sc.nextDouble();

            ProcesadorDeMoneda.convertir(opcion, valor);
        }
    }
}
