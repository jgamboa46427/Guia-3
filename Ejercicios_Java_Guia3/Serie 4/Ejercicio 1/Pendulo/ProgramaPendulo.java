import java.util.Scanner;
/**
 * Pendulo .
 * 
 * JOHN GAMBOA , HERNAN SEGURA
 * 1.0
 */
public class ProgramaPendulo
{
    
    public static void main (String [] args)
    {   
        
        System.out.println("*** CALCULAR EL PERIODO DE OSCILACION DEL PENDULO ***");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el valor de la longitud ");
        double l = teclado.nextDouble();
        System.out.print("Ingrese el valor de la aceleracion gravitacional ");
        double a = teclado.nextDouble();
        Pendulo r = new Pendulo(l,a);
        System.out.printf("El periodo es %.2f",  r.periodoOscilacion());
     
    }
    

     
    
    
    
}
