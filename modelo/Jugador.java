package modelo;

import java.util.ArrayList;

public class Jugador
{
    ///Atributos
    private String nombre;
    private String jugadorTitular;
    private String jugadorSuplente;
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
    public String getJugadorSuplente() 
    {
        return jugadorSuplente;
    }
    public void setJugadorSuplente(String jugadorSuplente) 
    {
        this.jugadorSuplente = jugadorSuplente;
    }
    
        // Declaración el ArrayList
        //ArrayList<String> jugadorSuplente = new ArrayList<String>();

        // Añadimos 10 Elementos en el ArrayList
        //for (int i=1; i<=11; i++)
        //{
        //    jugadorSuplente.add("Elemento "+i); 
        //}
    
        // Añadimos un nuevo elemento al ArrayList en la posición 2
        //nombreArrayList.add(2, "Elemento 3");
    
        // Declaramos el Iterador e imprimimos los Elementos del ArrayList
        //Iterator<String> nombreIterator = nombreArrayList.iterator();
        //while(nombreIterator.hasNext())
        //{
        //    String elemento = nombreIterator.next();
        //    System.out.print(elemento+" / ");
        //}
}
