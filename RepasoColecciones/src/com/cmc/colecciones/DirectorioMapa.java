package com.cmc.colecciones;

import java.util.HashMap;

import com.cmc.entidades.Contacto;

public class DirectorioMapa extends Directorio {
	
	private HashMap<String, Contacto> contactos;
	
	public DirectorioMapa(){
		this.contactos=new HashMap<>();
	}
	
	public void agregarContacto(Contacto contacto){
		if(!contactos.containsKey(contacto.getCedula())){
			contactos.put(contacto.getCedula(), contacto);
		}
	}
	
	public Contacto buscarContacto(String cedula){
		return contactos.get(cedula);
	}
	
	public Contacto eliminarContacto(String cedula){
		if(contactos.containsKey(cedula)){
			Contacto c = contactos.get(cedula);
			contactos.remove(cedula);
			return c;
		}else{
			return null;
		}
		
	}
	
	public void imprimir(){
		System.out.println(contactos);
	}

}
