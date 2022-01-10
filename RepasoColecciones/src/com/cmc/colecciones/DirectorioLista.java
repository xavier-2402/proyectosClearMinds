package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Contacto;

public class DirectorioLista extends Directorio {
	
	ArrayList<Contacto> contactos;
	
	
	
	public DirectorioLista() {
		this.contactos=new ArrayList<>();
	}



	public void agregarContacto(Contacto contacto){
		
		contactos.add(contacto);
	}
	
	public Contacto buscarContacto(String cedula){
		for(Contacto c :contactos){
			if(c.getCedula().equals(cedula)){
				return c;
			}
		}
		return null;
	}
	
	public Contacto eliminarContacto(String cedula){
		for(Contacto c :contactos){
			if(c.getCedula().equals(cedula)){
				contactos.remove(c);
				return c;
			}
		}
		
		return null;
	}
	
	public void imprimir(){
		for(Contacto c: contactos){
			System.out.println(c);
		}
	}

}
