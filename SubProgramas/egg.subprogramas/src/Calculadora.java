//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main.

/**
 *
 * @author Roxana Rolón
 */
import java.util.Scanner; // Importar la clase Scanner para leer datos por teclado

public class Calculadora {

    // Definir una función para cada operación matemática
    public static int sumar(int a, int b) {
        return a + b; // Devolver la suma de a y b
    }

    public static int restar(int a, int b) {
        return a - b; // Devolver la resta de a y b
    }

    public static int multiplicar(int a, int b) {
        return a * b; // Devolver la multiplicación de a y b
    }

    public static double dividir(int a, int b) {
        return (double) a / b; // Devolver la división de a y b como un valor de tipo double
    }

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
        
        int num1, num2, opcion; // Declarar variables enteras
        
        double resultado; // Declarar una variable de tipo double
        
        System.out.println("Introduce el primer número:"); // Mostrar mensaje por pantalla
        
        num1 = sc.nextInt(); // Leer el primer número por teclado y asignarlo a num1
        
        System.out.println("Introduce el segundo número:"); // Mostrar mensaje por pantalla
        
        num2 = sc.nextInt(); // Leer el segundo número por teclado y asignarlo a num2
        
        System.out.println("Elige una opción:"); // Mostrar mensaje por pantalla
        
        System.out.println("1. Sumar"); // Mostrar opción 1
        
        System.out.println("2. Restar"); // Mostrar opción 2
        
        System.out.println("3. Multiplicar"); // Mostrar opción 3
        
        System.out.println("4. Dividir"); // Mostrar opción 4
        
        opcion = sc.nextInt(); // Leer la opción por teclado y asignarla a opcion

        switch (opcion) { // Usar una estructura switch para evaluar la opción elegida
             
            case 1: // Si la opción es 1
                resultado = sumar(num1, num2); // Llamar a la función sumar con los números como argumentos y asignar el valor devuelto a resultado
                System.out.println("La suma de " + num1 + " y " + num2 + " es " + resultado); // Mostrar el resultado por pantalla
                
                break; // Salir del switch
                
            case 2: // Si la opción es 2
                resultado = restar(num1, num2); // Llamar a la función restar con los números como argumentos y asignar el valor devuelto a resultado
                System.out.println("La resta de " + num1 + " y " + num2 + " es " + resultado); // Mostrar el resultado por pantalla
                
                break; // Salir del switch
                
            case 3: // Si la opción es 3
                resultado = multiplicar(num1, num2); // Llamar a la función multiplicar con los números como argumentos y asignar el valor devuelto a resultado
                System.out.println("La multiplicación de " + num1 + " y " + num2 + " es " + resultado); // Mostrar el resultado por pantalla
                
                break; // Salir del switch
                
            case 4: // Si la opción es 4
                resultado = dividir(num1, num2); // Llamar a la función dividir con los números como argumentos y asignar el valor devuelto a resultado
                System.out.println("La división de " + num1 + " y " + num2 + " es " + resultado); // Mostrar el resultado por pantalla
                
                break; // Salir del switch
                
            default: // Si la opción no es ninguna de las anteriores
                 
                System.out.println("Opción inválida"); // Mostrar mensaje de error por pantalla
                
                break; // Salir del switch
        }
    }
}
