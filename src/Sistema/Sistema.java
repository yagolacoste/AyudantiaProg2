package Sistema;

import java.util.ArrayList;
import java.util.Comparator;

import TemaSistema.Tema;

public class Sistema {
	private ArrayList<Persona>participantes=new ArrayList<Persona>();
	private ArrayList<Jurado>jurado=new ArrayList<Jurado>();
	private ArrayList<Tema>temas=new ArrayList<Tema>();
	private Comparator<Persona>formaCompetencia;
	
	public Sistema(Comparator<Persona> formaCompetencia) {
		super();
		this.formaCompetencia = formaCompetencia;
	}

	public int batalla(Persona p1,Persona p2) {
		return formaCompetencia.compare(p1, p2);
	}

	public Comparator<Persona> getFormaCompetencia() {
		return formaCompetencia;
	}

	public void setFormaCompetencia(Comparator<Persona> formaCompetencia) {
		this.formaCompetencia = formaCompetencia;
	}
	
	
}
