package Ejercicio1_Ejemplo;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    private JPanel panel;
    private JButton boton;
    private JLabel etiqueta;
    private int contador=0;
    public Ventana(){
        setSize(400,400);
        setTitle("Ejercicio 1 - Contador de click");
        setLocationRelativeTo(null);//centramos ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarBoton();
    }
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    private void colocarEtiqueta(){
        etiqueta = new JLabel();
        etiqueta.setText("Pulsa el boton");
        etiqueta.setFont(new Font("arial",0,20));
        etiqueta.setBounds(0, 50, 400, 40);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        
        panel.add(etiqueta);
    }
    private void colocarBoton(){
        boton = new JButton("Pulsa Aqui");
        boton.setBounds(90, 250, 200, 50);
        boton.setHorizontalAlignment(SwingConstants.CENTER);
        boton.setFont(new Font("cooper black",0,20));
        panel.add(boton);
        
        eventoDeAccion();
    }
    private void eventoDeAccion(){
        ActionListener eventoAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++;
                if(contador==1){
                    etiqueta.setText("Has presionado el boton 1 vez");
                }
                else {
                    etiqueta.setText("Has presionado el boton " +contador+" veces");
                }
            }
        };
        boton.addActionListener(eventoAccion);
    }
}
