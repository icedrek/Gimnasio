package net.gbs.modelo;

import javax.swing.JOptionPane;

public class Logica {
	public static boolean ValidarTexto(String texto){
		boolean error = false;
		if(texto.replaceAll(" ", "").matches(".*\\W.*"))
		{			
			error = true;
		}
		
		return error;
		
	}
	
	public void GuardarEjercicio(Ejercicio ejercicio)
	{
		JOptionPane.showMessageDialog(null, 
				ejercicio.getTipo() + ":\\s" + ejercicio.getDescripcion());
	}
}
