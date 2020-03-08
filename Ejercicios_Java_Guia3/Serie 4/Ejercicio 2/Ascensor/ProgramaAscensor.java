import java.util.Scanner;
/**
 * Ascensor
 * 
 * JOHN GAMBOA
 * 1.0
 */
public class ProgramaAscensor
{
    
    
    
    public static void main (String [] args)
    {   
        int np, ns;
        System.out.println("*** ASCENSOR ***");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cuantos Pisos tiene el Edificio ");
        np = teclado.nextInt();
        System.out.print("Cuantos sotanos ");
        ns = -teclado.nextInt();
        int opc = 0;
        int pa = 1;
        Ascensor ou = new Ascensor(np,ns,pa);
        
        do
        {   
          
          System.out.println("*** ASCENSOR ***  **** SELECCIONE ****" );
          System.out.println("1. Piso actual");
          System.out.println("2. Subir");
          System.out.println("3. Bajar");
          System.out.println("4. Capacidad del ascensor");
          System.out.println("5. Salir");
          System.out.print("Opcion =>: ");
          opc = teclado.nextInt();
          
         
          switch (opc)
          {
              
              
            
              case 1:
   
                    System.out.println("El piso actual es: " + ou.getpActual());
                    break;
              
              case 2:

                        if (  ou.getpActual() < ou.getnPisos())
                         {
                         int subir = ou.getpActual();
                         ou.subiendo(subir);
                         System.out.println("Subiendo Piso : " + ou.getpActual());
                         } else {System.out.println("No puede subir mas!");}
                         break;
                               
                    
              case 3:
                    if (  ou.getpActual() > ou.getnSotanos())
                    {
                    int bajar = ou.getpActual();
                    ou.bajando(bajar);
                    System.out.println("Bajando Piso : " + ou.getpActual());
                    } else {System.out.println("No puede bajar mas!");}
                    break;      
                    
              case 4:
              int cap = ou.getnPisos() - ou.getnSotanos();
              System.out.println("Capacidad para " + cap + " Pisos");
              break;
              
                    
               case 5:
                   
                    System.exit(0);
                    break;
                    
                    
            }
          
        }
        while(opc != 0  );
        
        
     
    }
    
    
    
    
    

   
    

  
}
