package modelo;

public class Jugador
{
    ///Atributos
    private String nombre;
    private int numgoles;
    private String apellido;
    private int edad;
    private String posicion;
    private String marcarTiSu;

    //Métodos

    public String getmarcarTiSu() 
    {
        return marcarTiSu;
    }

    public void setmarcarTiSu(String marcarTiSu) 
    {
        this.marcarTiSu = marcarTiSu;
    }

    public String getPosicion() 
    {
        return posicion;
    }

    public void setPosicion(String posicion) 
    {
        this.posicion = posicion;
    }
     public int getEdad() 
     {
        return edad;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }
     public String getApellido() 
     {
        return apellido;
    }

    public void setApellido(String apellido) 
    {
        this.apellido = apellido;
    }

    
    public int getNumgoles() 
    {
        return numgoles;
    }

    public void setNumgoles(int numgoles) 
    {
        this.numgoles = numgoles;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }
}
