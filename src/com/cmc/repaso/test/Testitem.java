package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class Testitem {

	public static void main(String[] args) {
		Item item = new Item();
		Item item2 = new Item();

		System.out.println("-----------------");
		// Valores Objeto 1
		item.productosActuales = 20;

		// Metodos Objeto 1
		item.vender(10);
		item.devolver(2);
		
		item.imprimir();
		
		// Valores Objeto 2
		System.out.println("-----------------");
		item2.productosActuales = 5;
		item2.vender(2);
		item2.devolver(1);
		item2.imprimir();
	}

}
