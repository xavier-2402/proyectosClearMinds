package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private double saldo;
	private ArrayList<Celda> celdas;

	public MaquinaDulces() {
		celdas = new ArrayList<>();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public void agregarCelda(String codigoCelda) {
		Celda celda = new Celda(codigoCelda);
		celdas.add(celda);
	}

	public void mostrarConfiguracion() {
		for (Celda celda : celdas) {
			if (celda != null) {
				System.out.println("Código celda: " + celda.getCodigo());
			}
		}
	}

	public Celda buscarCelda(String codigoCelda) {
		for (Celda celda : celdas) {
			if (celda.getCodigo().equals(codigoCelda)) {
				return celda;
			}
		}
		return null;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, cantidad);
		}
	}

	public void mostrarProductos() {
		for (Celda celda : celdas) {
			if (celda != null) {
				if (celda.getProducto() != null) {
					System.out.println("Celda: " + celda.getCodigo() + ", Stock: " + celda.getStock() + ", Producto: "
							+ celda.getProducto().getCodigo() + " Precio: " + celda.getProducto().getPrecio());
				} else {
					System.out.println(
							"Celda: " + celda.getCodigo() + ", Stock: " + celda.getStock() + " Sin producto asignado");
				}
			}
		}
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			if (celdaRecuperada.getProducto() != null) {
				celdaRecuperada.getProducto();
				return celdaRecuperada.getProducto();
			}

		}
		return null;
	}
	
	public double consultarPrecio(String codigoCelda){
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			if (celdaRecuperada.getProducto() != null) {
				celdaRecuperada.getProducto();
				return celdaRecuperada.getProducto().getPrecio();
			}

		}
		return 0.0;
	}
	
	public Celda buscarCeldaProducto(String codigoProducto){
		for(Celda celda:celdas){
			if(celda.getProducto()!=null){
				if(celda.getProducto().getCodigo().equals(codigoProducto)){
					return celda;
				}
			}
		}
		return null;
	}
	
	public void incrementarProductos(String codigoProducto, int cantidad){
		Celda celdaEncontrada=buscarCeldaProducto(codigoProducto);
		if(celdaEncontrada != null){
			celdaEncontrada.setStock(celdaEncontrada.getStock()+cantidad);
		}
	}
	
	public void vender(String codigoCelda){
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if(celdaRecuperada!=null){
			if(celdaRecuperada.getProducto()!=null){
				celdaRecuperada.setStock(celdaRecuperada.getStock()-1);
				saldo+=celdaRecuperada.getProducto().getPrecio();
			}
		}
	}
	
	public double venderConCambio(String codigoCelda,double valor){
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if(celdaRecuperada!=null){
			if(celdaRecuperada.getProducto()!=null){
				celdaRecuperada.setStock(celdaRecuperada.getStock()-1);
				saldo+=celdaRecuperada.getProducto().getPrecio();
				return valor-celdaRecuperada.getProducto().getPrecio();
			}
		}
		return 0.0;
		
	}
	
	public ArrayList<Producto> buscarMenores(double limite){
		ArrayList<Producto> menores = new ArrayList<>();
		for(Celda celda:celdas){
			if(celda.getProducto()!=null){
				if(celda.getProducto().getPrecio() <=limite){
					menores.add(celda.getProducto());
				}
			}
		}
		return menores;
		
	}

}
