package modelo;

import javax.swing.JOptionPane;

public class Equipo
{
    //Atributos
    private String nombreEquipo;
    private int numJugadores;
    private Jugador[] jugadores;

    //Metodos
    public Equipo(String nom, int n)
    {
        nombreEquipo = nom;
        numJugadores = n;
        jugadores = new Jugador[n];
    }

    public void cargar()
    {
        for(int i=0; i< numJugadores;i++)
        {
            jugadores[i] = crearJugador();
        }
    }

    public Jugador crearJugador()
    {
        String nom = "";
        int goles = 0;
        nom = JOptionPane.showInputDialog("Nombre del jugador: ");
        goles = Integer.parseInt(JOptionPane.showInputDialog("Goles del jugador: "));
        return new Jugador(nom, goles);
    }

    public int calcularTotalGoles()
    {
        int totalGolesEquipo = 0;
        for(int i=0; i<numJugadores; i++)
        {
            totalGolesEquipo = totalGolesEquipo + jugadores[i].getGoles();
        }
        return totalGolesEquipo;
    }
}