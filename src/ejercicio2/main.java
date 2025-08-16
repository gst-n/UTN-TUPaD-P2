/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author gast-n
 * 
 * 2. Determinar el Mayor de Tres Números.
Escribe un programa en Java que pida al usuario tres números enteros y
determine cuál es el mayor.
Ejemplo de entrada/salida:
Ingrese el primer número: 8
Ingrese el segundo número: 12
Ingrese el tercer número: 5
El mayor es: 12
* 
 */
public class main {
        public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=== EJERCICIO 2 ===");
            Scanner input = new Scanner(System.in);
            int num1, num2;
            System.out.print("Ingrese un numero entero: ");
            num1 = Integer.parseInt(input.nextLine());
            System.out.print("Ingrese otro numero entero: ");
            num2 = Integer.parseInt(input.nextLine());
            
            if (num1 < num2){
                System.out.println(num2 + " es Mayor que "+ num1);
            }
            else if(num1>num2){
                System.out.println(num1 + " es Mayor que "+num2);
            }
            else{
                System.out.println("Los numeros ingresados son iguales: "+ num1 +" y " + num2);
            }
            
        
    }
    
}
