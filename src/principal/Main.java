/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;
import ejercicio1.Ejercicio1;
import ejercicio2.Ejercicio2;
import ejercicio3.Ejercicio3;
import ejercicio4.Ejercicio4;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
    int continuar=1;
    int sino=1;
    Scanner leer=new Scanner (System.in);
    System.out.println(" MENU :");
     System.out.println(" 1) ejercicio1 ");
     System.out.println(" 2) ejercicio2 ");
     System.out.println(" 3) ejercicio3 ");
     System.out.println(" 4) ejercicio4 ");
     System.out.println(" 5) ejercicio5 ");
     System.out.println("opcion = ");     
     
            numero=leer.nextInt();
    for(int i=1;sino==1;i++)
        { 
    switch (numero)
    { 
    case 1:Ejercicio1 objeto1=new Ejercicio1();
        
    break;  
    case 2:Ejercicio2 objeto2=new Ejercicio2();
    break;
    case 3:Ejercicio3 objeto3=new Ejercicio3();
    break;
    case 4:Ejercicio4 objeto4=new Ejercicio4();
    break; 
    case 5:System.out.println("verano:");
    
    default: 
        System.out.println("la opcion no es valida:"); 
  }
            
            System.out.println("ingrese 1 para regresar al menu");
            sino=leer.nextInt();
            System.out.println(" MENU :");
            System.out.println(" 1) ejercicio1 ");
            System.out.println(" 2) ejercicio2 ");
            System.out.println(" 3) ejercicio3 ");
            System.out.println(" 4) ejercicio4 ");
            System.out.println(" 5) ejercicio5 ");
            System.out.println("opcion = ");
            
            numero=leer.nextInt();
            
        }
    
    
}
        // TODO code application logic here
    }
    

