package ClasesNormales;

public class Clientes {
	private int numCliente;
	private String nombre;
	private long numCel;
	private String correo;
	
	public Clientes() {
	}

	public Clientes(int numCliente, String nombre, long numCel, String correo) {
		this.numCliente = numCliente;
		this.nombre = nombre;
		this.numCel = numCel;
		this.correo = correo;
	}

	public int getNumCliente() {
		return numCliente;
	}

	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getNumCel() {
		return numCel;
	}

	public void setNumCel(long numCel) {
		this.numCel = numCel;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "ClaseNormal [numCliente=" + numCliente + ", nombre=" + nombre + ", numCel=" + numCel + ", correo="
				+ correo + "]\n";
	}
	
	
}
