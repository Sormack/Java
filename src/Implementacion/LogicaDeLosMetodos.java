package Implementacion;

import java.util.ArrayList;
import java.util.List;

import ClasesNormales.Clientes;
import Interfaces.Metodos;

public class LogicaDeLosMetodos implements Metodos{
	
	private List<Clientes> lista = new ArrayList<Clientes>();
	
	@Override
	public void guardar(Clientes cliente) {
		lista.add(cliente);
		
	}

	@Override
	public List<Clientes> mostrar() {
		//Se delcara una lista vacia
		List<Clientes> listaNueva = new ArrayList<Clientes>();
		//Se gurda la lista de clientes en la nueva lisata y se retorna
		listaNueva = lista;
		return listaNueva;
	}

	@Override
	public Clientes buscar(int indice) {
		Clientes clienteEncontrado = null;
		clienteEncontrado = lista.get(indice);
		return clienteEncontrado;
	}

	@Override
	public void editar(int indice, Clientes cliente) {
		lista.set(indice, cliente);
	}

	@Override
	public void eliminar(int indice) {
		lista.remove(indice);
	}
	
}
