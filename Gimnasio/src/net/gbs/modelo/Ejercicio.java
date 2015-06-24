package net.gbs.modelo;

public class Ejercicio {
	private String tipo, descripcion;
	
	public Ejercicio(String tipo, String descripcion)
	{
		tipo = this.tipo;
		descripcion = this.descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
