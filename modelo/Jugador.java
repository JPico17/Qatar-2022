package modelo;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

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
    public Jugador(String nom, String ape, int ed, int nGol, String pos, String mar)
    {
        this.nombre=nom;
        this.apellido=ape;
        this.edad = ed;
        this.numgoles= nGol;
        this.posicion = pos;
        this.marcarTiSu = mar;


    }
    public Jugador() {
    }
    public String getMarcarTiSu() 
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
    public static Connection getJugador() {
        return null;
    }


    ///________________________________________


}
