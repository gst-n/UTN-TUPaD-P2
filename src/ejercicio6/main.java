/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author gast-n
 * 
 * 
6.​ Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y
cuente cuántos son positivos, negativos y cuántos son ceros.
Ejemplo de entrada/salida:
Ingrese el número 1: -5
Ingrese el número 2: 3
Ingrese el número 3: 0
Ingrese el número 4: -1
Ingrese el número 5: 6
Ingrese el número 6: 0
Ingrese el número 7: 9
Ingrese el número 8: -3
Ingrese el número 9: 4
Ingrese el número 10: -8
Resultados:
Positivos: 4
Negativos: 4
Ceros: 2
 */
public class main {
    public static void main (String[] args){
        System.out.println("===Ejercicio 06===");
        Scanner input = new Scanner(System.in);
        int numero, negativos=0, positivos=0, ceros=0;
        
        for (int i=10; i>0; i-- ){
            System.out.print("Ingrese un numero entero: ");
            numero = Integer.parseInt(input.nextLine());
            if (numero<0){
                negativos++;
            }
            else if (numero > 0){
                positivos++;
            }
            else{
                ceros++;
            }
        }
        System.out.println("Positivos: "+positivos+"\nNegativos: "+negativos+"\nCeros: "+ceros);
        
    }
    
}
