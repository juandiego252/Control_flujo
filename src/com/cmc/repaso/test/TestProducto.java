package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto = new Producto("Lapiz", 1.99);

		producto.setPrecio(-50.99);
		System.out.println("Precio aplicado descuento: " + producto.calcularPrecioPromo(10));
	}

}
