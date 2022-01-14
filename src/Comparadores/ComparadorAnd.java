package Comparadores;

import java.util.Comparator;

import Sistema.Persona;

public class ComparadorAnd implements Comparator<Persona>{
	private Comparator<Persona> c1,c2;
	
	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		int res=c1.compare(o1, o2);
		if(res==0)
			return c2.compare(o1, o2);
		return res;
	}
	
}
