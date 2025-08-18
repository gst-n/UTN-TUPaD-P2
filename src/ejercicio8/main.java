package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author gast-n
 *
 * 8.​ Cálculo del Precio Final con impuesto y descuento. Crea un método
 * calcularPrecioFinal(double impuesto, double descuento) que calcule el precio
 * final de un producto en un e-commerce. La fórmula es: PrecioFinal =
 * PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) PrecioFinal =
 * PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
 * Desde main(), solicita el precio base del producto, el porcentaje de impuesto
 * y el porcentaje de descuento, llama al método y muestra el precio final.
 * Ejemplo de entrada/salida: Ingrese el precio base del producto: 100 Ingrese
 * el impuesto en porcentaje (Ejemplo: 10 para 10%): 10 Ingrese el descuento en
 * porcentaje (Ejemplo: 5 para 5%): 5 El precio final del producto es: 105.0
 *
 */
public class main {

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 08 ===");
        System.out.println("Inicio del programa.");
        calcularPrecioFinal(100,10,5);
    }

    static double calcularPrecioFinal(double precio, double impuesto, double descuento) {
        Scanner input = new Scanner(System.in);
        double precioFinal;
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el porcentaje% del impuesto del producto: ");
        impuesto = Double.parseDouble(input.nextLine());
        impuesto = precio * impuesto / 100;

        System.out.print("Ingrese el porcentaje% de descuento del producto: ");
        descuento = Double.parseDouble(input.nextLine());
        descuento = precio * descuento / 100;
        precioFinal = precio + impuesto - descuento;

        System.out.println("El precio final es de: " + precioFinal);
        return precioFinal;
    }
}
