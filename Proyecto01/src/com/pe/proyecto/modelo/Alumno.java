package com.pe.proyecto.modelo;

public class Alumno {
	
	private String nombre;
	private Double promedionota;
	private String apellido;
	private int codigo;
	

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + "]";
	}

	
	
}
