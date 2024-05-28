package br.com.brasfut.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Time {

	private String nome;
	private String apelido;
	private Date fundacao;
	private ArrayList<Jogador> plantel;
	private ArrayList<Jogador> relacionados;

	public Time() {
	}

	public Time(String nome, String apelido, Date fundacao, ArrayList<Jogador> plantel,
			ArrayList<Jogador> relacionados) {
		this.nome = nome;
		this.apelido = apelido;
		this.fundacao = fundacao;
		this.plantel = plantel;
		this.relacionados = relacionados;
	}
	
	public void relacionarJogadores() {
		ArrayList<Jogador> aux = new ArrayList<Jogador>();		
		Collections.sort(plantel, new Comparator<Jogador>() {
			@Override
			public int compare(Jogador j1, Jogador j2) {
				return Integer.compare(j2.getQualidade(), j1.getQualidade());
			}
		});
		
		for (int i = 0; i < 18; i++) {
			aux.add(plantel.get(i));
		}
		
		relacionados = aux;

	}
	
	public ArrayList<Jogador> visualizarTitulares() {
		ArrayList<Jogador> titulares = new ArrayList<Jogador>();
		for (int i = 0; i < 11; i++) {
			titulares.add(relacionados.get(i));
		}
		
		return titulares;
	}
	
	public ArrayList<Jogador> visualizarReservas() {
		ArrayList<Jogador> reservas = new ArrayList<Jogador>();
		for (int i = 11; i < 18; i++) {
			reservas.add(relacionados.get(i));
		}
		
		return reservas;
	}
	

	public int calcularQualidadeTitulares() {
		int qualidade = 0;
		
		for (int i = 0; i < 11; i++) {
			qualidade += relacionados.get(i).getQualidade(); 
		}
		
		return qualidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Date getFundacao() {
		return fundacao;
	}

	public void setFundacao(Date fundacao) {
		this.fundacao = fundacao;
	}

	public ArrayList<Jogador> getPlantel() {
		return plantel;
	}

	public void setPlantel(ArrayList<Jogador> plantel) {
		this.plantel = plantel;
	}

	public ArrayList<Jogador> getRelacionados() {
		return relacionados;
	}

	public void setRelacionados(ArrayList<Jogador> relacionados) {
		this.relacionados = relacionados;
	}
	
	
	
	
	
}
