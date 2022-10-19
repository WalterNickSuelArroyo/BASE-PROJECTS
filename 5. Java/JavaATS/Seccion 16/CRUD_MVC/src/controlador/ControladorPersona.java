
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JOptionPane;
import modelo.ConsultasPersona;
import modelo.Persona;
import vista.VistaPersona;

public class ControladorPersona implements ActionListener{
    private VistaPersona vista;
    private Persona persona;
    private ConsultasPersona modelo;

    public ControladorPersona(VistaPersona vista, Persona persona, ConsultasPersona modelo) {
        this.vista = vista;
        this.persona = persona;
        this.modelo = modelo;
        vista.botonInsertar.addActionListener(this);
        vista.botonLimpiar.addActionListener(this);
    }
    public void iniciar(){
        vista.setTitle("CRUD MVC");
        vista.setLocationRelativeTo(null);
        vista.cajaID.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==vista.botonInsertar) {
            persona.setClave(vista.cajaClave.getText());
            persona.setNombre(vista.cajaNombre.getText());
            persona.setDomicilio(vista.cajaDomicilio.getText());
            persona.setCelular(vista.cajaCelular.getText());
            persona.setCorreo_electronico(vista.cajaCorreoElectronico.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.cajaFechaNacimiento.getText()));
            persona.setGenero(vista.comboGenero.getSelectedItem().toString());
            
            if (modelo.insertar(persona)) {
                JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                limpiarCajas();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al insertar Registro");
                limpiarCajas();
            }
        }
        if(ae.getSource()==vista.botonLimpiar){
            limpiarCajas();
        }
        
    }
    public void limpiarCajas(){
        vista.cajaBuscar.setText(null);
        vista.cajaClave.setText(null);
        vista.cajaNombre.setText(null);
        vista.cajaDomicilio.setText(null);
        vista.cajaCelular.setText(null);
        vista.cajaCorreoElectronico.setText(null);
        vista.cajaFechaNacimiento.setText(null);
        vista.comboGenero.setSelectedIndex(0);
    }
}
