/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

/**
 Crear un programa que calcule la suma y el promedio de los números pares ingresados
Este programa permite al usuario ingresar varios números y calcula la suma y el promedio de los números que son pares

 */
import java.util.Scanner;
public class Ejercicio03 {
     public static void main(String[] args) {
        double promedio;
        int suma = 0;
        int contadorPares = 0;
        int numero;
        char respuesta;
        Scanner lectura = new Scanner(System.in);

        do {
            System.out.print("Ingresa un numero: ");
            numero = lectura.nextInt();
            
            if (numero % 2 == 0) {
                suma += numero;
                contadorPares++;
            }
            
            System.out.print("¿Deseas ingresar otro numero? (s/n): ");
            respuesta = lectura.next().charAt(0);
        } while (respuesta == 's' || respuesta == 'S');
        
        if (contadorPares > 0) {
             promedio =  suma / contadorPares;
            System.out.println("Suma de los numeros pares: " + suma);
            System.out.println("Promedio de los numeros pares: " + promedio);
        } else {
            System.out.println("No se ingresaron numeros pares.");
        }
    }
    
}
