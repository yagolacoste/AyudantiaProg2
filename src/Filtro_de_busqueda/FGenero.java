package Filtro_de_busqueda;

import Sistema.Participante;
import Sistema.Persona;

public class FGenero implements Filtro{
	private String genero;
	@Override
	public boolean cumple(Persona c) {
		// TODO Auto-generated method stub
		return c.contieneGenero(genero);
	}

}
