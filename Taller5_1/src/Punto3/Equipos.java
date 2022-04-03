/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

import java.util.Arrays;
import java.util.Scanner;

public class Equipos {

    String nombres[] = new String[5];
    String ciudad[] = new String[5];
    String tecnicos[] = new String[5];
    String Ninscripcion[] = new String[5];
    String jugadores[] = new String[6];
    String edad[] = new String[6];
    String posicion[] = new String[6];
    String j2[] = new String [6];
    String j3[] = new String [6];
    String j4[] = new String [6];
    String j5[] = new String [6];
    String e2[] = new String [6];
    String e3[] = new String [6];
    String e4[] = new String [6];
    String e5[] = new String [6];
    String p2[] = new String [6];
    String p3[] = new String [6];
    String p4[] = new String [6];
    String p5[] = new String [6];
 

    public Equipos() {
    }

    public Equipos(String nombres[], String ciudad[], String tecnicos[], String Ninscripcion[]) {

        this.nombres = nombres;
        this.ciudad = ciudad;
        this.tecnicos = tecnicos;
        this.Ninscripcion = Ninscripcion;
        this.jugadores = jugadores;
        this.edad = edad;
        this.posicion = posicion;
        this.j2 =j2;
        this.j3 =j3;
        this.j4 =j4;
        this.j5 =j5;
        this.e2 =e2;
        this.e3 =e3;
        this.e4 =e4;
        this.e5 =e5;
        this.p2 =p2;
        this.p3 =p3;
        this.p4 =p4;
        this.p5 =p5;


    }

    public String Mostrar(String nombres[], String ciudad[], String tecnicos[], String Ninscripcion[], String jugadores[], String edad[], String posicion[],String j2[],String j3[],String e2[], String e3[],String j4[],String j5[],String e4[],String e5[],String p4[],String p5[]) {

        String dato = null;

        int i = 0;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del equipo " + (i + 1));

            nombres[i] = sc.nextLine();
            System.out.println("Ingrese la ciudad del equipo " + (i + 1));
            ciudad[i] = sc.nextLine();
            System.out.println("Ingrese el tecnico del equipo " + (i + 1));
            tecnicos[i] = sc.nextLine();
            System.out.println("Ingrese la el Numero de inscripcion del equipo " + (i + 1));
            Ninscripcion[i] = sc.nextLine();

        }

        for (i = 0; i < 5; i++) {
            int x=1;
            
            System.out.println("Ingrese el nombre del jugador " +x+ " del equipo" + (i+1 ));
            jugadores[i] = sc.nextLine();
            System.out.println("Ingrese la edad del jugador " +(x)+ "  del equipo " + (i + 1));
            edad[i] = sc.nextLine();
            System.out.println("Ingrese la posicion del jugador " +(x)+ "  del equipo " + (i + 1));
            posicion[i] = sc.nextLine();
                        

              System.out.println("Ingrese el nombre del jugador " +(x+1)+ " del equipo" + (i + 1));
            j2[i] = sc.nextLine();

            System.out.println("Ingrese la edad del jugador del " +(x)+ " equipo " + (i + 1));
            e2[i] = sc.nextLine();

            System.out.println("Ingrese la posicion del jugador" +(x)+ "  del equipo " + (i + 1));
            p2[i] = sc.nextLine();
                       

              System.out.println("Ingrese el nombre del jugador " +(x+2)+ " del equipo" + (i + 1));
            j3[i] = sc.nextLine();

            System.out.println("Ingrese la edad del jugador del " +(x+2)+ " equipo " + (i + 1));
            e3[i] = sc.nextLine();

            System.out.println("Ingrese la posicion del jugador " +(x+2)+ " del equipo " + (i + 1));
            p3[i] = sc.nextLine();
              System.out.println("Ingrese el nombre del jugador " +(x+2)+ " del equipo" + (i + 1));

   j4[i] = sc.nextLine();
            System.out.println("Ingrese la edad del jugador del " +(x+3)+ " equipo " + (i + 1));
            e4[i] = sc.nextLine();

            System.out.println("Ingrese la posicion del jugador " +(x+3)+ " del equipo " + (i + 1));
            p4[i] = sc.nextLine();
              System.out.println("Ingrese el nombre del jugador " +(x+3)+ " del equipo" + (i + 1));

   j5[i] = sc.nextLine();
            System.out.println("Ingrese la edad del jugador del " +(x+4)+ " equipo " + (i + 1));
            e5[i] = sc.nextLine();

            System.out.println("Ingrese la posicion del jugador " +(x+4)+ " del equipo " + (i + 1));
            p5[i] = sc.nextLine();
                        System.out.println("Ingrese eñ nombre del jugador del " +(x+5)+ " equipo " + (i + 1));

               j5[i] = sc.nextLine();

            System.out.println("Ingrese la edad del jugador del " +(x+5)+ " equipo " + (i + 1));
            e5[i] = sc.nextLine();

            System.out.println("Ingrese la posicion del jugador " +(x+5)+ " del equipo " + (i + 1));
            p5[i] = sc.nextLine();


        }

        System.out.println("NOMBRES-----CIUDADES------TECNICOS------NOINSCRIPCION------");
        for (i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + "           " + ciudad[i] + "              " + tecnicos[i] + "                " + Ninscripcion[i]);

        }
        
        
        for (i= 0; i < 5; i++) {
            System.out.println("Lista de jugadores del equipo " +nombres[i]);
            System.out.println("NOMBRES--------EDAD-----POSICION");

                System.out.println(jugadores[i] + "           " + edad[i] + "              " + posicion[i]);
                System.out.println(j2[i] + "           " + e2[i] + "              " + p2[i]);
                System.out.println(j3[i] + "           " + e3[i] + "              " + p3[i]);
                  System.out.println(j4[i] + "           " + e4[i] + "              " + p4[i]);
                System.out.println(j5[i] + "           " + e5[i] + "              " + p5[i]);

            }

        
        
        return Arrays.toString(this.nombres) + "  " + Arrays.toString(this.ciudad) + "  " + Arrays.toString(this.tecnicos) + "  " + Arrays.toString(this.Ninscripcion);
    }
}
