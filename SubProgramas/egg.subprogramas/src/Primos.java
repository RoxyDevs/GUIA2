//Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
//Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
//
//        	¿Qué son los números primos?
//Básicamente, un número primo es un número natural que tiene solo dos divisores o factores: 1 y el mismo número. Es decir, es primo aquel número que se puede dividir por uno y por el mismo número.
//El primer número primo es 2, y hay 25 números primos entre 1 y 100, ellos son: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97.


/**
 *
 * @author Roxana Rolón
 */
import java.util.Scanner; // Importar la clase Scanner para leer datos por teclado

public class Primos {

    // Definir una función que reciba un número por parámetro y devuelva true si es primo, sino false
    public static boolean esPrimo(int numero) {
         
        if (numero <= 1) { // Si el número es menor o igual a 1
            return false; // Devolver false, ya que no es primo
        }
        for (int i = 2; i < numero; i++) { // Recorrer los números desde 2 hasta el número - 1
            if (numero % i == 0) { // Si el número es divisible por i
                return false; // Devolver false, ya que no es primo
            }
        }
        return true; // Si no se encontró ningún divisor, devolver true, ya que es primo
    }

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
        
        int numero; // Declarar una variable de tipo int
        boolean primo; // Declarar una variable de tipo boolean
        
        System.out.println("Introduce un número:"); // Mostrar mensaje por pantalla
        numero = sc.nextInt(); // Leer el número por teclado y asignarlo a la variable numero
        primo = esPrimo(numero); // Llamar a la función esPrimo con el número como argumento y asignar el valor devuelto a la variable primo
        
        if (primo) { // Si la variable primo es true
            System.out.println("El número " + numero + " es primo"); // Mostrar que el número es primo por pantalla
            
        } else { // Si no
            System.out.println("El número " + numero + " no es primo"); // Mostrar que el número no es primo por pantalla
        }
    }
}

