/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

import java.util.Scanner;

public class Main {
    
    
    public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
String texto=null;

        System.out.println("Ingrese el texto a escanear ");
    texto = sc.nextLine();
    
    Parrafo p = new Parrafo();
        
        p.nVocales(texto);
                p.nConsonantes(texto);
                p.nPalabraMayor(texto);

    }
}
