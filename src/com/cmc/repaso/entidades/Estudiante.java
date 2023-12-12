package com.cmc.repaso.entidades;

public class Estudiante {
	public String nombre;
	public double nota;
	private String resultado;

	public Estudiante(String nombre) {
		this.nombre = nombre;
	}

	public void calificar(double nota) {
		if (nota < 8) {
			resultado = "F";
			System.out.println("Resultado: " + resultado);
		} else if (nota >= 8) {
			resultado = "A";
			System.out.println("Resultado: " + resultado);
		}
	}

}
