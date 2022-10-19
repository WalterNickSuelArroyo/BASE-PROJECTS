package eventos;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel saludo;
    private JTextField cajaTexto;
    private JButton boton;
    private JTextArea areaTexto;
    
    public Ventana(){
        setBounds(50,50,500,500);
        setTitle("Eventos");
        
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes(){
        colocarPanel();
        colocarAreaTexto();
        colocarBoton();
    }
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    private void colocarAreaTexto(){
        areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 200, 300);
        panel.add(areaTexto);
    }  
    private void colocarBoton(){
        boton = new JButton("¡Pulsa Aqui!");
        boton.setBounds(150, 350, 150, 40);
        boton.setFont(new Font("arial",0,15));
        panel.add(boton);
        
        eventoOyenteDeRaton();
    }
    private void eventoOyenteDeRaton(){     
        //Agregando Oyente de Raton - MouseListener
        MouseListener oyenteDeRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.isAltDown()) {
                    areaTexto.append("Alt\n");
                }
                else if (e.isControlDown()) {
                    areaTexto.append("Control\n");
                }
                else if (e.isShiftDown()) {
                    areaTexto.append("Shift\n");
                }
                else if (e.isMetaDown()) {
                    areaTexto.append("Click derecho\n");
                }
                else {
                    areaTexto.append("Click izquierdo\n");
                }
                if (e.getClickCount()==2) {
                    areaTexto.append("Doble click\n");
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {
                //areaTexto.append("mousePressed\n");
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                //areaTexto.append("mouseReleased\n");
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                //areaTexto.append("mouseEntered\n");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                //areaTexto.append("mouseExited\n");
            }
        };
        boton.addMouseListener(oyenteDeRaton);
    }
}
