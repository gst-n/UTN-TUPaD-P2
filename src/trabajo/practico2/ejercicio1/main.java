/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico2.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author gast-n
 */
public class main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 1 ===");
        int anio;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        anio = Integer.parseInt(input.nextLine());
        
        if(anio % 2 ==0 & anio%100!=0){
            System.out.println("El año: " + anio + " es Bisiesto");
        }
        else if (anio < 0){
            System.out.println("Ingrese un año correcto");
        }
        else{
            System.out.println("El año: "+ anio+ " no es Bisiesto");
        }
        
    }
    
}
