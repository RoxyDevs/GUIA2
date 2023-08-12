//Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €


/**
 *
 * @author Roxana Rolón
 */
import java.util.Scanner; // Importar la clase Scanner para leer datos por teclado

public class Conversor {

    // Definir una función que convierta una cantidad de euros a otra moneda y muestre el cambio
    public static void convertir(double euros, String moneda) {
         
        double cambio; // Declarar una variable de tipo double
        
        switch (moneda) { // Usar una estructura switch para evaluar la moneda
             
            case "dólares": // Si la moneda es "dólares"
                cambio = euros * 1.28611; // Calcular el cambio usando el factor de conversión y asignarlo a la variable cambio
                System.out.println(euros + " euros son " + cambio + " dólares"); // Mostrar el cambio por pantalla
                
                break; // Salir del switch
                
            case "yenes": // Si la moneda es "yenes"
                cambio = euros * 129.852; // Calcular el cambio usando el factor de conversión y asignarlo a la variable cambio
                System.out.println(euros + " euros son " + cambio + " yenes"); // Mostrar el cambio por pantalla
                
                break; // Salir del switch
                
            case "libras": // Si la moneda es "libras"
                cambio = euros * 0.86; // Calcular el cambio usando el factor de conversión y asignarlo a la variable cambio
                System.out.println(euros + " euros son " + cambio + " libras"); // Mostrar el cambio por pantalla
                
                break; // Salir del switch
                
            default: // Si la moneda no es ninguna de las anteriores
                System.out.println("Moneda no válida"); // Mostrar mensaje de error por pantalla
                
                break; // Salir del switch
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
        
        double euros; // Declarar una variable de tipo double
        String moneda; // Declarar una variable de tipo String
        
        System.out.println("Introduce una cantidad de euros:"); // Mostrar mensaje por pantalla
        euros = sc.nextDouble(); // Leer la cantidad de euros por teclado y asignarla a la variable euros
        
        System.out.println("Introduce una moneda a convertir (dólares, yenes o libras):"); // Mostrar mensaje por pantalla
        moneda = sc.next(); // Leer la moneda por teclado y asignarla a la variable moneda
        
        convertir(euros, moneda); // Llamar a la función convertir con los argumentos euros y moneda
    }
}

