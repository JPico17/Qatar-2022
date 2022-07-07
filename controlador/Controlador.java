package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.VentanaPrincipal;
import modelo.Jugador;
import modelo.Equipo;

public class Controlador implements ActionListener
{
    
        //------------
        // Atributos
        //------------
    
        private VentanaPrincipal vista;
        private Equipo modelo;
        private Jugador modelo2;
    
        //------------
        // Metodos
        //------------
    
        //metodo constructor
        public Controlador(VentanaPrincipal pVista, Equipo pModelo, Jugador pModelo2)
        {
            this.vista = pVista;
            this.modelo= pModelo;
            this.modelo2= pModelo2;
            this.vista.miPanelOperaciones.agregarOyentesBotones(this);      
        }
        
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
        String comando = ae.getActionCommand();
        
        if(comando.equals("M. Datos"))
        {   
            //Validar datos entrada
            try
            {
                String pais = vista.miPanelEntradaDatos.getPais();
                String continente = vista.miPanelEntradaDatos.getContinente();
                String nombreDirector = vista.miPanelEntradaDatos.getnombreDirector();
                int copasGana = Integer.parseInt(vista.miPanelEntradaDatos.getCopasGana());
                String equipoPertenece = vista.miPanelEntradaDatos.getEquipoPertenece();
                int numEqiposDirigidos = Integer.parseInt(vista.miPanelEntradaDatos.getNumEquiposDirigidos());
                //String jugadorTitular = vista.miPanelEntradaDatos.getJugadorTitular();
                //String jugadorTitular = vista.miPanelEntradaDatos.getJugadorTitular();
                
            
                //Creación del objeto tipo Carro
                modelo = new Equipo(pais, continente, nombreDirector, copasGana, equipoPertenece, numEqiposDirigidos, equipoPertenece, equipoPertenece);
                
                vista.miPanelResultados.mostrarResultado("\nSe ha creado un nuevo equipo : " + 
                "\nEl equipo es : " + modelo.getPais()+"\nSu continente es : " + modelo.getContinente() + 
                "\nSu director es : " + modelo.getnombreDirector() + "\nCopas ganadas : " + modelo.getCopasGana()+ 
                "\nEl equipo al que pertenece es : " + modelo.getPais() +
                "\nEl numero de equipos dirigidos es : " + modelo.getNumEqiposDirigidos());
                
                //Activar botones
                vista.miPanelOperaciones.activarBotones();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
            }   
        }
        
        if(comando.equals("Jugador"))
        {   
            vista.crearDialogoJugador();
            this.vista.miDialogoJugador.agregarOyentesBotones(this);  
        }
        
        if(comando.equals("aceptar"))
        {
            String nombre = vista.miDialogoJugador.getNombre();
            String apellido = vista.miDialogoJugador.getApellido();
            int edad = Integer.parseInt(vista.miDialogoJugador.getEdad());
            int numgoles = Integer.parseInt(vista.miDialogoJugador.getNumgoles());
            String posicion = vista.miDialogoJugador.getPosicion();
            String marcarTiSu = vista.miDialogoJugador.getMarcarTiSu();
            //String jugadorTitular = modelo.miDialogoJugador.consultaDatEst;
            modelo2 = new Jugador(nombre,apellido,edad,numgoles,posicion,marcarTiSu);
            vista.miPanelResultados.mostrarResultado("\nDatos Jugador: " + "\nNombre : " + modelo2.getNombre() + 
            "\nApellido : " + modelo2.getApellido() + "\nEdad : " + modelo2.getEdad() +
            "\nNumero de goles marcados : " + modelo2.getNumgoles()+
            "\nSu posicion es : " + modelo2.getPosicion()+
            "\nEs jugador : " + modelo2.getMarcarTiSu());
            vista.miDialogoJugador.cerrarDialogo();
        }
        if(comando.equals("Salir"))
            {
                System.exit(0);
            }
            
    }
}