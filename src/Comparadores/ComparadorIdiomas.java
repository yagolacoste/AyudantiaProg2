package Comparadores;

import java.util.Comparator;

import Sistema.Persona;

public class ComparadorIdiomas implements Comparator<Persona>{


	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return (o1.getIdiomas().size()-o2.getIdiomas().size());
	}
	
}