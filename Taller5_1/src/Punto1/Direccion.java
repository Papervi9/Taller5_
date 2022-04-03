/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *
 * @author Ramon
 */
    public class Direccion {
    
    
  
    String direccion;
    String ciudad;
    String barrio;
            
            
            
          public Direccion () {}

    public Direccion(String direccion,  String barrio,String ciudad) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.barrio = barrio;
        
        
        
    }
          
              
              
         
        
              
    
    
          
          
          public String mostrar(){
  

              return direccion+" "+barrio+" "+ciudad;
          }
          
    }
    
    
