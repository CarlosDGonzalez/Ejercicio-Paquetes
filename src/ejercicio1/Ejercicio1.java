/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Ejercicio1 {
    int contador=0;
        float sumaNota=0F,nota;        
        int sino=1;
        String nombre;
        Scanner leer=new Scanner (System.in);
     public  Ejercicio1() {       
            
    }
     public void promedio(){
         
        System.out.println("Escriba el nombre del alumno");
        nombre=leer.nextLine();
        for(int i=1;sino==1;i++)
        {
            contador++;
            System.out.println("ingrese la nota del estudiante :");
            nota=leer.nextFloat();
            sumaNota=sumaNota+nota;
            System.out.println("si quieres ingresar otra nota presiona 1");
            sino=leer.nextInt();
        }
        System.out.println("El promedio de "+nombre+" es: "+(sumaNota/contador));
         
     }
     public String toString(){
        return ("contador = "+contador+" sumanota = "+sumaNota);//se usa para conocer los valores de las variables 
        }
    
}
