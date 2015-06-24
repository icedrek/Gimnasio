package net.gbs.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import net.gbs.modelo.Ejercicio;
import net.gbs.modelo.Logica;
import net.gbs.visual.VentanaEjercicio;
import net.gbs.visual.VentanaPrincipal;

public class Control implements ActionListener
{
	private Ejercicio ejercicio;
	VentanaPrincipal v = null;
	Logica l = null;
	
	public Control(VentanaPrincipal v, Logica l){
		this.v = v;
		this.l = l;
		actionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {

			VentanaEjercicio nuevoEjercicio = new VentanaEjercicio();
			nuevoEjercicio.setVisible(true);
			ejercicio = nuevoEjercicio.getEjercicio();
            

		
	}
	
	public void actionListener(ActionListener aListen)
	{
		v.btnNuevoEjercicio.addActionListener(aListen);
        //l.GuardarEjercicio(ejercicio);
	}

}
