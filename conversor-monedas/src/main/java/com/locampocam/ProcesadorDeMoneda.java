package com.locampocam;

public class ProcesadorDeMoneda {

    public static void convertir(int opcion, double valor) throws Exception {

        String base = "";
        String destino = "";

        switch (opcion) {
            case 1 -> { base = "USD"; destino = "ARS"; }
            case 2 -> { base = "ARS"; destino = "USD"; }
            case 3 -> { base = "USD"; destino = "BRL"; }
            case 4 -> { base = "BRL"; destino = "USD"; }
            case 5 -> { base = "USD"; destino = "COP"; }
            case 6 -> { base = "COP"; destino = "USD"; }
            default -> {
                System.out.println("Opción inválida");
                return;
            }
        }

        double tasa = ServicioExchangeRate.obtenerTasa(base, destino);
        double convertido = valor * tasa;

        System.out.println("\n" + valor + " " + base + " equivalen a " + convertido + " " + destino);
    }
}
