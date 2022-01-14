package Criterios_de_juradoE;

import Sistema.Participante;
import Sistema.Persona;

public class CInstrumento extends Criterio{
	private String instrumento;
	@Override
	public boolean requerido(Persona t) {
		// TODO Auto-generated method stub
		return t.contieneInstrumento(instrumento);
	}

}
