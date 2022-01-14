package Criterios_de_juradoE;

import Sistema.Participante;
import Sistema.Persona;

public class CGenero extends Criterio{
	private String genero;
	@Override
	public boolean requerido(Persona t) {
		// TODO Auto-generated method stub
		return t.contieneGenero(genero);
	}

}
