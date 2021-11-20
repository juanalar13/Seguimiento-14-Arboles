// Author: Juan felipe Alarcon

import java.util.ArrayList;
import java.util.Collection;

public class Programador {	
	
	private String nombre;
	private String telefono;
	private String direccion;
	private String eMail;
	
	private Programador izq;
	private Programador der;
	
	
	public Programador(String nombre, String telefono, String direccion, String eMail) {
		
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.eMail = eMail;		
	}
	
	
	
	public void mostrar() {
		System.out.println("Programador [nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", eMail=" + eMail + "]");
	}



	public int compareTo(Object obj) {
		return nombre.compareTo(((Programador) obj).nombre);		
	}


	public String darNombre() {
		return nombre;
	}


	public String darTelefono() {
		return telefono;
	}


	public String darDireccion() {
		return direccion;
	}


	public String dareMail() {
		return eMail;
	}
	
	
	public boolean esHoja() {
		return (izq==null) && (der==null);
	}
	
	public Programador darMenor() {
		return null;
	}
	
	public Programador darMayor() {
		return der;		
	}
	
	
	public int darAltura(int h, int max) {		
		int izqAltura = h;
		int derAltura = h;
		if (h > max) {
			max = h;
		}		
		if(izq != null) {
			izqAltura = izq.darAltura(h+1, max);		
		}
		if(der != null) {
			derAltura = der.darAltura(h+1, max);
		}
		return Math.max(izqAltura, derAltura);
	}
	
	
	public int darAltura() {	
		return darAltura(0, 0);		
	}	

	
	
	public int darPeso() {
		return 0;
	}
	
	
    public void insertar(Programador p, Programador actual) throws ProgramadorRepetidoException{
    	int c = p.compareTo(actual);
		if (c < 0) {
			if(actual.izq == null) {
				actual.izq = p;
			}else {
				insertar(p, actual.izq);
			}
		}else {
			if(c > 0) {
				if(actual.der ==null) {
					actual.der = p;
				}else {
					insertar(p, actual.der);
				}
			}else {
				throw new ProgramadorRepetidoException("Excepción al insertar: Programador repetido, nombre = " + p.darNombre());				
			}			
		}
	}
	
	
	public void insertar(Programador p) {		
		try {
			insertar(p, this);
		} catch (ProgramadorRepetidoException e) {			
		}
	}
	
	public Programador buscar(String s) {
		int c = s.compareTo(nombre);
		if(c == 0) {
			return this;
		}else {
			if (c < 0) {
				if (izq != null) {
					return izq.buscar(s);
				}else {
					return null;
				}
			}else {
				if (der != null) {
					return der.buscar(s);
				}
				return null;
			}
		}
	}
	
	
	public Programador eliminar(String s) {
		return null;		
	}
	
	public void inorden(Programador p, ArrayList<Programador> acumulado) {
		if(p != null) {
			inorden(p.izq, acumulado);
			acumulado.add(p);
			inorden(p.der, acumulado);			
		}		
	}
	
	public void inorden(ArrayList<Programador> acumulado) {
		inorden(this, acumulado);		
	}
	
	
	public void mostrarAltura() {
		System.out.println("Altura del nodo del programador <" + nombre + "> es: " + darAltura());
	}
	
	
	
	
	
	
	

}
