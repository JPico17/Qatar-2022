package ejecutable;

import controlador.Controlador;
import modelo.Director;
import modelo.Equipo;
import modelo.Jugador;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Jugador miModelo = new Jugador();
        Equipo miEquipo = new Equipo("","");
        Director miDirector = new Director();
        Controlador miControlador = new Controlador(miVentana, null, miModelo, null);
        
    }
    
}
