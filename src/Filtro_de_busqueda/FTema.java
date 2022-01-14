package Filtro_de_busqueda;

import Sistema.Persona;
import TemaSistema.Tema;

public class FTema implements Filtro{
	private Tema t;
	
	public FTema(Tema t) {
		super();
		this.t = t;
	}

	@Override
	public boolean cumple(Persona c) {
		// TODO Auto-generated method stub
		return false;
	}

}
