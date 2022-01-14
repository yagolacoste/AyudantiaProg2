package Sistema;

import java.util.ArrayList;
import java.util.Collections;

import Filtro_de_busqueda.Filtro;

public class Grupo extends Persona{
	private ArrayList<Persona>cantantes;
	
	
	public Grupo(String nombre) {
		super(nombre);
		this.cantantes =new ArrayList<Persona>();
	}
	
	public void add(Persona p) {
		cantantes.add(p);
	}

	public double getSumaEdad() {
		int suma=0;
		for(Persona p:cantantes) {
			suma+=p.getSumaEdad();
		}
		return suma;
	}
	
	public int cantParticipante() {
		int suma=0;
		for(Persona p:cantantes) {
			suma+=p.cantParticipante();
		}
		return suma;
	}
	
	//se calcula como la interseccion de los generos de su grupo
	public ArrayList<String> getGenero(){
		ArrayList<String>aux=new ArrayList<String>();
		ArrayList<String>result=new ArrayList<String>();
		if(!cantantes.isEmpty()) {
			aux=cantantes.get(0).getGenero();//genero base para chequear con los demas
			result.addAll(aux);
			for(String a:aux) {
				for(int i=1;i<cantantes.size();i++) {
					ArrayList<String>aux2=cantantes.get(i).getGenero();				
					if(!aux2.contains(a) && result.contains(a))
						result.remove(a);
			}
		}
	}
	return result; 
}
	
	//obtener los idiomas sin repetidos
	public ArrayList<String> getIdiomas(){
		ArrayList<String>aux=new ArrayList<String>();
		for(int i=0;i<cantantes.size();i++) {
			Persona p=cantantes.get(i);
			for(int j=0; i<=p.getIdiomas().size();i++)
				if(!aux.contains(p.getIdiomas().get(i)))
					aux.add(p.getIdiomas().get(i));
		}
		return aux;
	}
	
	public ArrayList<String> getInstrumentos(){
		ArrayList<String>aux=new ArrayList<String>();
		for(int i=0;i<cantantes.size();i++) {
			Persona p=cantantes.get(i);
			for(int j=0; i<=p.getInstrumentos().size();i++)
				if(!aux.contains(p.getInstrumentos().get(i)))
					aux.add(p.getInstrumentos().get(i));
		}
		return aux;
				
	}
	
	
	
	public ArrayList<Persona> buscarParticipante(Filtro f) {
		ArrayList<Persona>aux=new ArrayList<Persona>();	
			if(f.cumple(this))
				aux.add(this);
			else {
				for(int i=0;i<cantantes.size();i++) {
					Persona c=cantantes.get(i);
					aux.addAll(c.buscarParticipante(f));
			}
		}
		return aux;
	}

	
}
