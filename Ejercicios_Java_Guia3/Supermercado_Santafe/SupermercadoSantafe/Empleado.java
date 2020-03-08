import java.util.*; 
import java.text.DecimalFormat;
/**
 * 
 * 
 * JOHN GAMBOA, HERNAN SEGURA
 * 
 */
public class Empleado
{
    
    
   // Atributos
   private String nombre, departamento, cargo;
   private double salario;
 
   
   // Constructor
   public Empleado (String nom, String dep, String car, double 
   sal)
   { 
       this.nombre = nom;
       this.departamento = dep;
       this.cargo = car;
       this.salario = sal;
       
    }
    
    
   // Metodos analizadores: getters
   
   public String getNombre()
   {
       return this.nombre;
    }
    
    public String getDepartamento()
   {
       return this.departamento;
       
    }
    
    public String getCargo()
   {
       return this.cargo;
    }
    
    public double getSalario()
   {
       return this.salario;
    }
    
   // Metodos modificadores: setters
   
    public void setNombre(String nuevoNombre)
    {
       this.nombre = nuevoNombre;
       
    }
    
    public void setDepartamento(String nuevoDepartamento)
    {
       this.departamento = nuevoDepartamento;
    }
    
    public void setCargo(String nuevoCargo)
    {
       this.cargo = nuevoCargo;
    }
   
    public void setSalario(double nuevoSalario)
    {
       this.salario = nuevoSalario;
    }
    
    
    // Metodos
    
    
    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("$###,###.##");
        String salarioStr = format.format(salario);
        return "Cuenta{" + "nombre=" + nombre + ", departamento=" + departamento + ", cargo=" + cargo + ", salario=" + salarioStr + '}';
    }
    
    
   
    
    
    
   
  
    
    
    
}
