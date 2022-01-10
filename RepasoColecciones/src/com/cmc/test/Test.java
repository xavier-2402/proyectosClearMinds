package com.cmc.test;

import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contacto c = new Contacto("763283", "Xavier", "Yanza");
		c.agregarTelefono(new Telefono("movi", "0883231"));
		c.agregarTelefono(new Telefono("claro", "09873232"));
		
		System.out.println(c);

	}

}
