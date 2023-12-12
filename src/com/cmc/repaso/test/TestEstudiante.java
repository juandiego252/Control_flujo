package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {
	public static void main(String[] args) {

		Estudiante estudiante1 = new Estudiante("Juan");

		System.out.println("Estudiante: " + estudiante1.nombre);

		double calf = estudiante1.nota = 7.99; // Asignar el valor al atributo nota
		estudiante1.calificar(calf); // Metodo calificar devulve A si es mayor o igual a 8 y F si es menor a 8
	}
}
