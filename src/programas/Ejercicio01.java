/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

/**
 Crear un Programa que calcule el promedio de un conjunto de números
y permite al usuario ingresar varios números y calcula el promedio
 */
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int contador = 0;
        double suma = 0;
        double numero;
        char respuesta;

        do {
            System.out.print("Ingresa un número: ");
            numero = lectura.nextDouble();
            suma += numero;
            contador++;
            
            System.out.print("¿Deseas ingresar otro número? (s/n): ");
            respuesta = lectura.next().charAt(0);
        } while (respuesta == 's' || respuesta == 'S');
        
        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("El promedio de los números ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron números.");
        }
    }
    
}
