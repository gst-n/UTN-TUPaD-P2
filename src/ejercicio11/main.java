/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author gast-n
 */

//11.​Cálculo de descuento especial usando variable global.
//Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
//método calcularDescuentoEspecial(double precio) que use la variable global para
//calcular el descuento especial del 10%.
//Dentro del método, declara una variable local descuentoAplicado, almacena
//el valor del descuento y muestra el precio final con descuento.
//Ejemplo de entrada/salida:
//Ingrese el precio del producto: 200
//El descuento especial aplicado es: 20.0
//El precio final con descuento es: 180.0

public class main {
    
    public static final double descuentoEspecial = 0.10;
    public static void main(String[] args){
        System.out.println("===Ejercicio 11 ===");
        System.out.println("Inicio");
        
        //en la variable p guardamos el returno del metodo calculadoraPrecioProducto
        double p = calculadoraPecioProducto(0.0);
        
        //llamamos al metodo que calcula el despunto y 
        //le pasamos como argumento el precio guardado en la variable p.
        double pde = calcularDescuentoEspecial(p);
        //al resultado lo almaceno en la variable pde y lo muestro con println
        System.out.println("El precio final del producto es: "+pde);
        
        
    }
    
    static double calcularDescuentoEspecial(double precio){    
        double precioConDescuento = precio - (descuentoEspecial * precio);
        System.out.println("El descuento aplicado es del: "+descuentoEspecial*100+" % o de: "+ descuentoEspecial*precio);
        return precioConDescuento;
    }
    
    //metodo para recibir el precio inicial y enviarlo 
    static double calculadoraPecioProducto (double precio){   
        Scanner input = new Scanner(System.in);
        //
        System.out.print("Ingrese el precio del producto: ");
        precio = Integer.parseInt(input.nextLine());
        
        
        return precio;
        
    }
    
    
    
}
