package com.cmc.repaso.entidades;

public class Item {
	public String nombre;
	public int productosActuales;
	public int productosDevueltos; // Corregido el nombre de la variable
	public int productosVendidos;

	public void imprimir() {
		System.out.println("Productos Actuales: " + productosActuales);
		System.out.println("Productos Vendidos: " + productosVendidos);
		System.out.println("Productos Devueltos: " + productosDevueltos);
	}

	public void vender(int cantidad) {
		if (cantidad >= 0 && cantidad <= productosActuales) {
			productosActuales -= cantidad;
			productosVendidos += cantidad;
		} else {
			System.out.println("Cantidad de productos menor a 0 o cantidad de productos mayor al producto actual");
		}
	}

	public void devolver(int cantidad) {
		if (cantidad >= 0 && cantidad <= productosVendidos) {
			productosActuales += cantidad;
			productosVendidos -= cantidad;
			productosDevueltos += cantidad;
		} else {
			System.out.println("Cantidad a devolver menor a 0 o Cantidad a devolver mayor a productos Vendidos");
		}
	}

}
