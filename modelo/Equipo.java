package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Equipo
{
    //Atributos
    private String pais;
    private String continente;
    private String nombreDirector;
    private int copasGana;
    private String equipoPertenece;
    private int numEqiposDirigidos;
    private String jugadorTitular;
    private String jugadorSuplente;
    

    //Metodos
    public Equipo(String cPais, String con,String director, int cGanadas, String pertenece, int eDirigidos,String jTitular, String jSuplente)
    {
        this.pais = cPais;
        this.continente = con;
        this.nombreDirector = director;
        this.copasGana = cGanadas;
        this.equipoPertenece = pertenece;
        this.numEqiposDirigidos = eDirigidos;
        this.jugadorTitular=jTitular;
        this.jugadorSuplente=jSuplente;
    }

    public String getPais() 
    {
        return pais;
    }
    public void setPais(String pais) 
    {
        this.pais = pais;
    }

    public String getContinente() 
    {
        return continente;
    }
    public void setContinente(String continente) 
    {
        this.continente = continente;
    }

    public String getnombreDirector() 
    {
        return nombreDirector;
    }
    public void setNombreEquipo(String nombreDirector) 
    {
        this.nombreDirector = nombreDirector;
    }

    public int getCopasGana() 
    {
        return copasGana;
    }
    public void setCopasGana(int copasGana) 
    {
        this.copasGana = copasGana;
    }

    public String getEquipoPertenece() 
    {
        return equipoPertenece;
    }

    public void setEquipoPertenece(String equipoPertenece) 
    {
        this.equipoPertenece = equipoPertenece;
    }

    public int getNumEqiposDirigidos() 
    {
        return numEqiposDirigidos;
    }

    public void setNumEqiposDirigidos(int numEqiposDirigidos) 
    {
        this.numEqiposDirigidos = numEqiposDirigidos;
    }
    public String getJugadorSuplente() 
    {
        return jugadorSuplente;
    }
    public void setJugadorSuplente(String jugadorSuplente) 
    {
        this.jugadorSuplente = jugadorSuplente;
    }
    public String getJugadorTitular() 
    {
        return jugadorTitular;
    }
    public void setJugadorTitular(String jugadorTitular) 
    {
        this.jugadorTitular = jugadorTitular;
    }
    //private ArrayList<Jugador> jTitular;
    //public ArrayList setjugador(){  
    //    Scanner cin = new Scanner (System.in); 
    //    jTitular = new ArrayList<Jugador>();
    //    Jugador jug = new Jugador();
    //    System.out.println("Escriba su nombre: ");
    //    String name = cin.next();
    //    jug.setNombre(name);
    //    jTitular.add(new Jugador());
        
    //    System.out.println("Desea ver el arraylist: \n1-Si \n2-No");
    //    int selec =cin.nextInt();
        
    //    if(selec==1){
    //        for (int t=0;t<=jTitular.size();t++){
    //            System.out.println(jTitular.get(t));
    //        }
    //    }
    //    return jTitular;
    //}

    public ArrayList<Jugador> ConsultarDatosEst(String jugadorTitular)
    {
 
        //Lo primero el ArrayList de Objeto Estudiante 
        ArrayList<Jugador>  consultaDatEst= new ArrayList<Jugador>();
     
        //Instanciamos la Clase Estudiantes
        Jugador jugador;
     
        //Manejo de posibles exceptions con try() catch() , creamos conexión y realizamos la Query
        try {
            Connection accesoDB= Jugador.getJugador();
            PreparedStatement cs=accesoDB.prepareCall("SELECT ID_EST, NOMBRES, APELLIDOS FROM `estudiantes` WHERE IDENTIFICACION='"+jugadorTitular+"'");
     
            //Objeto ResulSet para recoger los datos de la Query realizada anteriormente
            ResultSet rs= cs.executeQuery();
     
            /*Mientras que hayan resultados en el ResulSet estaremos creando objetos usuarios
              y los iremos añadiendo al ArrayList de Objeto Estudiante*/
     
            while(rs.next()){
                jugador = new Jugador();
     
                //jugador.setId_est(rs.getInt(1));//<---Ojo quizás aquí tengas que poner el nombre de la columna ejemplo "id_estudiante"
                jugador.setNombre(rs.getString(2));//<---Ojo quizás aquí tengas que poner el nombre de la columna ejemplo "nombre_est"
                //estudiantes.setApellidos(rs.getString(3));//<---Ojo quizás aquí tengas que poner el nombre de la columna ejemplo "apellido_est"
     
                //Añadimos el Objeto al ArrayList de Objetos Estudiantes
                consultaDatEst.add(jugador);
            }
        } catch (Exception e) {

        }
        //Y Aquí retornamos la lista cargada de Objetos Estudiantes
        return consultaDatEst;
    }
   
}
