package com.cmc.repaso.entidades;

public class Validacion {
	
	public static boolean validarMonto (double monto) {
		if(monto > 0 ) {
			return true;
		} else {
			return false;
		}
	}
}
