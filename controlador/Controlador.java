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
        }
}
