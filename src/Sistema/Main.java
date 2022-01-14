package Sistema;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Participante p1=new Participante("yago","l",10);
		p1.addGenero("g1");
		p1.addGenero("g2");
		p1.addGenero("g8");
		p1.addGenero("g7");
		p1.addGenero("g4");
		
		Participante p2=new Participante("matias","l",15);
		p2.addGenero("g1");
		p2.addGenero("g4");
		p2.addGenero("g7");
		p2.addGenero("g8");
		
		
		//grupo g2
		
		
		Participante p3=new Participante("man","l",10);
		p3.addGenero("g1");
		p3.addGenero("g4");
		p3.addGenero("g7");
		p3.addGenero("g8");
		
		Participante p4=new Participante("n","l",30);
		p4.addGenero("g1");
		p4.addGenero("g7");
		p4.addGenero("g8");
		
		Grupo g2=new Grupo("g2");
		g2.add(p4);
		g2.add(p3);
		
		Grupo g1=new Grupo("g1");
		
		//grupo 3
		Participante p5=new Participante("n","l",30);
		p5.addGenero("g7");
		p5.addGenero("g8");
		Grupo g3=new Grupo("g3");
		
		g3.add(p5);
		
		g1.add(g2);
		g1.add(p1);
		g1.add(p2);
		g1.add(g3);
		
		
		ArrayList<String>generos=g1.getGenero();
		
		System.out.println(generos);

	}

}
