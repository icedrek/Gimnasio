package net.gbs.visual;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.gbs.modelo.Ejercicio;

public class VentanaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;	
	public JButton btnNuevoEjercicio;
	private Ejercicio ejercicio;
		
	public VentanaPrincipal() 
	{ 		
        setTitle("CLUB FITNESS CARCAIXENT");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 433);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setVisible(true);
        
     // el botón que abre ventanas de diálogo
        btnNuevoEjercicio = new JButton("Nuevo Ejercicio");                
        btnNuevoEjercicio.setBounds(10, 11, 414, 23);
        contentPane.add(btnNuevoEjercicio);
	}	
	
	public Ejercicio getEjercicio() {
		return ejercicio;
	}

}