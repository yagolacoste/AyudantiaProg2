package Filtro_de_busqueda;

import Sistema.Participante;
import Sistema.Persona;

public class FEdad implements Filtro{
	private double edad;
	@Override
	public boolean cumple(Persona c) {
		// TODO Auto-generated method stub
		return c.getPromEdad()>edad;
	}

}
