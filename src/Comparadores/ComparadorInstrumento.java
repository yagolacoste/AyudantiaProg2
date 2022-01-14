package Comparadores;

import java.util.Comparator;

import Sistema.Persona;

public class ComparadorInstrumento implements Comparator<Persona>{


	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return (o1.getInstrumentos().size()-o2.getInstrumentos().size());
	}
	
}
