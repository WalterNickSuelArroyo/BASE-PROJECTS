package Codigo;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana  extends JFrame{
    private JPanel panel;
    private JLabel etiqueta;
    private JButton botonRojo,botonVerde,botonAzul;
    private int pulsado=0;
    private int contadorRojo=0,contadorVerde=0,contadorAzul=0;
    public Ventana(){
        setSize(600,400);
        setTitle("Ejercicio 3");
        setLocationRelativeTo(null);
        
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarBotones();
    }
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        
        eventoDeRuedaRaton();
    }
    private void colocarEtiqueta(){
        etiqueta = new JLabel("Color(Rojo, Verde, Azul)");
        etiqueta.setBounds(100, 30, 400, 50);
        etiqueta.setFont(new Font("arial",0,20));
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta);
    }
    private void colocarBotones() {
        /*
            pulsado = 1  -> botonRojo
            pulsado = 2  -> botonVerde
            pulsado = 3  -> botonAzul
        */
        botonRojo = new JButton("Rojo");
        botonRojo.setBounds(50, 230, 130, 50);
        botonRojo.setForeground(Color.red);
        botonRojo.setFont(new Font("arial rounded mt bold",0,20));
        panel.add(botonRojo);
        
        botonRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado=1;
            }
        });
        botonVerde = new JButton("Verde");
        botonVerde.setBounds(230, 230, 130, 50);
        botonVerde.setForeground(Color.GREEN);
        botonVerde.setFont(new Font("arial rounded mt bold",0,20));
        panel.add(botonVerde);
        
        botonVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado=2;
            }
        });
        botonAzul = new JButton("Azul");
        botonAzul.setBounds(410, 230, 130, 50);
        botonAzul.setForeground(Color.BLUE);
        botonAzul.setFont(new Font("arial rounded mt bold",0,20));
        panel.add(botonAzul);
        
        botonAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado=3;
            }
        });
    }
    private void eventoDeRuedaRaton() {
        MouseWheelListener eventoRueda = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if (pulsado !=0) {
                    if (pulsado==1) {
                        contadorRojo+=e.getWheelRotation();
                        if (contadorRojo<0) {
                            contadorRojo=0;
                        }
                        if (contadorRojo>255) {
                            contadorRojo=255;
                        }
                    }
                    else if (pulsado==2) {
                        contadorVerde+=e.getWheelRotation();
                        if (contadorVerde<0) {
                            contadorVerde=0;
                        }
                        if (contadorVerde>255) {
                            contadorVerde=255;
                        }
                    }
                    else{
                        contadorAzul+=e.getWheelRotation();
                        if (contadorAzul<0) {
                            contadorAzul=0;
                        }
                        if (contadorAzul>255) {
                            contadorAzul=255;
                        }
                    }
                }
                etiqueta.setText("Color (Rojo = "+contadorRojo+", Verde= "+contadorVerde+", Azul= "+contadorAzul+" )");
                panel.setBackground(new Color(contadorRojo,contadorVerde,contadorAzul));
            }
        };
        panel.addMouseWheelListener(eventoRueda);
    }
}
