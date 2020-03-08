import java.util.*; 
/**
 * Perro
 * 
 * JOHN GAMBOA, HERNAN SEGURA
 * 1.0
 */
public class Perro
{
    // Atributos
    private String nombre, raza, localidad, nomDueno, diaAsis;
    private int cedDueno, telDueno;
    
    // Constructor
   public Perro (String nombre, String raza, String localidad, 
   String nomDueno, int cedDueno, int telDueno, String diaAsis)
   { 
       this.nombre = nombre;
       this.raza = raza;
       this.localidad = localidad;
       this.nomDueno = nomDueno;
       this.cedDueno = cedDueno;
       this.telDueno = telDueno;
       this.diaAsis = diaAsis;
       
    }
    
    // Metodos analizadores: getters
   
   public String getNombre()
   {
       return this.nombre;
    }
    
    public String getRaza()
   {
       return this.raza;
       
    }
    
    public String getLocalidad()
   {
       return this.localidad;
    }
    
    public String getnomDueno()
   {
       return this.nomDueno;
    }
    
    public int getcedDueno()
   {
       return this.cedDueno;
    }
    
    public int gettelDueno()
   {
       return this.telDueno;
    }
    
    public String getdiaAsis()
   {
       return this.diaAsis;
    }
    
    
    // Metodos modificadores: setters
   
    public void setNombre(String nuevoNombre)
    {
       this.nombre = nuevoNombre;
       
    }
    
    public void setRaza(String nuevoRaza)
    {
       this.raza = nuevoRaza;
    }
    
    public void setLocalidad(String nuevoLocalidad)
    {
       this.localidad = nuevoLocalidad;
    }
   
    public void setnomDueno(String nuevonomDueno)
    {
       this.nomDueno = nuevonomDueno;
    }
    
    public void setcedDueno(int nuevocedDueno)
    {
       this.cedDueno = nuevocedDueno;
    }
    
    public void settelDueno(int nuevotelDueno)
    {
       this.telDueno = nuevotelDueno;
    }
    
    public void setdiaAsis(String nuevodiaAsis)
    {
       this.diaAsis = nuevodiaAsis;
    }
    
    
    // Metodos
    
    
    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", Raza=" + raza + ", localidad=" + localidad
            + ", Nombre Dueno=" + nomDueno + ", Cedula Dueno=" + cedDueno + ", Telefono=" 
            + telDueno + ", Dia de asistencia=" + diaAsis + '}';
    }
}
