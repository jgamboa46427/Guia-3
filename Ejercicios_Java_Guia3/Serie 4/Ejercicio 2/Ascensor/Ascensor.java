
/**
 * Ascensor 
 * 
 * JOHN GAMBOA , HERNAN SEGURA 
 * 1.0
 */
public class Ascensor
{
   // Atributos
    private int nPisos;
    private int nSotanos;
    private int pActual;
    
    // Constructor
   public Ascensor(int np, int ns, int pa)
   { 
       this.nPisos = np;
       this.nSotanos = ns;
       this.pActual = pa;

    }
    
    
    // Metodos analizadores: getters
    
    public int getnPisos()
   {
       return this.nPisos;
    }
    
    public int getnSotanos()
   {
       return this.nSotanos;
    }
    
    public int getpActual()
   {
       return this.pActual;
    }
    
    // Metodos modificadores: setters
   
    public void setnPisos(int nuevonPisos)
    {
       this.nPisos = nuevonPisos;
       
    }
    
    public void setnSotanos(int nuevonSotanos)
    {
       this.nSotanos = nuevonSotanos;
       
    }
    
    public void setpActual(int nuevopActual)
    {
       this.pActual = nuevopActual;
       
    }
    
    
    // Metodo operaciones
    
    public int capacidad(int cap)
    {
       int c = getnPisos() - getnSotanos();
       return c;
    }
    
    
    public int subiendo (int subirPiso )
    {  
        int nuevoPiso = getpActual();
           if (getpActual() == -1){
           nuevoPiso = getpActual()+2;
           setpActual(nuevoPiso);
           
        }else{
            nuevoPiso = getpActual()+1;
           setpActual(nuevoPiso);
        }
        return nuevoPiso;
    }
    
    public int bajando (int bajarPiso )
    {   
       int nuevoPiso = getpActual(); 
        if (getpActual() == 1){
       nuevoPiso = getpActual()-2;
       setpActual(nuevoPiso);
       }else{
           nuevoPiso = getpActual()-1;
           setpActual(nuevoPiso);
        }
       return nuevoPiso;
    }
    
    
   
   
    
    
    
}
