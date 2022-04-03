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
public class Persona {
    
    String nombre;
    Fecha fecha ;
    Direccion dirtrabajo;
    Direccion domicilio;
    
    
    
    public Persona (){
        
    }


    public Persona(String nombre, Fecha fecha, Direccion dirtrabajo, Direccion domicilio) {
        this.nombre = nombre;
       this.fecha = fecha;
       this.dirtrabajo = dirtrabajo;
       this.domicilio = domicilio;
    }
    
    
    
    
    
    public  void Mostrar (){
        System.out.println(nombre+"    "+fecha.mostrar()+"     "+dirtrabajo.mostrar()+"       "+domicilio.mostrar());
        
    }
    
}
