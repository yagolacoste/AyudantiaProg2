package Filtro_de_busqueda;

import Sistema.Participante;
import Sistema.Persona;

public class FInstrumento implements Filtro{
	private String instrumento;

	
	public FInstrumento(String instrumento) {
		super();
		this.instrumento = instrumento;
	}


	@Override
	public boolean cumple(Persona c) {
		// TODO Auto-generated method stub
		return c.contieneInstrumento(instrumento);
	}
}
