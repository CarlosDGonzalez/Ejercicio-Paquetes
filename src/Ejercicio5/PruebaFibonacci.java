/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;
import java.util.Scanner;
/**
 *
 * @author Carlos
 */
public class PruebaFibonacci {

    /**
     * Programa para realizar la serie de Fibonacci
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarar la funcion Scanner
        Scanner leer = new Scanner(System.in);
        
        //Declarar variables
        int n;
        
        //Inicio programa
        System.out.println("Ingrese el numero para saber la serie de Fibonacci");
        n=leer.nextInt();
        
        Fibonacci f1 = new Fibonacci("fibonacci 1",n); 
        f1.mostrarSerie();
        
        
    }
}