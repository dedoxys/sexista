package sexista;

public class Hombre implements Persona{

	private int edad;
	private String nombre;
	private String ciudad;

	public Hombre(int _edad, String _nombre, String _ciudad) {
		this.edad = _edad;
		this.nombre = _nombre;
		this.ciudad = _ciudad;
	}

	public int getEdad() {
		return this.edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getCiudad() {
		return this.ciudad;
	}

}
