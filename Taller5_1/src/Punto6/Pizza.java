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
public class Pizza {
    
    
    String tipo;
    String tamaño;
    String estado;
static int pedidos=0;
static int  servidos=0;

public Pizza(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamaño=tamaño;
        this.estado = "Pedido";
        Pizza.pedidos = Pizza.pedidos+1;
    
    }


    
    public void Sirve (){
  
       Pizza.pedidos=Pizza.pedidos-1;
       Pizza.servidos=Pizza.servidos+1;

       this.estado = "Servido";

        
    }

    public String toString() {
        return  tipo + ", " + tamaño + ", " + estado;
    }
    
   public static int getTotalPedidas(){
       
        return Pizza.pedidos;
   }
    
   
   public static int getTotalServidas(){
       
            return Pizza.servidos;
   }
        
}
    
    
    
    
