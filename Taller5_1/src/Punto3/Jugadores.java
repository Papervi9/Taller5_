/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

import java.util.Arrays;
import java.util.Scanner;
public class Jugadores {
    
    String nombres[] = new String [2];
        String edad[] = new String [2];
    String posicion[] = new String [2];
  

    
    
    public Jugadores (){    
        }
        
        
        
        public Jugadores (String nombres[] , String ciudad [] , String tecnicos [] , String Ninscripcion[] ){
        
            
            this.nombres = nombres;
                    this.edad = ciudad;
            this.posicion = tecnicos;

        
    }
    
    public String Mostrar (String nombres[], String edad[], String posicion[]){
        
       String dato = null;
       
        int i=0;
        Scanner sc = new Scanner(System.in);
        for (i=0; i<2; i++){
        System.out.println ("Ingrese el nombre del jugador " +(i+1));
        
        
        nombres[i] = sc.nextLine();    
                System.out.println ("Ingrese la ciudad del equipo " +(i+1));
        edad[i] = sc.nextLine();    
 System.out.println ("Ingrese el tecnico del equipo " +(i+1));
        posicion[i] = sc.nextLine();    
 
      

        
    }
        
        System.out.println("NOMBRES-----CIUDADES------TECNICOS------");
        for (i=0; i<nombres.length;i++){ 
                         System.out.println (nombres[i]+"           "+  edad[i]+"              "+ posicion[i]);

            
        }
        
        return Arrays.toString(this.nombres)+"  "+Arrays.toString(this.edad)+"  "+Arrays.toString(this.posicion);
    }
}