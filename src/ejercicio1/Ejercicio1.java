/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Ejercicio1 {
     public  Ejercicio1() {
        int contador=0;
        float sumaNota=0F,nota;        
        int sino=1;
        String nombre;
        Scanner leer=new Scanner (System.in);
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
    
}
