package Comparadores;

import java.util.Comparator;

import Sistema.Persona;

public class ComparadorNot implements Comparator<Persona>{
	private Comparator<Persona>c1;

	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return -c1.compare(o1, o2);
	}
	
}
