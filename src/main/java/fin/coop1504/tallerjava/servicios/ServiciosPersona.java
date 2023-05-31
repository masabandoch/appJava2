package fin.coop1504.tallerjava.servicios;

import java.util.HashMap;

import fin.coop1504.tallerjava.entidades.DocumentoSRI;
import fin.coop1504.tallerjava.entidades.Persona;
import fin.coop1504.tallerjava.entidades.PersonaJuridica;
import fin.coop1504.tallerjava.entidades.PersonaNatural;

public class ServiciosPersona {

	public static final String DOCUMENTO = "Documento";
	public static final String PERSONA_JURIDICA = "PersonaJuridica";

	public static String registrarDatos(String nombre, String identificacion) {
		Persona persona = new Persona();
		Persona persona2 = new Persona(nombre, identificacion);
		PersonaNatural personaNatural = new PersonaNatural(nombre, identificacion, "CED");
		System.out.println(persona);
		System.out.println(persona2);
		System.out.println(personaNatural);
		return "ok";
	}
	
	public static String registrarDatosPersonaJuridica(String nombre, String identificacion, DocumentoSRI documentoSRI) {
		PersonaJuridica personaJuridica = new PersonaJuridica(nombre, identificacion, documentoSRI);
		System.out.println(personaJuridica);
		return "ok";
	}
	
	public static String registrarDatosPersonaJuridica(Persona persona, DocumentoSRI documentoSRI) {
		PersonaJuridica personaJuridica = new PersonaJuridica(persona.getNombre(), persona.getIdentificacion(), documentoSRI);
		System.out.println(personaJuridica);
		return "ok";
	}
	
	public static String registrarDatosPersonaJuridica(HashMap<String, Object> parametros) {
		Persona persona = (Persona)parametros.get(PERSONA_JURIDICA);
		DocumentoSRI documentoSRI = (DocumentoSRI)parametros.get(DOCUMENTO);
		PersonaJuridica personaJuridica = new PersonaJuridica(persona.getNombre(), persona.getIdentificacion(), documentoSRI);
		System.out.println(personaJuridica);
		return "ok";
	}
}
