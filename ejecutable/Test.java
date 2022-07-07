package ejecutable;

import controlador.Controlador;
import modelo.Equipo;
import modelo.Jugador;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Jugador miJugador = null;
        Equipo miEquipo = null;
        Controlador miControlador = new Controlador(miVentana, miEquipo, miJugador);
        
    }
    
}
