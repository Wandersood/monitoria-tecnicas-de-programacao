package controleDisciplinas;

import java.util.ArrayList;

public class Professor {
	
	private String nome;
	private String titulacaoMaxima;
	private double cargaHoraria;
	private static ArrayList<Professor> listaProfessores = new ArrayList<Professor>();
	
	public Professor() {
		listaProfessores.add(this);
	}

	public Professor(String nome, String titulacaoMaxima, double cargaHoraria) {
		this.nome = nome;
		this.titulacaoMaxima = titulacaoMaxima;
		this.cargaHoraria = cargaHoraria;
		listaProfessores.add(this);
	}
	
	public static ArrayList<Professor> buscarPorTitulacao(String titulacao) {
		ArrayList<Professor> listaAuxiliar = new ArrayList<Professor>();
		listaProfessores.forEach(professor -> {
			if (professor.titulacaoMaxima.equalsIgnoreCase(titulacao)) {
				listaAuxiliar.add(professor);
			}
		});
		return listaAuxiliar;
	}
	
	public static Professor buscarPorNome(String nome) {
		for (Professor professor : listaProfessores) {
	        if (professor.nome.equalsIgnoreCase(nome)) {
	            return professor;
	        }
	    }
	    return null;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTitulacaoMaxima() {
		return titulacaoMaxima;
	}

	public void setTitulacaoMaxima(String titulacaoMaxima) {
		this.titulacaoMaxima = titulacaoMaxima;
	}

	public double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public static ArrayList<Professor> getListaProfessores() {
		return listaProfessores;
	}

	@Override
	public String toString() {
		return "\nNome: " + nome + "\nTitulação Máxima: " + titulacaoMaxima + "\nCarga Horária: " + cargaHoraria + "\n";
	}
	
	
	

}
