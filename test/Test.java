package test;

import modelo.Equipo;
import modelo.Jugador;

public class Test {
    public static void main(String[] args) {
        Jugador miJugador = new Jugador("", 0);
        miJugador.setGoles(10);
        miJugador.setNombre("Jean");
        System.out.println("El nombre del jugador es : " + miJugador.getNombre());
        System.out.println("y la cantidad de goles : " + miJugador.getGoles());

        Equipo miEquipo = new Equipo("PSG", 3);
        miEquipo.crearJugador();
        miEquipo.calcularTotalGoles();
        System.out.println("Se creo un nuevo jugador: " + miEquipo.calcularTotalGoles());
    }
}