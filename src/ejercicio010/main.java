/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio010;

import java.util.Scanner;

/**
 *
 * @author gast-n
 */
//10.​Actualización de stock a partir de venta y recepción de productos.
//Crea un método actualizarStock(int stockActual, int cantidadVendida,
//int cantidadRecibida), que calcule el nuevo stock después de una venta y
//recepción
//de productos:
//NuevoStock = StockActual − CantidadVendida + CantidadRecibida
//NuevoStock = CantidadVendida + CantidadRecibida
//Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
//cantidad recibida, y muestra el stock actualizado.
//Ejemplo de entrada/salida:
//Ingrese el stock actual del producto: 50
//Ingrese la cantidad vendida: 20
//Ingrese la cantidad recibida: 30
//El nuevo stock del producto es: 60
public class main {

    public static void main(String[] args) {
      actualizarStock(0, 0, 0);

    }

    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        Scanner input = new Scanner(System.in);
        int nuevoStock;
        
        stockActual = stock_actual(0);
        cantidadVendida = cantidad_vendida(0);
        cantidadRecibida = cantidad_recibida(0);
        
        nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        
        System.out.println("La cantidad del producto final es: "+nuevoStock);
        
        return nuevoStock;
        
    }

    static int cantidad_vendida(int cantidad) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de producto vendido: ");
        cantidad = Integer.parseInt(input.nextLine());
        return cantidad;
    }

    static int stock_actual(int cantidad) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el stock actual del producto: ");
        cantidad = Integer.parseInt(input.nextLine());
        return cantidad;
    }

    static int cantidad_recibida(int cantidad) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de producto recibido: ");
        cantidad = Integer.parseInt(input.nextLine());
        return cantidad;
    }
}
