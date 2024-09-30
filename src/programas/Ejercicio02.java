/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

/**
 - Crear un programa que cuente cuántos números son positivos, negativos o ceros
Este programa permite al usuario ingresar varios números y luego cuenta cuántos son positivos, negativos o ceros.

 */
import java.util.Scanner;
public class Ejercicio02 {public static void main(String[] args) {
        
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        double numero;
        char respuesta;
        Scanner lectura = new Scanner(System.in);

        do {
            System.out.print("Ingresa un número: ");
            numero = lectura.nextDouble();
            
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
            
            System.out.print("¿Deseas ingresar otro número? (s/n): ");
            respuesta = lectura.next().charAt(0);
        } while (respuesta == 's' || respuesta == 'S');
        
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
    
}
