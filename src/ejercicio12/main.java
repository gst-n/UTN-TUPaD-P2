/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author gast-n 12.​ Modificación de un array de precios y visualización de
 * resultados. 
 * Crea un programa que: 
 * a. Declare e inicialice un array con los precios de algunos productos. 
 * b.​Muestre los valores originales de los precios. 
 * c.​Modifique el precio de un producto específico. 
 * d.​Muestre los valores modificados. 
 * Salida esperada: 
 * Precios originales: 
 * Precio: $199.99
 * Precio: $299.5 
 * Precio: $149.75 
 * Precio: $399.0 
 * Precio: $89.99 
 * Precios modificados: 
 * Precio: $199.99 
 * Precio: $299.5 
 * Precio: $129.99 
 * Precio: $399.0
 * Precio: $89.99
 */
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===Ejercicio 12===");
        
        //micro menu para eleccion de caminos
        double[] listaOriginal = listaPreciosOriginales(0, 0);

        System.out.print("Desea modificar la lista?, presione 1 para continuar, o 0 para salir: ");
        int opcion = Integer.parseInt(input.nextLine());
        //operador switch en base a la eleccion del usuario
        switch (opcion) {
            case 1: //lista a modificar 
                double[] nuevosPrecios = preciosModificados(listaOriginal);
                System.out.println("Los precios Originales son:");
                for (int i = 0; i < listaOriginal.length; i++) {
                    System.out.println(i+1+" - precio: "+listaOriginal[i]);
                }
                System.out.println("Los Nuevos precios son: ");
                for (int i = 0; i < nuevosPrecios.length; i++) {
                    System.out.println(i+1+" - precio: "+ nuevosPrecios[i]);
                }
                break;
            case 0:
                System.out.println("Los precios Originales son:");
                for (int i = 0; i < listaOriginal.length; i++) {
                    System.out.println(i+1+" - precio: "+listaOriginal[i]);
                }
                break;
            default:
                throw new AssertionError();
        }
        //fin estructura
        

    }
    
    static double[] listaPreciosOriginales(double precio,int longitud){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la longitud de la lista de precios: ");
        longitud = Integer.parseInt(input.nextLine());
        //variable lista original
        double[] listaPrecios = new double[longitud];
        for (int i = 0; i < listaPrecios.length; i++) {
            int posicion = i+1;
            System.out.print("Ingrese el valor del producto "+"en la posicion -"+posicion+" : ");
            precio = Double.parseDouble(input.nextLine());
            listaPrecios[i]=precio;
        }
        return listaPrecios;
        
    }
    
    static double[] preciosModificados(double[] lista){
        Scanner inp = new Scanner(System.in);
        double[] listaCopia = new double[lista.length];  
        for (int i = 0; i < lista.length; i++) {
            listaCopia[i] = lista[i];
        }
        
        System.out.println("Ingrese la posición("+lista.length+") que quiere modificar: ");
        int nuevaPosición = Integer.parseInt(inp.nextLine());
        nuevaPosición -=1;
        System.out.println("Seleccione un nuevo valor para la posición "+lista.length+": ");
        double nuevoValor = Double.parseDouble(inp.nextLine());
        listaCopia[nuevaPosición] = nuevoValor;
        return listaCopia;
    }
}
    
