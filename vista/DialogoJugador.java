package vista;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DialogoJugador extends JDialog
{
    //----------------------
    //Atributos
    //----------------------
    private JLabel lbTitulo;
    private JLabel lbNombre; //nombre 
    private JLabel lbApellido; //apellido
    private JLabel lbPosicion; // posicion
    private JLabel lbEdad; // edad 
    private JLabel lbnumGoles; // numero de goles 
    private JLabel lbMarcar; // marcar titular o suplente
    private JTextField txNombre;
    private JTextField txApellido;
    private JTextField txEdad;
    private JTextField txnumGoles;
    private JComboBox cbPosicion;
    private String[] posicion = {"Portero", "Lateral Derecho", "Central Derecho",
    "Central Izquierdo","Lateral Izquierdo","Volante Derecho","Volante centro Derecho"
    ,"Volante centro Izquierdo","Volante Izquierdo","Delantero Derecho", "Delantero Izquierdo"};
    private JComboBox cbMarcar;
    private String[] marcar = {"Titular", "Suplente"};
    private JButton btAceptar;

    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public DialogoJugador()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        
        //Creación y adición del elementos
        lbTitulo = new JLabel("Datos del Jugador",JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 25));
        lbTitulo.setBounds(10,10,280,20);
        add(lbTitulo);
        
        lbNombre= new JLabel("Nombre (JD) = ",JLabel.RIGHT);
        lbNombre.setFont(new Font("Arial", Font.BOLD, 25));
        lbNombre.setBounds(10,50,140,20);
        add(lbNombre);
        txNombre = new JTextField();
        txNombre.setFont(new Font("Arial", Font.BOLD, 25));
        txNombre.setBounds(60,50,140,20);
        add(txNombre);
        
        lbApellido = new JLabel("Apellido = ",JLabel.RIGHT);
        lbApellido.setFont(new Font("Arial", Font.BOLD, 25));
        lbApellido.setBounds(10,80,90,20);
        add(lbApellido);
        txApellido = new JTextField();
        txApellido.setFont(new Font("Arial", Font.BOLD, 15));
        txApellido.setBounds(60,50,140,20);
        add(txApellido);

        lbPosicion = new JLabel("Posicion = ",JLabel.RIGHT);
        lbPosicion.setFont(new Font("Arial", Font.BOLD, 15));
        lbPosicion.setBounds(10,140,85,20);
        add(lbPosicion);
        cbPosicion = new JComboBox();
        for(int i=0; i<posicion.length;i++)
        {
            cbPosicion.addItem(posicion[i]);
        }
        cbPosicion.setBounds(110,140,180,20);
        this.add(cbPosicion);

        lbEdad = new JLabel("Edad = ",JLabel.RIGHT);
        lbEdad.setFont(new Font("Arial", Font.BOLD, 15));
        lbEdad.setBounds(10,110,60,20);
        add(lbEdad);
        txEdad = new JTextField();
        txEdad.setFont(new Font("Arial", Font.BOLD, 15));
        txEdad.setBounds(60,50,140,20);
        add(txEdad);

        lbnumGoles = new JLabel("Goles = ",JLabel.RIGHT);
        lbnumGoles.setFont(new Font("Arial", Font.BOLD, 15));
        lbnumGoles.setBounds(15,170,60,20);
        add(lbnumGoles);
        txnumGoles = new JTextField();
        txnumGoles.setFont(new Font("Arial", Font.BOLD, 15));
        txnumGoles.setBounds(60,50,140,20);
        add(txnumGoles);

        lbMarcar = new JLabel("Marcar = ",JLabel.RIGHT);
        lbMarcar.setFont(new Font("Arial", Font.BOLD, 15));
        lbMarcar.setBounds(300,50,130,20);
        add(lbMarcar);
        cbMarcar = new JComboBox();
        for(int i=0; i<marcar.length;i++)
        {
            cbMarcar.addItem(marcar[i]);
        }
        cbMarcar.setBounds(440,50,80,20);
        this.add(cbMarcar);
        
        //Boton
        btAceptar = new JButton("Aceptar");
        btAceptar.setFont(new Font("Arial", Font.BOLD, 25));
        btAceptar.setBounds(20,140,260,25);
        btAceptar.setActionCommand("aceptar");
        add(btAceptar);
               
        //Caracteristicas de la ventana
        setTitle("Datos del Jugador");
        setSize(600,600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public String getNombre()
    {
        return txNombre.getText();
    }
    
    public String getApellido()
    {
        return txApellido.getText();
    }

    public String getPosicion()
    {
        return (String) cbPosicion.getSelectedItem();
    }

    public String getEdad()
    {
        return txEdad.getText();
    }

    public String getNumgoles()
    {
        return txnumGoles.getText();
    }

    public String getmarcarTiSu()
    {
        return (String) cbMarcar.getSelectedItem();
    }
    
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAceptar.addActionListener(pAL);
    }
    
    public void cerrarDialogo()
    {
        this.dispose();
    }  
}
