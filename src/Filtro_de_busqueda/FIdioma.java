package Filtro_de_busqueda;

import Sistema.Participante;
import Sistema.Persona;

public class FIdioma implements Filtro{
	private String idioma;

	@Override
	public boolean cumple(Persona c) {
		// TODO Auto-generated method stub
		return c.contieneIdioma(idioma);
	}
}
