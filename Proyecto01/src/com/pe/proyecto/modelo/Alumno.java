package com.pe.proyecto.modelo;

public class Alumno {
	
	private String nombre;
	private Double promedionota;
	private String apellido;
	
	

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
