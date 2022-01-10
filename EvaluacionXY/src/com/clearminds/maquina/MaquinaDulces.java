package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void configurarMaquina(String codigoCelda1, String codigoCelda2, String codigoCelda3, String codigoCelda4) {
		celda1 = new Celda(codigoCelda1);
		celda2 = new Celda(codigoCelda2);
		celda3 = new Celda(codigoCelda3);
		celda4 = new Celda(codigoCelda4);
	}

	public void mostrarConfiguracion() {
		System.out.println("Celda 1: " + celda1.getCodigo());
		System.out.println("Celda 2: " + celda2.getCodigo());
		System.out.println("Celda 3: " + celda3.getCodigo());
		System.out.println("Celda 4: " + celda4.getCodigo());
		System.out.println("Saldo: " + saldo);
	}

	public Celda buscarCelda(String codigo) {
		if (celda1.getCodigo().equals(codigo)) {
			return celda1;
		} else if (celda2.getCodigo().equals(codigo)) {
			return celda2;
		} else if (celda3.getCodigo().equals(codigo)) {
			return celda3;
		} else if (celda4.getCodigo().equals(codigo)) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String codigo, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, cantidad);
	}

	public void mostrarProductos() {
		if (celda1.getProducto() != null) {
			System.out.println("Código: " + celda1.getCodigo() + ", Stock: " + celda1.getStock()
					+ ", Nombre Producto:  " + celda1.getProducto().getNombre() + ", precio producto: "
					+ celda1.getProducto().getPrecio());
		} else {
			System.out.println("Código: " + celda1.getCodigo() + ", Stock: " + celda1.getStock()
					+ ", La celda no tiene producto ");
		}
		if (celda2.getProducto() != null) {
			System.out.println("Código: " + celda2.getCodigo() + ", Stock: " + celda2.getStock()
					+ ", Nombre Producto:  " + celda2.getProducto().getNombre() + ", precio producto: "
					+ celda2.getProducto().getPrecio());
		} else {
			System.out.println("Código: " + celda2.getCodigo() + ", Stock: " + celda2.getStock()
					+ ", La celda no tiene producto ");
		}
		if (celda3.getProducto() != null) {
			System.out.println("Código: " + celda3.getCodigo() + ", Stock: " + celda3.getStock()
					+ ", Nombre Producto:  " + celda3.getProducto().getNombre() + ", precio producto: "
					+ celda3.getProducto().getPrecio());
		} else {
			System.out.println("Código: " + celda3.getCodigo() + ", Stock: " + celda3.getStock()
					+ ", La celda no tiene producto ");
		}
		if (celda4.getProducto() != null) {
			System.out.println("Código: " + celda4.getCodigo() + ", Stock: " + celda4.getStock()
					+ ", Nombre Producto:  " + celda4.getProducto().getNombre() + ", precio producto: "
					+ celda4.getProducto().getPrecio());
		} else {
			System.out.println("Código: " + celda4.getCodigo() + ", Stock: " + celda4.getStock()
					+ ", La celda no tiene producto ");
		}

	}

	public Producto buscarProductoEnCelda(String codigo) {
		if (celda1.getCodigo().equals(codigo)) {
			return celda1.getProducto();
		} else if (celda2.getCodigo().equals(codigo)) {
			return celda2.getProducto();
		} else if (celda3.getCodigo().equals(codigo)) {
			return celda3.getProducto();
		} else if (celda4.getCodigo().equals(codigo)) {
			return celda4.getProducto();
		} else {
			return null;
		}
	}

	public double consultarPrecio(String codigo) {
		if (celda1.getCodigo().equals(codigo)) {
			return celda1.getProducto().getPrecio();
		} else if (celda2.getCodigo().equals(codigo)) {
			return celda2.getProducto().getPrecio();
		} else if (celda3.getCodigo().equals(codigo)) {
			return celda3.getProducto().getPrecio();
		} else if (celda4.getCodigo().equals(codigo)) {
			return celda4.getProducto().getPrecio();
		} else {
			return 0.0;
		}

	}

	public Celda buscarCeldaProducto(String codigo) {
		if (celda1.getProducto() != null) {
			if (celda1.getProducto().getCodigo().equals(codigo))
				;
			return celda1;
		}
		if (celda2.getProducto() != null) {
			if (celda2.getProducto().getCodigo().equals(codigo))
				;
			return celda2;

		}
		if (celda3.getProducto() != null) {
			if (celda3.getProducto().getCodigo().equals(codigo))
				;
			return celda3;

		}
		if (celda4.getProducto() != null) {
			if (celda4.getProducto().getCodigo().equals(codigo))
				;
			return celda4;

		}

		return null;
	}

	public void incrementarProductos(String codProducto, int cantidad) {
		Celda celdaEncontrada = buscarCeldaProducto(codProducto);
		celdaEncontrada.setStock(cantidad);
	}

	public void vender(String codigoCelda) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		saldo += celdaEncontrada.getProducto().getPrecio();

	}

	public double venderConCambio(String codCelda, double valorIngresado) {
		Celda celdaEncontrada = buscarCelda(codCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		saldo += celdaEncontrada.getProducto().getPrecio();
		return valorIngresado - celdaEncontrada.getProducto().getPrecio();

	}

}
