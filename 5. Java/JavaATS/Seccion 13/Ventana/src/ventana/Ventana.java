package ventana;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
public class Ventana extends JFrame{
    public JPanel panel;
    public Ventana(){
        setSize(900, 900);
        setTitle("El mejor titulo"); 
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200,200)); 
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes(){
        colocarPaneles();
        colocarListas();
    }
    private void colocarPaneles(){
        panel = new JPanel(); //Creacion de un panel
        panel.setLayout(null); //Desactivamos el diseño por defecto
        this.getContentPane().add(panel);//Agregamos el panel a la ventana
    }
    private void colocarListas(){
        DefaultListModel modelo = new DefaultListModel();
        
        modelo.addElement(new Persona("Alejandro Taboada", 21, "Peruano"));
        modelo.addElement(new Persona("Alejandr Marin", 25, "Brasileño"));
        modelo.addElement(new Persona("Maria Torres", 26, "Chileno"));
        modelo.addElement(new Persona("Alejandro Taboada", 21, "Peruano"));
        modelo.addElement(new Persona("Alejandr Marin", 25, "Brasileño"));
        modelo.addElement(new Persona("Maria Torres", 26, "Chileno"));
        modelo.addElement(new Persona("Alejandro Taboada", 21, "Peruano"));
        modelo.addElement(new Persona("Alejandr Marin", 25, "Brasileño"));
        modelo.addElement(new Persona("Maria Torres", 26, "Chileno"));
        modelo.addElement(new Persona("Alejandro Taboada", 21, "Peruano"));
        modelo.addElement(new Persona("Alejandr Marin", 25, "Brasileño"));
        modelo.addElement(new Persona("Maria Torres", 26, "Chileno"));
        modelo.addElement(new Persona("Alejandro Taboada", 21, "Peruano"));
        modelo.addElement(new Persona("Alejandr Marin", 25, "Brasileño"));
        modelo.addElement(new Persona("Maria Torres", 26, "Chileno"));
        
        JList lista = new JList(modelo);
        lista.setBounds(20, 20, 200, 300);
        panel.add(lista);
        
        JScrollPane scroll = new JScrollPane(lista, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 300, 200);
        panel.add(scroll);
    }
}
