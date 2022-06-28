package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //---------------
    // Atributos
    // --------------
    private JLabel lx;
    private JLabel ly;
    private JLabel lz;
    private JLabel lw;
    private JLabel lw2;
    private JTextField tfx;
    private JTextField tfy;
    private JTextField tfz;
    private JTextField tfw;
    private JTextField tfw2;
    private JComboBox cbEqipos;
    private String[] equipos = {"Qatar", "Argentina", "Alemania", "Dinamarca", "Brasil", "Serbia", "Croacia", "España", "Francia"
    , "Bélgica", "Suiza", "Inglaterra", "Holanda", "Irán", "Corea del Sur", "Canadá", "Arabia Saudí"
    , "Uruguay", "Japón", "Ecuador", "Ghana", "Senegal", "Portugal", "Polonia", "Marruecos", "Túnez", "Camerún"
    , "México", "Estados Unidos", "Gales", "Australia", "Costa Rica"};
    private JComboBox cbContinentes;
    private String[] continente = {"America", "Europa", "Asia", "Africa"};
    private JLabel lImagen;
    private ImageIcon iImagen;
    

    //---------------
    // Metodos
    // --------------

    /*Metodo constructor */
    public PanelEntradaDatos()
    {
        //crear y agregar imagen
        iImagen = new ImageIcon(("Qatar.png"));
        lImagen = new JLabel(iImagen);
        lImagen.setBounds(50,27,238,212);
        this.add(lImagen);

        // crear y agregar etiqueta x
        lx = new JLabel("Nombre y Apellido (Dt) =");
        lx.setBounds(290, 40, 200, 20);
        this.add(lx);

        //crear caja de texto x
        tfx = new JTextField();
        tfx.setBounds(480,40,150,20);
        this.add(tfx);

        // crear y agregar etiqueta y
        ly = new JLabel("Copas Ganadas =");
        ly.setBounds(290, 90, 200, 20);
        this.add(ly);

        //crear caja de texto y
        tfy = new JTextField();
        tfy.setBounds(480,90,50,20);
        this.add(tfy);

        // crear y agregar etiqueta y
        lz = new JLabel("Numero de equipos dirigidos =");
        lz.setBounds(290, 140, 300, 20);
        this.add(lz);

        //crear caja de texto y
        tfz = new JTextField();
        tfz.setBounds(550,140,80,20);
        this.add(tfz);

        // crear y agregar etiqueta x
        lw = new JLabel("Paises=");
        lw.setBounds(290, 200, 120, 20);

        cbEqipos = new JComboBox();
        for(int i=0; i<equipos.length;i++)
        {
            cbEqipos.addItem(equipos[i]);
        }
        cbEqipos.setBounds(350,200,100,20);
        this.add(cbEqipos);

        lw2 = new JLabel("Continentes=");
        lw2.setBounds(500, 200, 120, 20);

        cbContinentes = new JComboBox();
        for(int i=0; i<continente.length;i++)
        {
            cbContinentes.addItem(continente[i]);
        }
        cbContinentes.setBounds(600,200,100,20);
        this.add(cbContinentes);
        
        this.add(lx);
        this.add(ly);
        this.add(lz);
        this.add(lw);
        this.add(lw2);

        // Definicion contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    // metodos de acceso a la informacion 
    public String getnombreDirector()
    {
        return tfx.getText();
    }

    public String getCopasGana()
    {
        return tfy.getText();
    }

    public String getEquipoPertenece()
    {
        return tfz.getText();
    }

    public String getPais()
    {
        return (String) cbEqipos.getSelectedItem();
    }

    public String getContinente()
    {
        return (String) cbContinentes.getSelectedItem();
    }
    // metodo borrar cajas de texto
    public void borrar()
    {
        tfx.setText("");
        tfy.setText("");
        tfz.setText("");
    }
    

}
