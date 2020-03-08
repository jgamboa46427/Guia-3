import  java.util.Scanner;
import  java.util.*;
/**
 * Write a description of class ProgramaEmpleado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProgramaEmpleado
{
    
    static Scanner sc = new Scanner(System.in);
    static List<Empleado> empleados = new LinkedList<>();
    
    
  public static void main(String [] args)
  {
      System.out.println("*******SUPERMERCADO SANTAFÈ *********");
      Empleado e = null;
      int opc;
      
      
    
    
      do
      {     
          System.out.println("1. Agregar empleado");
          System.out.println("2. Imprimir todos los empleados");
          System.out.println("3. Empleados por departamento");
          System.out.println("4. Aumentar 10% salario empleados");
          System.out.println("5. Suma salario todos los empleados");
          System.out.println("6. Salir");
          System.out.print("Opcion =>: ");
          opc = sc.nextInt();
          
          switch (opc)
          {
              case 1:
                    crearEmpleado();
                    break;
                    
              
              case 2:
                    
                    mostrarEmpleados();
                    break;
                    
              case 3:
                    
                    empleadosDepartamento();
                    break;
              
              case 4:
                    
                    aumentarSalarios();
                    break;
                    
              case 5:
                    
                    sumaSalarios();
                    break;
                    
              case 6:
                    
                    System.exit(0);
                    break;
                    
                    
                    
            }
          
        }
        while(opc != 0);
        
        
                
        
        
    }
    
    
    
    
    
    private static boolean existeEmpleado(String nomEmpleado) {
        for (Empleado c : empleados) {
            if (c.getNombre() == nomEmpleado) {
                return true;
            }
        }
        return false;
    }
    
    
    private static void crearEmpleado(){
        
                    System.out.print("Nombre del empleado = ");
                    String nom = sc.next();
                    System.out.print("Departamento = ");
                    String dep = sc.next();
                    System.out.print("Cargo = ");
                    String car = sc.next();
                    System.out.print("Salario = ");
                    double sal = sc.nextDouble();
                    if (existeEmpleado(nom)) {
                            System.out.println("Ya existe un empleado con ese nombre!");
                        }
                            else {
                                   Empleado empleado = new Empleado(nom, dep, car, sal);
                                   empleados.add(empleado);
                                   System.out.println("Empleado creado con éxito! Hay " + 
                                   empleados.size() + " empleados en el Supermercado!");
        }
    }
                
        private static void mostrarEmpleados() {
        for (Empleado c : empleados) {
            System.out.println(c);
        }
    }
    
    
    private static void empleadosDepartamento() {
        System.out.print("Departamento a buscar: ");
        String departamento = sc.next();
        int cont = 0;
        
       for (Empleado c : empleados) {
            if (c.getDepartamento().equalsIgnoreCase(departamento)) {
                cont++;
            }
        }
      
      if (cont == 0) {
            System.out.println("Este departamento no tiene empleados!!");
        }
        else {
            System.out.println("El departamento" + departamento + " tiene " + cont + 
                    " empleados!!");
                }
                }
                
                
    private static void aumentarSalarios() {
        
       double cont = 0;
       double salario = 0;
       for (Empleado c : empleados) {
            salario = c.getSalario();
                cont ++;
                salario += (salario * 0.1);
                c.setSalario(salario);
            
            
        }
        
      if (cont == 0) {
            System.out.println("No hay salarios que aumentar!!");
        }else{System.out.println("Se aumento el salario a todos los empleados " );}
        
                }
                
                
    private static void sumaSalarios() {
        
       double cont = 0;
       double salario = 0;
       for (Empleado c : empleados) {
            salario = c.getSalario();
                cont += salario;
            
            
        }
        
      if (cont == 0) {
            System.out.println("No hay salarios!!");
        }else {System.out.println("La suma de todos los salarios es " + cont );}
        
                }
        
    
    
    
    
}
