package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author gast-n
 */
public class main {

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 09 ===");
        calcularTotalCompra(0,0);
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        Scanner input = new Scanner(System.in);
        double precioFinal = 0;
        System.out.print("Ingrese el peso del producto en kg.: ");
        peso = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        zona = input.nextLine();

        if (zona.equalsIgnoreCase("Nacional")) {
            precioFinal = peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            precioFinal = peso * 10;
        }
        System.out.println("El costo del envio es: "+precioFinal);
        return precioFinal;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        Scanner input = new Scanner(System.in);
        double precioFinal;
        System.out.print("Ingrese el valor del produto: ");
        precioProducto = Integer.parseInt(input.nextLine());
        costoEnvio = calcularCostoEnvio(0, "");
        precioFinal = precioProducto + costoEnvio;
        System.out.println("El total a pagar es: "+precioFinal);
        return precioFinal;
        
    }

}
