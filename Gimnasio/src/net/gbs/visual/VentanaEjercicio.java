package net.gbs.visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import net.gbs.modelo.Ejercicio;
import net.gbs.modelo.Logica;

public class VentanaEjercicio extends JDialog {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private final JTextField descripcionEjercicio;
	private final JComboBox<String> tipoEjercicio;
    
    public VentanaEjercicio() 
    {
        setResizable(false);
        setTitle("Nuevo Ejercicio");
        setBounds(100, 100, 450, 229);
                
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER); 
        contentPanel.setLayout(null);
        {
            tipoEjercicio = new JComboBox<String>();
            tipoEjercicio.addItem("Espalda");
            tipoEjercicio.addItem("Brazos");
            tipoEjercicio.addItem("Piernas");
            tipoEjercicio.setBounds(10, 10, 100, 25);
            contentPanel.add(tipoEjercicio);
            
            descripcionEjercicio = new JTextField();
            descripcionEjercicio.setBounds(125, 10, 300, 25);
            contentPanel.add(descripcionEjercicio);
        }
        
        {
            JPanel buttonPane = new JPanel();
            buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
            getContentPane().add(buttonPane, BorderLayout.SOUTH);
            {
                JButton okButton = new JButton("Guardar");
                okButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {    
						if (Logica.ValidarTexto(descripcionEjercicio.getText().toString()))
						{
							JOptionPane.showMessageDialog(null, 
									"Se ha introducido un caracter no valido. " +
									"Valores permitidos [a-z], [A-Z], [0-9] y espacio");
													
						} else {
							dispose();
						}
							
						
                        
                    }
                });
                okButton.setActionCommand("Guardar");
                buttonPane.add(okButton);
                getRootPane().setDefaultButton(okButton);
            }
            {
                JButton cancelButton = new JButton("Cancelar");
                cancelButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                        dispose();
                    }
                });
                cancelButton.setActionCommand("Cancelar");
                buttonPane.add(cancelButton);
            }
        }
    }
    
    public Ejercicio getEjercicio() {
		return new Ejercicio(tipoEjercicio.getSelectedItem().toString(), 
				descripcionEjercicio.getText().toString());
	}

}

