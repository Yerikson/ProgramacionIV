
package vista;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class Captacion extends JPanel{
    
    public JTextField numeroIdentidad = new JTextField();
    public JTextField primerNombre = new JTextField();
    public JTextField primerApellido = new JTextField();
    public JTextField segundoApellido = new JTextField();
    public JTextField telefonoDeCasa = new JTextField();
    public JTextField telefonoMovil = new JTextField();
    
    public JButton validar = new JButton("Validar");
    
    JLabel labelMensaje = new JLabel("Por Favor Llene Los Siguientes Campos: ");
    JLabel label0 = new JLabel("Número De Identidad: ");
    JLabel label1 = new JLabel("Primer Nombre: ");
    JLabel label2 = new JLabel("Primer Apellido: ");
    JLabel label3 = new JLabel("Segundo Apellido: ");
    JLabel label4 = new JLabel("Teléfono Fijo: ");
    JLabel label5 = new JLabel("Teléfono Móvil: ");
    
    public Captacion() {
        
        this.setBounds(0, 0, 1200, 600);
        this.setLayout(null);        
        this.setBackground(Color.BLACK);        
        ubicarElementos1();
    }
    
    
    
    public void ubicarElementos1(){
        
        //Mensaje
        this.labelMensaje.setBounds(200, 50, 250, 25);
        this.labelMensaje.setForeground(Color.WHITE);
        this.add(this.labelMensaje);
        
        //Número Identidad
        this.label0.setBounds(450, 100, 150, 25);
        this.label0.setForeground(Color.WHITE);
        this.add(this.label0);
        this.numeroIdentidad.setBounds(605, 100, 100, 25);        
        this.add(this.numeroIdentidad);
        
        //Primer Nombre
        this.label1.setBounds(450, 130, 150, 25);
        this.label1.setForeground(Color.WHITE);
        this.add(this.label1);
        this.primerNombre.setBounds(605, 130, 100, 25);        
        this.add(this.primerNombre);
        
        //Primer Apellido
        this.label2.setBounds(450, 160, 150, 25);
        this.label2.setForeground(Color.WHITE);
        this.add(this.label2);
        this.primerApellido.setBounds(605, 160, 100, 25);        
        this.add(this.primerApellido);
        
        //Segundo Apellido
        this.label3.setBounds(450, 190, 150, 25);
        this.label3.setForeground(Color.WHITE);
        this.add(this.label3);
        this.segundoApellido.setBounds(605, 190, 100, 25);        
        this.add(this.segundoApellido);
        
        //Teléfono Fijo
        this.label4.setBounds(450, 220, 150, 25);
        this.label4.setForeground(Color.WHITE);
        this.add(this.label4);
        this.telefonoDeCasa.setBounds(605, 220, 100, 25);        
        this.add(this.telefonoDeCasa);
        
        //Teléfono Móvil
        this.label5.setBounds(450, 250, 150, 25);
        this.label5.setForeground(Color.WHITE);
        this.add(this.label5);
        this.telefonoMovil.setBounds(605, 250, 100, 25);  
        //this.telefonoMovil.setText("");
        this.add(this.telefonoMovil);
        
        //Validar
        this.validar.setBounds(800, 500, 100, 25);
        this.validar.setOpaque(true);
        this.validar.setContentAreaFilled(false);
        this.validar.setForeground(Color.yellow);
        this.add(validar);
        
    }
    
    public void limpiarCampos(){
        
        this.numeroIdentidad.setText("");
        this.primerNombre.setText("");
        this.primerApellido.setText("");        
        this.segundoApellido.setText("");
        this.telefonoDeCasa.setText("");
        this.telefonoMovil.setText("");
    }
    
    
    
    
}
