//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: 
//cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
//Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. Utilice la estructura “según” para la transformación. 
//Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
//La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.


/**
 *
 * @author Roxana Rolón
 */
import java.util.Scanner; // Importar la clase Scanner para leer datos por teclado

public class Codificador {

    // Definir una función que reciba una secuencia de caracteres y devuelva la codificación correspondiente
    public static String codificar(String secuencia) {
         
        String codigo = ""; // Declarar e inicializar una variable de tipo String para almacenar el código
        
        for (int i = 0; i < secuencia.length(); i++) { // Recorrer los caracteres de la secuencia
            char c = secuencia.charAt(i); // Obtener el carácter en la posición i y asignarlo a la variable c
            
            switch (c) { // Usar una estructura switch para evaluar el carácter
                 
                case 'a': // Si el carácter es 'a'
                    codigo = codigo + "@"; // Concatenar el símbolo '@' al código
                    
                    break; // Salir del switch
                    
                case 'e': // Si el carácter es 'e'
                    codigo = codigo + "#"; // Concatenar el símbolo '#' al código
                    
                    break; // Salir del switch
                    
                case 'i': // Si el carácter es 'i'
                    codigo = codigo + "$"; // Concatenar el símbolo '$' al código
                    
                    break; // Salir del switch
                    
                case 'o': // Si el carácter es 'o'
                    codigo = codigo + "%"; // Concatenar el símbolo '%' al código
                    
                    break; // Salir del switch
                    
                case 'u': // Si el carácter es 'u'
                    codigo = codigo + "*"; // Concatenar el símbolo '*' al código
                    
                    break; // Salir del switch
                    
                default: // Si el carácter no es ninguna de las vocales anteriores
                    codigo = codigo + c; // Mantener el carácter sin cambios y concatenarlo al código
                    
                    break; // Salir del switch
            }
        }
        return codigo; // Devolver el valor de la variable código
    }

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
        
        String secuencia; // Declarar una variable de tipo String
        
        String codigo; // Declarar una variable de tipo String
        
        System.out.println("Introduce una secuencia de caracteres terminada en punto:"); // Mostrar mensaje por pantalla
        
        secuencia = sc.nextLine(); // Leer la secuencia por teclado y asignarla a la variable secuencia
        
        codigo = codificar(secuencia); // Llamar a la función codificar con la secuencia como argumento y asignar el valor devuelto a la variable código
        
        System.out.println("La codificación de la secuencia es:"); // Mostrar mensaje por pantalla
        
        System.out.println(codigo); // Mostrar el valor de la variable código por pantalla
    }
}

