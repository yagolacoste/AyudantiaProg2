package Filtro_de_busqueda;

import Sistema.Participante;
import Sistema.Persona;

public class FNot implements Filtro{
	private Filtro f1;
	@Override
	public boolean cumple(Persona c) {
		// TODO Auto-generated method stub
		return !f1.cumple(c);
	}
}
