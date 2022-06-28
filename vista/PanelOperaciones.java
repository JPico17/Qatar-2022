package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
        //---------------
    // Atributos
    // --------------
    public JButton btJugador;
    public JButton btMosDatos;
    public JButton btSalir;

    //---------------
    // Metodos
    // --------------

    /*Metodo constructor */
    public PanelOperaciones()
    {
        // Definicion contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //crear y agregar boton hallar
        btJugador = new JButton("Jugador");
        btJugador.setBounds(310,40,215,60);
        this.add(btJugador);
        btJugador.setActionCommand("Jugador");

        // crear y agregar boton 
        btMosDatos = new JButton("M. Datos");
        btMosDatos.setBounds(45,40,215,60);
        this.add(btMosDatos);
        btMosDatos.setActionCommand("M. Datos");

        // crear y agregar boton salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(550,40,215,60);
        this.add(btSalir);
        btSalir.setActionCommand("Salir");

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("Operacion Datos");
        borde.setTitleColor(Color.RED);
        this.setBorder(borde);
    }
    public void activarBoton()
    {
        btJugador.setEnabled(true);
    }
}
