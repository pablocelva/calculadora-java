package calculadoraappconsola;
import java.util.Scanner;

/**
 * Aplicación de consola que permite realizar operaciones matemáticas básicas.
 * El usuario puede sumar, restar, multiplicar o dividir dos números enteros
 * ingresados por teclado hasta que decida detener la ejecución.
 *
 * @author Pablo Lambert
 * @version 1.0
 */

public class App {
    /**
     * Método principal de la aplicación.
     * Controla el flujo del programa, solicita datos al usuario
     * y ejecuta la operación seleccionada.
     *
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        
        /** Scanner utilizado para leer datos desde teclado */
        Scanner scanner = new Scanner(System.in);

        // Primer número ingresado por el usuario 
        int num1 = 0;
        
        // Segundo número ingresado por el usuario
        int num2 = 0;
        
        // Resultado de la operación matemática
        int resultado = 0;
        
        // Acción ingresada por el usuario para continuar o detener la app
        String accionUsuario = "";
        
        // Operador matemático seleccionado por el usuario
        String operador = "";

        System.out.println("Bienvenido a la calculadora de consola");
        do {
            try {
                System.out.println("Ingrese el primer número:");
                num1 = scanner.nextInt();

                System.out.println("Ingrese el segundo número:");
                num2 = scanner.nextInt();

                System.out.println("Ingrese el operador (+ - * /):");
                operador = scanner.next();

                // Se evalúa el operador ingresado para ejecutar la operación correspondiente
                switch (operador) {
                    case "+":
                        resultado = App.sumar(num1, num2);
                        break;
                    case "-":
                        resultado = App.restar(num1, num2);
                        break;
                    case "*":
                        resultado = App.multiplicar(num1, num2);
                        break;
                    case "/":
                        if (num2 == 0) {
                            System.out.println("No se puede dividir por cero");
                        } else {
                            resultado = App.dividir(num1, num2);
                        }
                        break;
                    default:
                        System.out.println("Operador no reconocido");
                        break;
                }

                if (operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/")) {
                    System.out.println("El resultado de " + num1 + " " + operador + " " + num2 + " es: " + resultado);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println(" ");
                System.out.println("'Stop' para detener la app, 's' para seguir");
                accionUsuario = scanner.next();
            }
        } while (!accionUsuario.equalsIgnoreCase("stop"));
        System.out.println("Gracias por usar la calculadora de consola. ¡Hasta luego!");
        scanner.close();
    }

    /**
     * Realiza la suma de dos números enteros.
     *
     * @param num1 primer número
     * @param num2 segundo número
     * @return resultado de la suma
     */
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Realiza la resta de dos números enteros.
     *
     * @param num1 primer número
     * @param num2 segundo número
     * @return resultado de la resta
     */
    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Realiza la multiplicación de dos números enteros.
     *
     * @param num1 primer número
     * @param num2 segundo número
     * @return resultado de la multiplicación
     */
    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Realiza la división de dos números enteros.
     *
     * @param num1 dividendo
     * @param num2 divisor
     * @return resultado de la división
     */
    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }
}
