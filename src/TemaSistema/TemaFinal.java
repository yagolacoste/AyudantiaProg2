package TemaSistema;

import java.util.ArrayList;

import Filtro_de_busqueda.FInstrumento;
import Filtro_de_busqueda.Filtro;
import Sistema.Persona;

public class TemaFinal extends Tema{
	private int cantidadMiembros;

	public TemaFinal(String titulo, String idioma,Filtro c, int cantidadMiembros) {
		super(titulo, idioma, c);
		this.cantidadMiembros = cantidadMiembros;
	}

	public boolean interpreta(Persona p) {
		if(!super.interpreta(p))
			return true;
		ArrayList<String> instrumentos=super.getInstrumentos();
		int cont=0;
		for(int i=0;i<instrumentos.size();i++) {
			Filtro cAux=new FInstrumento(instrumentos.get(i));
			cont=cont+p.buscarParticipante(cAux).size();
			if(cont>=cantidadMiembros) {
				return true;
			}
		}
		return false;
	}
	
}
