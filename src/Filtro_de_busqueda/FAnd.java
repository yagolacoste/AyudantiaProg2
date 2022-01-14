package Filtro_de_busqueda;

import Sistema.Participante;
import Sistema.Persona;

public class FAnd implements Filtro{
	private Filtro f1,f2;
	@Override
	public boolean cumple(Persona c) {
		// TODO Auto-generated method stub
		return f1.cumple(c)&&f2.cumple(c);
	}

}
