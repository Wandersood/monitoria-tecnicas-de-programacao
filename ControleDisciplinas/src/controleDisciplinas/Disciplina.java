package controleDisciplinas;

import java.util.ArrayList;

public class Disciplina {

	private String nome;
	private double cargaHoraria;
	private Professor professor;
	private static ArrayList<Disciplina> listaDisciplinas = new ArrayList<Disciplina>();
	
	public Disciplina() {
		listaDisciplinas.add(this);
	}
	
	public Disciplina(String nome, double cargaHoraria) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		listaDisciplinas.add(this);
	}
	
	public Disciplina(String nome, double cargaHoraria, Professor professor) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.professor = professor;
		listaDisciplinas.add(this);
	}

	public static Professor buscarProfessorDeDisciplina(String nomeDisc) {
		for (Disciplina disciplina: listaDisciplinas) {
	        if (disciplina.nome.equalsIgnoreCase(nomeDisc)) {
	            return disciplina.professor;
	        }
	    }
	    return null;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getCargaHoraria() {
		return this.cargaHoraria;
	} 
	
	public void setCargaHoraria(double carga_horaria) {
		this.cargaHoraria = carga_horaria;
	}
	
	public Professor getProfessor() {
		return this.professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public static ArrayList<Disciplina> getListaDisciplinas() {
		return listaDisciplinas;
	}
	
	@Override
	public String toString() {
		return "\nNome: " + nome + "\nCarga Horária: " + cargaHoraria + "\nProfessor: " + professor + "\n";
	}
	
}


