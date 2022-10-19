package eventos;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel saludo;
    private JTextField cajaTexto;
    private JButton boton;
    
    public Ventana(){
        setBounds(50,50,500,500);
        setTitle("Eventos");
        
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarCajaDeTexto();
        colocarBoton();
    }
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    private void colocarEtiqueta(){
        JLabel etiqueta = new JLabel("Ingrese su nombre: ");
        etiqueta.setBounds(30, 10, 200, 30);
        etiqueta.setFont(new Font("cooper black",0,15));
        panel.add(etiqueta);
    }
    private void colocarCajaDeTexto(){
        cajaTexto = new JTextField();
        cajaTexto.setBounds(30, 50, 300, 30);
        panel.add(cajaTexto);
    }
    private void colocarBoton(){
        boton = new JButton("¡Pulsa Aqui!");
        boton.setBounds(150, 100, 150, 40);
        boton.setFont(new Font("arial",0,15));
        panel.add(boton);
        
        saludo = new JLabel();
        saludo.setBounds(50, 200, 300, 40);
        saludo.setFont(new Font("arial",1,20));
        panel.add(saludo);
       
        //Agregando Evento de tipo ActionListener
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saludo.setText("Hola "+cajaTexto.getText());
            }
        };
        boton.addActionListener(oyenteDeAccion);
    }
}
