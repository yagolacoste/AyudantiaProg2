package Criterios_de_juradoE;

import Sistema.Participante;
import Sistema.Persona;

public class CIidoma extends Criterio {
	private String idioma;
	@Override
	public boolean requerido(Persona t) {
		// TODO Auto-generated method stub
		return t.contieneIdioma(idioma);
	}

}
