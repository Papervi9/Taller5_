
package Punto1;

/**
 *
 * @author Ramon
 */
public class Main {
    
    public static void main(String[] args) {
        

                        
        Fecha f1 = new Fecha ("Mayo" , 10 , 1995);
        Fecha f2 = new Fecha ("Diciembre" ,10 ,1995);
        Fecha f3 = new Fecha ("Octubre" , 15 ,2000);

        Direccion d1p1 = new Direccion ("N21 Cra 20a ","palmas", "Cali");
        
        Direccion d1p2 = new Direccion ("N20 Cra 22a ","malva", "valledupar");
        Direccion d1p3 = new Direccion ("N22 Cra 30b ","villa one", "Bogota");

        Direccion d2p1 = new Direccion ("N21 Cra 20a "," palmas", "Medellin");
         Direccion d2p2 = new Direccion ("N20 Cra 22a" ,"  malva", "Cali");
        Direccion d2p3 = new Direccion ( "N12d Cra 10a","delawer","valledupar");

      
        Persona p1 = new Persona ("Juan Lopez Mejia",f1,d1p1,d2p1);
        Persona p2 = new Persona ("Jose Maria Alvedo",f2,d1p2,d2p2);    
        Persona p3 = new Persona ("Lopez Medina Arregoce",f3,d1p3,d2p3);      
                          
      
                
                
         //MOSTRA DATOS PERSONAS
         
            System.out.println ("--------Datos de la persona--------");
            System.out.println ("NOMBRE                      FECHA DE NACIMINETO                  DIR.TRABAJO                        DOMICILIO");
            
            p1.Mostrar();
            p2.Mostrar();
            p3.Mostrar();
                
    }
    
    
    
    
}
