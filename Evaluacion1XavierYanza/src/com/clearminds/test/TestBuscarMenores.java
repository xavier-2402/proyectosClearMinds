package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda("A");
		maquina.agregarCelda("B");
		maquina.agregarCelda("C");
		maquina.agregarCelda("D");

		Producto producto = new Producto("KE34", "Papitas", 0.85);
		maquina.cargarProducto(producto, "B", 4);
		Producto producto1 = new Producto("AD23", "Cake", 1.85);
		maquina.cargarProducto(producto1, "A", 7);
		Producto producto2 = new Producto("FE13", "Doritos", 1.10);
		maquina.cargarProducto(producto2, "C", 9);
		Producto producto3 = new Producto("WS45", "Cola", 0.90);
		maquina.cargarProducto(producto3, "D", 6);

		ArrayList<Producto> menores = maquina.buscarMenores(0.70);
		System.out.println("Productos menores al valor ingresado");
		if (menores.size()== 0) {
			System.out.println("No existen productos menores a ese precio");
		}
		for (Producto menor : menores) {

			System.out.println("Producto: " + menor.getNombre() + " Precio: " + menor.getPrecio());

		}

	}

}
