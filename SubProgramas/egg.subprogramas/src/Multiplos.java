//Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando que el primer número múltiplo
//del segundo e imprima si el primer número es múltiplo del segundo, sino informe que no lo son.

/**
 *
 * @author Roxana Rolón
 */
import java.util.Scanner; // Importar la clase Scanner para leer datos por teclado

public class Multiplos {

    // Definir un procedimiento que reciba dos números y muestre si el primero es múltiplo del segundo
    public static void esMultiplo(int num1, int num2) {
         
        if (num2 == 0) { // Si el segundo número es cero
            System.out.println("No se puede dividir por cero"); // Mostrar mensaje de error por pantalla
            
        } else if (num1 % num2 == 0) { // Si el resto de dividir el primer número entre el segundo es cero
            System.out.println("El número " + num1 + " es múltiplo del número " + num2); // Mostrar que el primer número es múltiplo del segundo por pantalla
        
        } else { // Si no
            System.out.println("El número " + num1 + " no es múltiplo del número " + num2); // Mostrar que el primer número no es múltiplo del segundo por pantalla
        }
    }

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
        
        int num1; // Declarar una variable de tipo int
        int num2; // Declarar una variable de tipo int
        
        System.out.println("Introduce el primer número:"); // Mostrar mensaje por pantalla
        
        num1 = sc.nextInt(); // Leer el primer número por teclado y asignarlo a la variable num1
        
        System.out.println("Introduce el segundo número:"); // Mostrar mensaje por pantalla
        
        num2 = sc.nextInt(); // Leer el segundo número por teclado y asignarlo a la variable num2
        
        esMultiplo(num1, num2); // Llamar al procedimiento esMultiplo con los números como argumentos
    }
}

