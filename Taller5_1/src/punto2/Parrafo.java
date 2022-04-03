/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;
import java.util.Scanner;

public class Parrafo {
    
    String texto;
    int contador;
    int contador2;
    int consonantes;
    public Parrafo() {
    }
    
    


    public Parrafo(String texto, int contador, int contador2, int consonantes) {
        this.texto = texto;
        this.contador = contador;
        this.contador2 = contador2;
        this.consonantes = consonantes;
    }

    
    
    public String nVocales(String texto){
    
    
    Scanner sc = new Scanner (System.in);
   
        int contador =0;
        int contador1 =0;
    for (int i=0; i<texto.length();i++){
        
        contador++;
                
    }
    
        for (int i=0; i<texto.length();i++){
            
            if ((texto.charAt(i) =='a'  )  || (texto.charAt(i) =='e'  )|| (texto.charAt(i) =='i'  )|| (texto.charAt(i) =='o'  )|| (texto.charAt(i) =='u'  ) ){
                
                contador1++;    
                
            }
        }
        System.out.println ("El total de vocales es de: "+ contador1);
    return texto;
}
    
            public void nConsonantes(String texto){
                     int contador =0;
        int contador1 =0;
    for (int i=0; i<texto.length();i++){
        
        contador++;
                
    }
    
        for (int i=0; i<texto.length();i++){
            
            if ((texto.charAt(i) =='a'  )  || (texto.charAt(i) =='e'  )|| (texto.charAt(i) =='i'  )|| (texto.charAt(i) =='o'  )|| (texto.charAt(i) =='u' ) || (texto.charAt(i) ==' '  ) ){
                
                contador1++;    
                
            }
        }
        
        consonantes= contador-contador1;
                System.out.println("El total de consonantes es de : " +consonantes);
}
    
    public void nSimbolos(){
        
        
        
    }
    public void nBuscar(){
        
        
        
    }
    public void nVocalModa(){
        
        
        
    }
    public void nPalabras(){
        
        
        
    }
    public void nPalabraMayor(String texto){
        int posicion =0;
        int longitud =0;
        int mayor=0;
        int posmayor=0;
        for (int i=0; i<texto.length(); i++){
            
            while (! Character.isLetter(texto.charAt(i))&&(i+1)<texto.length()   ){
                
                i++;
                
            }
            
            posicion=i;
            longitud=0;
   while (Character.isLetter(texto.charAt(i))&&(i+1)<texto.length()   ){
                
                i++; 
                longitud++;
   
   }
   if (longitud>mayor){
       
       mayor = longitud;
       posmayor=posicion;
       
   }
   
   
        
        }
        String palabra = "";
        
        for (int i=0; i<mayor;i++){
            
            palabra=palabra.concat(String.valueOf(texto.charAt(posmayor+i)));
            
        }
        System.out.println ("La palabra mas larga es : "+ palabra + " Y tiene "+mayor + " Caracteres");
        
    }
}