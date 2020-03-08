
/**
 * Pendulo.
 * 
 * JOHN GAMBOA, HERNAN SEGURA
 * 1.0
 */
public class Pendulo
{
    // Atributos
    private double longitud;
    private double aceleracion;
    
    
    // Constructor
   public Pendulo(double l, double a)
   { 
       this.longitud = l;
       this.aceleracion = a;

    }
    
    // Metodos analizadores: getters
    
    public double getSalario()
   {
       return this.longitud;
    }
    
    public double aceleracion()
   {
       return this.aceleracion;
    }

   // Metodos modificadores: setters
   
    public void setLongitud(double nuevoLongitud)
    {
       this.longitud = nuevoLongitud;
       
    }
    
    public void setaceleracion(double nuevoAceleracion)
    {
       this.longitud = nuevoAceleracion;
       
    }
    
    // Metodo operaciones
    
    public double periodoOscilacion()
    {
       double t = 2 * Math.PI * (Math.sqrt(this.longitud/this.aceleracion));
        return t;
       
    }
    
}
