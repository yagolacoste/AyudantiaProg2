package Sistema;

import java.util.ArrayList;

import Filtro_de_busqueda.Filtro;

public class Participante extends Persona{
	private String apellido;
	private int edad;
	private ArrayList<String>genero=new ArrayList<String>();
	private ArrayList<String>idioma=new ArrayList<String>();
	private ArrayList<String>instrumento=new ArrayList<String>();
	
	
	public Participante(String nombre, String apellido, int edad) {
		super(nombre);
		this.apellido = apellido;
		this.edad = edad;
	}

	public double getSumaEdad() {
		return edad;
	}
	
	public int cantParticipante() {
		return 1;
	}
	
	public ArrayList<String> getGenero(){
		return new ArrayList<String>(genero);
	}
	
	public ArrayList<String> getInstrumentos(){
		return new ArrayList<String>(instrumento);
	}
	public ArrayList<String> getIdiomas(){
		return new ArrayList<String>(idioma);
	}


	@Override
	public ArrayList<Persona> buscarParticipante(Filtro f) {
		// TODO Auto-generated method stub
		ArrayList<Persona>aux=new ArrayList<Persona>();
		if(f.cumple(this))
			aux.add(this);
		return aux;
	}


	public void addGenero(String g) {
		genero.add(g);
	}
	

	
}
