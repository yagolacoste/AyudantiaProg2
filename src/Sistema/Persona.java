package Sistema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Filtro_de_busqueda.Filtro;

public abstract class Persona {
	private String nombre;
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public abstract double getSumaEdad();
	public abstract int cantParticipante();
	public double getPromEdad() {
		return this.getSumaEdad()/this.cantParticipante();
	}
	public abstract ArrayList<String> getGenero();
	public abstract ArrayList<String> getIdiomas();
	public abstract ArrayList<String> getInstrumentos();
	public abstract ArrayList<Persona>buscarParticipante(Filtro f);

	public boolean contieneInstrumento(String instrumento) {
		// TODO Auto-generated method stub
		return this.getInstrumentos().contains(instrumento);
	}

	public boolean contieneGenero(String genero) {
		// TODO Auto-generated method stub
		return this.getGenero().contains(genero);
	}

	public boolean contieneIdioma(String idioma) {
		// TODO Auto-generated method stub
		return this.getIdiomas().contains(idioma);
	}
	
	
	
	
}
