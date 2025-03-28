package ClaseMain;

import ClasesNormales.Clientes;
import Implementacion.LogicaDeLosMetodos;

public class Principal {

	public static void main(String[] args) {
		//Colleccion de objetos
		Clientes cliente = new Clientes(2, "Javier", 1654986, "javier@gmail.com");
		Clientes cliente2 = new Clientes(3, "Francisco", 65483164,"francisco@gmail.com");
		Clientes cliente3 = new Clientes();
		
		LogicaDeLosMetodos imp = new LogicaDeLosMetodos();
		
		//Guardar
		imp.guardar(cliente);
		imp.guardar(cliente2);
		
		System.out.println(imp.mostrar());
		
		//Buscar
		Clientes clienteEncontrado= null;
		clienteEncontrado = imp.buscar(1);
		System.out.println("Se encontro\n" + clienteEncontrado); 
		
		//Editar 
		clienteEncontrado = imp.buscar(0);
		clienteEncontrado.setNombre("Espinosa");
		imp.editar(0, clienteEncontrado);
		
		System.out.println(imp.mostrar());

		//Eliminar 
		imp.eliminar(1);
		
		System.out.println(imp.mostrar());
		
		
	}

}

























