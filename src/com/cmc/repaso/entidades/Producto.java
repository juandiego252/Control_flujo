package com.cmc.repaso.entidades;

public class Producto {
	public String nombre;
	public double precio;

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {

		return precio;
	}

	public void setPrecio(double precio) {
		if (precio >= 0) {
		} else {
			precio = precio * -1;
			System.out.println("Valor multiplicado por -1: " + precio);
		}
		this.precio = precio;
	}

	public double calcularPrecioPromo(double descuento) {

		if (descuento > 0 && descuento <= 100) {
			precio = precio - descuento;
		} else {
			System.out.println("Descuento no valido");
		}

		return precio;

	}

}
