package com.cmc.test;

import com.cmc.colecciones.DirectorioMapa;
import com.cmc.entidades.Contacto;

public class TestDirectorioMapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DirectorioMapa dir = new DirectorioMapa();
		
		dir.agregarContacto(new Contacto("08823", "Carlos", "Vasquez"));
		dir.agregarContacto(new Contacto("97324", "Xavier", "Yanza"));
		dir.agregarContacto(new Contacto("89424", "Mauricio", "Vera"));
		dir.agregarContacto(new Contacto("81134", "Jessica", "Alvarez"));
		
		dir.imprimir();
		System.out.println("**********************BUSCAR");
		System.out.println(dir.buscarContacto("97324"));
		System.out.println("**********************ELIMINAR");
		System.out.println(dir.eliminarContacto("89424"));
		System.out.println("**********************");
		dir.imprimir();

	}

}
