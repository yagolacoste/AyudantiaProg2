package TemaSistema;

import java.util.ArrayList;

import Criterios_de_juradoE.Criterio;
import Filtro_de_busqueda.Filtro;
import Sistema.Persona;

public class Tema {
	private String titulo;
	private ArrayList<String>genero=new ArrayList<String>();
	private String idioma;
	private ArrayList<String>instrumento=new ArrayList<String>();
	private Filtro c;
	
	public Tema(String titulo, String idioma, Filtro c) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.idioma = idioma;
		this.instrumento = instrumento;
		this.c = c;
	}

	public boolean interpreta(Persona p) {
		return this.c.cumple(p);
	}
	
	public ArrayList<String>getInstrumentos(){
		return new ArrayList<String>(instrumento);
	}
}
