package Sistema;

import Criterios_de_juradoE.Criterio;

public class JuradoExigente extends Jurado{
	Criterio c;

	public JuradoExigente( Criterio c) {
		this.c = c;
	}
	
	public void setExigencia(Criterio c) {
		this.c=c;
	}
	
	public void add(Persona p) {
		if(c.requerido(p))
			super.add(p);
	}
}


