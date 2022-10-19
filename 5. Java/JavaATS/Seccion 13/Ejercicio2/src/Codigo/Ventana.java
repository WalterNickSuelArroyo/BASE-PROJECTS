
package Codigo;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class Ventana  extends JFrame{
    private JPanel panel;
    private JLabel etiqueta,imagen;
    private JRadioButton rb1,rb2,rb3,rb4;
    public Ventana(){
        setSize(700,400);
        setTitle("Ejercicio 2");
        setLocationRelativeTo(null);
        
        
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarRadioBotones();
    }
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    private void colocarEtiqueta(){
        etiqueta = new JLabel("Escoja su deporte favorito");
        etiqueta.setBounds(20, 10, 250, 40);
        etiqueta.setFont(new Font("arial",0,18));
        panel.add(etiqueta);
    }
    private void colocarRadioBotones(){
        rb1 = new JRadioButton("Futbol");
        rb1.setBounds(20, 80, 100, 40);
        rb1.setFont(new Font("arial rounded mt bold",0,18));
        panel.add(rb1);
        
        rb2 = new JRadioButton("Baloncesto");
        rb2.setBounds(20, 140, 150, 40);
        rb2.setFont(new Font("arial rounded mt bold",0,18));
        panel.add(rb2);
        
        rb3 = new JRadioButton("Tenis");
        rb3.setBounds(20, 200, 150, 40);
        rb3.setFont(new Font("arial rounded mt bold",0,18));
        panel.add(rb3);
        
        rb4 = new JRadioButton("Natacion");
        rb4.setBounds(20, 260, 150, 40);
        rb4.setFont(new Font("arial rounded mt bold",0,18));
        panel.add(rb4);
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rb1);
        grupo.add(rb2);
        grupo.add(rb3);
        grupo.add(rb4);
        
        eventoDeAccion();
    }
    private void eventoDeAccion(){   
        imagen = new JLabel();
        imagen.setBounds(200, 80, 400, 220);
        panel.add(imagen);
        
        ImageIcon imagenFutbol = new ImageIcon(getClass().getResource("/Imagenes/futbol.jpg"));
        ImageIcon imagenBaloncesto = new ImageIcon(getClass().getResource("/Imagenes/baloncesto.jpg"));
        ImageIcon imagenTenis = new ImageIcon(getClass().getResource("/Imagenes/tenis.jpg"));
        ImageIcon imagenNatacion = new ImageIcon(getClass().getResource("/Imagenes/natacion.jpg"));

        ActionListener eventoAccion1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenFutbol.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        rb1.addActionListener(eventoAccion1);
        ActionListener eventoAccion2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenBaloncesto.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        rb2.addActionListener(eventoAccion2);
        ActionListener eventoAccion3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenTenis.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        rb3.addActionListener(eventoAccion3);
        ActionListener eventoAccion4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenNatacion.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        rb4.addActionListener(eventoAccion4);
    }
}
