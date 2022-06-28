package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.VentanaPrincipal;
import modelo.Jugador;
import modelo.Equipo;
import modelo.Director;

public class Controlador implements ActionListener
{
    
        //------------
        // Atributos
        //------------
    
        private VentanaPrincipal vista;
        private Equipo modelo;
        private Jugador modelo2;
        private Director modelo3;
    
        //------------
        // Metodos
        //------------
    
        //metodo constructor
        public Controlador(VentanaPrincipal pVista, Equipo pModelo, Jugador pModelo2, Director pModelo3)
        {
            this.vista = pVista;
            this.modelo= pModelo;
            this.modelo2= pModelo2;
            this.modelo3= pModelo3;
            this.vista.miPanelOperaciones.btJugador.addActionListener(this);
            this.vista.miPanelOperaciones.btMosDatos.addActionListener(this);
            this.vista.miPanelOperaciones.btSalir.addActionListener(this);      
        }
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            // Identificar el comando generado [hallar,borrar, salir]
            String comando = ae.getActionCommand();
            
            if(comando.equals("Salir"))
            {
                System.exit(0);
            }

            if(comando.equals("D.Jugador"))
            {
                vista.crearDialogoJugador();
                this.vista.miDialogoJugador.agregarOyentesBotones(this);
            }
            
            if(comando.equals("M. Datos"))
            {
                String pais = vista.miPanelEntradaDatos.getPais();
                String continente = vista.miPanelEntradaDatos.getContinente();
                modelo = new Equipo(pais, continente);
                vista.miPanelResultados.mostrarResultado("Los datos del equipo son los siguientes: \nPais = " + modelo.getPais() + "\nContinente = " + modelo.getContinente());
                vista.miPanelOperaciones.activarBoton();

                if(comando.equals("aceptar"))
                {
                    String nombre = vista.miDialogoJugador.getNombre();
                    String apellido = vista.miDialogoJugador.getApellido();
                    int edad = Integer.parseInt(vista.miDialogoJugador.getEdad());
                    String posicion = vista.miDialogoJugador.getPosicion();
                    int numgoles = Integer.parseInt(vista.miDialogoJugador.getNumgoles());
                    String marcarTiSu = vista.miDialogoJugador.getmarcarTiSu();
    
                    modelo2 = new Jugador();
                    vista.miPanelResultados.mostrarResultado("Datos del Jugador: \nNombre = " + modelo2.getNombre() );
                    vista.miDialogoJugador.cerrarDialogo();  
            }
            }   
        }
}
