/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author gast-n

7.​ Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
hasta que ingrese un valor válido.
Ejemplo de entrada/salida:
Ingrese una nota (0-10): 15
Error: Nota inválida. Ingrese una nota entre 0 y 10.
Ingrese una nota (0-10): -2
Error: Nota inválida. Ingrese una nota entre 0 y 10.
Ingrese una nota (0-10): 8
Nota guardada correctamente.
 */
public class main {
    public static void main (String[] args){
        System.out.println("===Ejercicio 07===");
        Scanner input = new Scanner(System.in);
        int nota;
        
        do {
            System.out.print("Ingrese una Nota entre 0 y 10: ");
            nota = Integer.parseInt(input.nextLine());
            if (nota<10 && nota>0){
                //nota = Integer.parseInt(input.nextLine());
                System.out.println("Nota guardada correctamente.");
            }
            else {
                System.out.println("Error, ingrese un numero correcto");
            }
        }
        while (nota<0 | nota>10);
        
    }
    
}
