//Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

/**
 *
 * @author Roxana Rolón
 */
import java.util.Scanner; // Importar la clase Scanner para leer datos por teclado

public class Personas {

    // Definir una función que pida el nombre y la edad de una persona e imprima los datos y si es mayor o menor de edad
    public static void mostrarPersona() {
         
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
        
        String nombre; // Declarar una variable de tipo String
        int edad; // Declarar una variable de tipo int
        
        System.out.println("Introduce el nombre de la persona:"); // Mostrar mensaje por pantalla
        
        nombre = sc.nextLine(); // Leer el nombre por teclado y asignarlo a la variable nombre
        
        System.out.println("Introduce la edad de la persona:"); // Mostrar mensaje por pantalla
        
        edad = sc.nextInt(); // Leer la edad por teclado y asignarla a la variable edad
        
        System.out.println("La persona se llama " + nombre + " y tiene " + edad + " años"); // Mostrar los datos de la persona por pantalla
        
        if (edad >= 18) { // Si la edad es mayor o igual a 18
            System.out.println("La persona es mayor de edad"); // Mostrar que es mayor de edad por pantalla
            
        } else { // Si no
            System.out.println("La persona es menor de edad"); // Mostrar que es menor de edad por pantalla
        }
    }

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
        String respuesta; // Declarar una variable de tipo String
        
        do { // Hacer lo siguiente mientras la respuesta sea distinta de "No"
             
            mostrarPersona(); // Llamar a la función mostrarPersona()
            System.out.println("¿Quieres seguir mostrando personas?"); // Mostrar mensaje por pantalla
            respuesta = sc.next(); // Leer la respuesta por teclado y asignarla a la variable respuesta
            
        } while (!respuesta.equalsIgnoreCase("No")); // Mientras la respuesta no sea igual a "No" ignorando mayúsculas y minúsculas
    }
}

