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
        lbTitulo = new JLabel("Datos",JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 25));
        lbTitulo.setBounds(10,10,280,20);
        add(lbTitulo);
        
        lbNombre= new JLabel("Nombre (JD) = ",JLabel.RIGHT);
        lbNombre.setFont(new Font("Arial", Font.BOLD, 15));
        lbNombre.setBounds(10,50,140,20);
        add(lbNombre);
        txNombre = new JTextField();
        txNombre.setFont(new Font("Arial", Font.BOLD, 15));
        txNombre.setBounds(150,50,200,20);
        add(txNombre);
        
        lbApellido = new JLabel("Apellido = ",JLabel.RIGHT);
        lbApellido.setFont(new Font("Arial", Font.BOLD, 15));
        lbApellido.setBounds(10,90,140,20);
        add(lbApellido);
        txApellido = new JTextField();
        txApellido.setFont(new Font("Arial", Font.BOLD, 15));
        txApellido.setBounds(150,90,200,20);
        add(txApellido);

        lbPosicion = new JLabel("Posicion = ",JLabel.RIGHT);
        lbPosicion.setFont(new Font("Arial", Font.BOLD, 15));
        lbPosicion.setBounds(10,140,140,20);
        add(lbPosicion);
        cbPosicion = new JComboBox();
        for(int i=0; i<posicion.length;i++)
        {
            cbPosicion.addItem(posicion[i]);
        }
        cbPosicion.setBounds(150,140,200,20);
        this.add(cbPosicion);

        lbEdad = new JLabel("Edad = ",JLabel.RIGHT);
        lbEdad.setFont(new Font("Arial", Font.BOLD, 15));
        lbEdad.setBounds(10,180,140,20);
        add(lbEdad);
        txEdad = new JTextField();
        txEdad.setFont(new Font("Arial", Font.BOLD, 15));
        txEdad.setBounds(150,180,200,20);
        add(txEdad);

        lbnumGoles = new JLabel("Goles = ",JLabel.RIGHT);
        lbnumGoles.setFont(new Font("Arial", Font.BOLD, 15));
        lbnumGoles.setBounds(10,220,140,20);
        add(lbnumGoles);
        txnumGoles = new JTextField();
        txnumGoles.setFont(new Font("Arial", Font.BOLD, 15));
        txnumGoles.setBounds(150,220,200,20);
        add(txnumGoles);

        lbMarcar = new JLabel("Marcar = ",JLabel.RIGHT);
        lbMarcar.setFont(new Font("Arial", Font.BOLD, 15));
        lbMarcar.setBounds(10,260,130,20);
        add(lbMarcar);
        cbMarcar = new JComboBox();
        for(int i=0; i<marcar.length;i++)
        {
            cbMarcar.addItem(marcar[i]);
        }
        cbMarcar.setBounds(150,260,100,20);
        this.add(cbMarcar);
        
        //Boton
        btAceptar = new JButton("Aceptar");
        btAceptar.setFont(new Font("Arial", Font.ITALIC, 20));
        btAceptar.setBounds(80,290,160,25);
        btAceptar.setActionCommand("aceptar");
        add(btAceptar);
               
        //Caracteristicas de la ventana
        setTitle("Datos del Jugador");
        setSize(380,400);
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

    public String getMarcarTiSu()
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
