package Interfaces;

import java.util.List;
import ClasesNormales.Clientes;

//Interfaces es un platilla que declara metodos basicos o llamados abstractos
public interface Metodos {
	//Metodos
	//Hay dos tipos de metodos las funciones y procediminetos
	
	//1--Funciones Simpre tiene un valor de retorno
	//El valor de retorno de que tipo es 
	//si va a tener paramentros y cuantos y de que tipo 
	
	//2--Los procedimientos no tienen valor de retorno 
	//Si va a tener paramentros y cuantos y de que tipo 
	
	//Procedimiento para Gurdar
	public void guardar(Clientes cliente);
	
	public List<Clientes> mostrar();
	
	public Clientes buscar(int indice);
	
	public void editar(int indice,Clientes cliente);
	 
	 public void eliminar(int indice);
}
