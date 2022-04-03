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
public class Fecha {
 
    
    
    int dia;
    String mes;
    int año; 
    
    public Fecha (){
    };
    
    public Fecha (String mes, int dia, int año){
    
    this.mes = mes;
        this.dia = dia;
    this.año = año;

}
    
    public String mostrar () {
        String Sfecha = dia+" "+mes+" "+año;
       
    return Sfecha;
    
}
}
