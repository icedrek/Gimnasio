package net.gbs.control;

import net.gbs.modelo.Logica;
import net.gbs.visual.VentanaPrincipal;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		VentanaPrincipal v = new VentanaPrincipal();	
		Logica l = new Logica();
		new Control(v,l);
	}

}
