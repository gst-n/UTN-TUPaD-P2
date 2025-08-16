/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author gast-n
 * 
 * 4. Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y
su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el
precio final
Ejemplo de entrada/salida:
Ingrese el precio del producto: 1000
Ingrese la categoría del producto (A, B o C): B
Descuento aplicado: 15%
Precio final: 850.0
* 
* 
 */
public class main {
    public static void main (String[] args){
        String categoria;
        double precio;
        System.out.println("--EJERCICIO 04--");
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la categoria del producto(A, B, C): ");
        categoria = input.nextLine();
        
        if (categoria.equalsIgnoreCase("A")){
            precio = precio - ((precio*10)/100);
            System.out.println("La categoria ingresada fue:"+categoria+" y el precio final es: "+precio);
        }
        if (categoria.equalsIgnoreCase("B")){
            precio = precio - ((precio*15)/100);
            System.out.println("La categoria ingresada fue:"+categoria+" y el precio final es: "+precio);
        }
        if (categoria.equalsIgnoreCase("C")){
            precio = precio - ((precio*20)/100);
            System.out.println("La categoria ingresada fue:"+categoria+" y el precio final es: "+precio);
        }
        
    }
    
}
