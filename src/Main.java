
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Maraton M = new Maraton();
		
		/*  ABB de Programadores
		
		            g
		           / \  
		          b   h
	             / \ 	
		        a   c
		             \
		              d
		*/		
		
		// Registrando los programadores
		M.agregarProgramador("g", "t1", "d1", "e1");
		M.agregarProgramador("b", "t2", "d2", "e2");
		M.agregarProgramador("h", "t3", "d3", "e3");
		
		M.agregarProgramador("a", "t4", "d4", "e4");
		M.agregarProgramador("c", "t5", "d5", "e5");
		M.agregarProgramador("d", "t6", "d6", "e6");
		
		M.agregarProgramador("c", "t5", "d5", "e5"); // excepcion!
		
		// Mostrando la lista de programadores en in-orden
		M.darListaProgramadores();
		
		// Mostrando las alturas de los nodos
		M.buscarProgramador("g").mostrarAltura();
		M.buscarProgramador("b").mostrarAltura();
		M.buscarProgramador("h").mostrarAltura();
		M.buscarProgramador("a").mostrarAltura();
		M.buscarProgramador("c").mostrarAltura();
	    M.buscarProgramador("d").mostrarAltura();

	}

}
