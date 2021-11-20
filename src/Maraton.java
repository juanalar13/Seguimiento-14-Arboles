// Author: Juan felipe Alarcon


import java.util.ArrayList;
import java.util.Collection;

public class Maraton {
	
	private int numProgramadores;
	
	Programador programadorRaiz;
	
	public Maraton() {
		
	}
	
	public void agregarProgramador(String nombre, String telefono, String direccion, String eMail) {
		if(programadorRaiz == null) {
			programadorRaiz = new Programador(nombre, telefono, direccion, eMail);
		}else {
			programadorRaiz.insertar(new Programador(nombre, telefono, direccion, eMail));
		}
	}
	
	
	public void eliminarProgramador(String nombre) {
		
	}
	
	public Programador buscarProgramador(String nombre) {
		return programadorRaiz.buscar(nombre);
	}
	
	public ArrayList<Programador> darListaProgramadores() {
		ArrayList<Programador> list = new ArrayList<Programador>();
		programadorRaiz.inorden(list);
		for(int i = 0; i<list.size(); i++) {
			list.get(i).mostrar();			
		}
		return list;
	}
	
	

}
