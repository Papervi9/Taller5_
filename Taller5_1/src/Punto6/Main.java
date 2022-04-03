/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6;

/**
 *
 * @author Ramon
 */
public class Main {
    
    public static void main(String[] args) {
        
                Pizza p1 = new Pizza ("Margarita", "Mediana");
                Pizza p2 = new Pizza ("funghi", "Familiar");
                p2.Sirve();
                Pizza p3 = new Pizza ("Cuatro quesos", "Mediana");
                System.out.println (p1.toString());
                System.out.println (p2.toString());
                System.out.println (p3.toString());
               
                
             
                
                
                
                System.out.println("Pedidas "+ Pizza.getTotalPedidas());
                System.out.println("Servidas "+Pizza.getTotalServidas());

    }
    
    
} 
