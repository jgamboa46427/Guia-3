import  java.util.*;
/**
 * ProgramaPerro
 * 
 * JOHN GAMBOA, HERNAN SEGURA
 * 1.0
 */
public class ProgramaPerro
{
    static Scanner sc = new Scanner(System.in);
    static List<Perro> perros = new LinkedList<>();
    public static void main(String [] args)
  {
      System.out.println("*******COLEGIO DE PERROS *********");
      Perro e = null;
      int opc;
 
    
      do
      {     
          System.out.println("1. Agregar perro");
          System.out.println("2. Informacion de perro por nombre");
          System.out.println("3. Contar Perros por raza");
          System.out.println("4. Nombres de Perros por localidad");
          System.out.println("5. Ver todos los perros");
          System.out.println("6. Salir");
          System.out.print("Opcion =>: ");
          opc = sc.nextInt();
          
          switch (opc)
          {
              case 1:
                    crearPerro();
                    break;
                    
              
              case 2:
                    
                    infoPerro();
                    break;
                    
              case 3:
                    
                    contarRaza();
                    break;
              
              case 4:
                    
                    nomPerroLocalidad();
                    break;
                    
              case 5:
                    
                    mostrarPerros();
                    break;
                    
              case 6:
                    
                    System.exit(0);
                    break;
                    
                    
                    
            }
          
        }
        while(opc != 0);
        
        
                
        
        
    }
    
    
    private static boolean existePerro(String nomEmpleado) {
        for (Perro c : perros) {
            if (c.getNombre() == nomEmpleado) {
                return true;
            }
        }
        return false;
    }
    
    
    private static void crearPerro(){
        
                    System.out.print("Nombre del perro = ");
                    String nom = sc.next();
                    System.out.print("raza = ");
                    String raz = sc.next();
                    System.out.print("localidad = ");
                    String loc = sc.next();
                    System.out.print("nombre dueño = ");
                    String nomDueno = sc.next();
                    System.out.print("cedula dueño = ");
                    int ced = sc.nextInt();
                    System.out.print("telefono dueño = ");
                    int telDueno = sc.nextInt();
                    System.out.print("Dia de asistencia = ");
                    String dia = sc.next();
                    
                    if (existePerro(nom)) {
                            System.out.println("Ya existe un perro con ese nombre!");
                        }
                            else {
                                   Perro perro = new Perro(nom, raz, loc, nomDueno, ced, telDueno, dia);
                                   perros.add(perro);
                                   System.out.println("Perro creado con éxito! Hay " + 
                                   perros.size() + " perros en el Colegio!");
        }
    }
    
    
    
    private static void infoPerro() {
        System.out.print("Perro a buscar: ");
        String perro = sc.next();
        int cont = 0;
        
       for (Perro c : perros) {
            if (c.getNombre().equalsIgnoreCase(perro)) {
                cont++;
                System.out.println("NOMBRE: " + c.getNombre() + " , RAZA: " + c.getRaza() + " , LOCALIDAD: " + c.getLocalidad() + 
                " , DUEÑO: " +
                c.getnomDueno() + " , CEDULA: " + c.getcedDueno() + " , TELEFONO: " + c.gettelDueno() + " , ASISTENCIA: " + c.getdiaAsis());
            }
        }
      
      if (cont == 0) {
            System.out.println("Este perro no existe!!");
        }
        
                }
                
                
     private static void contarRaza() {
        System.out.print("Raza a buscar: ");
        String raza = sc.next();
        int cont = 0;
        
       for (Perro c : perros) {
            if (c.getRaza().equalsIgnoreCase(raza)) {
                cont++;
            }
        }
      
      if (cont == 0) {
            System.out.println("Raza no existe!!");
        }
        else {
            System.out.println("De la raza: " + raza + " existen: " + cont + 
                    " perros!!");
                }
                }
                
                
                
     private static void nomPerroLocalidad() {
        System.out.print("Localidad a buscar: ");
        String localidad = sc.next();
        int cont = 0;
        
       for (Perro c : perros) {
            if (c.getLocalidad().equalsIgnoreCase(localidad)) {
                cont++; 
                System.out.println(c.getNombre());
            }
        }
      
      if (cont == 0) {
            System.out.println("Localidad no existe!!");
        }
        
                }
                
                
                
                private static void mostrarPerros() {
        for (Perro c : perros) {
            System.out.println(c);
        }
    }
}
