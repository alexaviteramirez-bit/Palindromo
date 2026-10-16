/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexa
 */
public class Palindromo {

    // Wrapper: prepara la palabra y llama al método recursivo
    public static boolean esPalindromo(String palabra) {
        if (palabra == null) {
            return false;
        }

        palabra = palabra.toLowerCase();
        palabra = palabra.replace(" ", "");

        return verificar(palabra, 0, palabra.length() - 1);
    }

    // Método recursivo: compara caracteres desde los extremos hacia el centro
   private static boolean verificar(String palabra, int inicio, int fin) {
        if (inicio >= fin) {
            return true;
        }
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }
        return verificar(palabra, inicio + 1, fin - 1);
    }
//Casos de prueba
    public static void main(String[] args) {
        System.out.println("reconocer: " + esPalindromo("reconocer"));
        System.out.println("radar: " + esPalindromo("radar"));
        System.out.println("pesar: " + esPalindromo("pesar"));
        System.out.println("Cadena vacia: " + esPalindromo(""));
        System.out.println("a: " + esPalindromo("a"));
    }
}