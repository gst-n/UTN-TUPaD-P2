package ejercicio5;

import java.util.Scanner;

/**
 * @author gast-n
 *
 * 5. Suma de Números Pares (while). Escribe un programa que solicite números al
 * usuario y sume solo los números pares. El ciclo debe continuar hasta que el
 * usuario ingrese el número 0, momento en el que se debe mostrar la suma total
 * de los pares ingresados. Ejemplo de entrada/salida: Ingrese un número (0 para
 * terminar): 4 Ingrese un número (0 para terminar): 7 Ingrese un número (0 para
 * terminar): 2 Ingrese un número (0 para terminar): 0 La suma de los números
 * pares es: 6
 *
 *
 */
public class main {

    public static void main(String[] args) {
        System.out.println("===EJERCICIO 05===");
        Scanner input = new Scanner(System.in);
        int numero;
        int suma = 0;
        System.out.println("Ingrese un numeros pares para sumarlos entre si o ingrese 0 para terminar: ");
        numero = Integer.parseInt(input.nextLine());
        while (numero != 0) {
            if (numero % 2 == 0) {
                suma = suma + numero;
            }
        System.out.println("Ingrese un numeros pares para sumarlos entre si o ingrese 0 para terminar:  ");
        numero = Integer.parseInt(input.nextLine());
        }
        System.out.println("El total de la suma es: " + suma);
    }

}
