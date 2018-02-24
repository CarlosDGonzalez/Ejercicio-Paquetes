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
public class Fibonacci {
    
    public int tamaño;
    public String nombre;
 
    
    public Fibonacci(){
        
    } 
    public Fibonacci(String nombre, int tamaño){
        this.nombre = nombre;
        this.tamaño = tamaño;
    }
    public int numeroprueba(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero para saber la serie de Fibonacci");
        int n=leer.nextInt();
    return  n;
    }
    
        
        //Inicio programa
        

    
    
    public void mostrarSerie(){
        System.out.println(this.nombre+" de tamaño "+this.tamaño+":");
        int pos=1;
        for (int i = 0; i < tamaño; i++) {
            System.out.print(fibonacci(i)+"("+pos+")"+" ");
            pos++;
        }
        System.out.println();
    }
    
    
    int fibonacci(int n)
    {
        if (n>1){
           return fibonacci(n-1) + fibonacci(n-2); 
        }
        else if (n==1) {
            return 1;
        }
        else if (n==0){
            return 0;
        }
        else{
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1; 
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
        public String toString(){
        return ("publica2 = "+tamaño+" protegida2 = "+nombre);//se usa para conocer los valores de las variables 
        }
}