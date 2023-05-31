package fin.coop1504.tallerjava.entidades;

import fin.coop1504.tallerjava.interfaces.ConsultarDatos;

public class PersonaJuridica extends Persona implements ConsultarDatos{
	private DocumentoSRI ruc;
	
	public PersonaJuridica(String nombre, String identificacion, DocumentoSRI documentoSRI) {
		super(nombre, identificacion);
		ruc = documentoSRI;
	}
	
	public DocumentoSRI getRuc() {
		return ruc;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ruc;
	}

	@Override
	public Persona consulta(String pIdentificacion) {
		// TODO Auto-generated method stub
		System.out.println("Consultando: " + pIdentificacion);
		return new PersonaJuridica(nombre, identificacion, ruc);
	}

}
