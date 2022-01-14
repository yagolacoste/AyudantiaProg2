package Sistema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Filtro_de_busqueda.Filtro;

public class Jurado {
	private ArrayList<Persona>cantantes;

	public Jurado() {
		super();
		this.cantantes =new ArrayList<Persona>();
	}
	
	public void add(Persona p) {
		cantantes.add(p);
	}
	
	public double getEdad() {
		double suma=0;
		for(Persona p:cantantes) {
			suma+=p.getPromEdad();
		}
		return suma;
	}
	
	
	public ArrayList<String> getGenero(){
		ArrayList<String>aux=new ArrayList<String>();
		for(int i=0;i<cantantes.size();i++) {
			Persona p=cantantes.get(i);
			for(int j=0; i<=p.getGenero().size();i++)
				if(!aux.contains(p.getGenero().get(i)))
					aux.add(p.getIdiomas().get(i));
		}
		Collections.sort(aux);
		return aux;
	}
	
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
	
	public ArrayList<Persona>devolverOrdenado(Comparator<Persona> fm,Filtro f){
		ArrayList<Persona>aux=new ArrayList<Persona>();
		for(int i=0;i<cantantes.size();i++) {
			Persona p=cantantes.get(i);
			ArrayList<Persona>auxPersona=p.buscarParticipante(f);
			for(int j=0;j<auxPersona.size();j++) {
				aux.add(auxPersona.get(i));
			}
		}
		Collections.sort(aux,fm);
		return aux;
	}
}
