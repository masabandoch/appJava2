package fin.coop1504.tallerjava;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

import fin.coop1504.tallerjava.entidades.DocumentoSRI;
import fin.coop1504.tallerjava.entidades.Persona;
import fin.coop1504.tallerjava.entidades.PersonaJuridica;
import fin.coop1504.tallerjava.entidades.PersonaNatural;
import fin.coop1504.tallerjava.interfaces.ConsultarDatos;
import fin.coop1504.tallerjava.servicios.ServiciosPersona;

public class AplicacionTaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServiciosPersona.registrarDatos("Mayer", "1234567890");
//		ServiciosPersona.mostrarDatos("Mayer", "1234567890", "CED");

		DocumentoSRI ruc = new DocumentoSRI();
		ruc.setActividadEconomica("DESARROLLO DE SOFTWARE");
		ruc.setEstado("A");
		ruc.setFechaExpedicion(new Date());

		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(new Date());
		cal.add(GregorianCalendar.YEAR, 1);

		ruc.setFechaExpiracion(cal.getTime());
		/*
		 * Persona persona = new Persona("Mayer", "1234567890001");
		 * ServiciosPersona.registrarDatosPersonaJuridica(persona, ruc);
		 */
		ServiciosPersona.registrarDatosPersonaJuridica(new Persona("Mayer", "1234567890001"), ruc);
		System.out.println("-----------------");
		HashMap<String, Object> parametros = new HashMap<String, Object>();
		parametros.put(ServiciosPersona.PERSONA_JURIDICA, new Persona("Karen", "9876543210001"));
		parametros.put(ServiciosPersona.DOCUMENTO, ruc);
		
		ServiciosPersona.registrarDatosPersonaJuridica(parametros);
		
		System.out.println("-----------------");
		
		/*ConsultarDatos personaGeneral = new PersonaNatural("Judith", "1234569871", "CED");
		System.out.println(personaGeneral.consulta("1234569871"));
		personaGeneral = new PersonaJuridica("Henry", "1234569871", ruc);
		System.out.println(personaGeneral.consulta("1234569871"));*/
		ConsultarDatos personaGeneral = new PersonaNatural("Judith", "1234569871", "CED");
		consultar(personaGeneral,"1234569871");
		personaGeneral = new PersonaJuridica("Henry", "1234569871", ruc);
		consultar(personaGeneral,"1234569871");

	}
	
	public static void consultar(ConsultarDatos consulta, String dato) {
		System.out.println(consulta.consulta(dato));
		
	}

}
