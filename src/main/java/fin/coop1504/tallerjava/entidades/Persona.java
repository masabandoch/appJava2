/**
 * 
 */
package fin.coop1504.tallerjava.entidades;

/**
 * @author masabando
 *
 */
public class Persona {
	// private dentro de la clase
	// public no se necesita un método de acceso
	// protected
	// package
	protected String nombre;
	protected String identificacion;
	// protected String tipoIdentificacion;

	public Persona() {
		super();
		System.out.println("Usando el constructor sin parametros");
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public Persona(String nombre, String identificacion) {
		super();
		System.out.println("Usando el constructor con parametros");
		this.nombre = nombre;
		this.identificacion = identificacion;
		// this.tipoIdentificacion = tipoIdentificacion;

	}

//	public Persona() {
//		nombre = ""; // new String(); otra forma de inicializar la variable
//		identificacion = "";
//		tipoIdentificacion = "";
//
//	}
//
//	public Persona(String pNombre, String pIdentificacion, String pTipoIdentificacion) {
//		nombre = pNombre; // new String(); otra forma de inicializar la variable
//		identificacion = pIdentificacion;
//		tipoIdentificacion = pTipoIdentificacion;
//
//	}
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Identificación: " + identificacion;
	}
}
