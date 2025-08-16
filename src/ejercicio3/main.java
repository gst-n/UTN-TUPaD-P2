/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author gast-n
 * 
 * 
 * 3. Clasificación de Edad.
Escribe un programa en Java que solicite al usuario su edad y clasifique su
etapa de vida según la siguiente tabla:
Menor de 12 años: "Niño"
Entre 12 y 17 años: "Adolescente"
Entre 18 y 59 años: "Adulto"
60 años o más: "Adulto mayor"
Ejemplo de entrada/salida:
Ingrese su edad: 25
Eres un Adulto.
Ingrese su edad: 10
 */
public class main {
    public static void main(String[] args) {
        System.out.println("-- EJERCICIO 03 --");   
        Scanner input = new Scanner(System.in);
        int edad;
        
        System.out.print("Ingrese su edad por favor: ");
        edad = Integer.parseInt(input.nextLine());
        if (edad < 12){
            System.out.println("Eres un Niño");
        }
        
        if (edad > 12 & edad < 17){
            System.out.println("Eres un Adolescente");
        }
        
        if (edad > 18 & edad < 59){
            System.out.println("Eres un adulto");
        }
        if (edad > 60){
            System.out.println("Eres un adulto mayor");
        }
    }
        
    
}
