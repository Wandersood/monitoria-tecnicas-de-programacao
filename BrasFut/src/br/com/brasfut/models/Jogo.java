package br.com.brasfut.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Jogo {

	private Time mandante;
	private Time visitante;
	private Date dataDoJogo;
	private String estado;
	private String cidade;
	private Integer placarMandante;
	private Integer placarVisitante;
	
	private Random random = new Random();
	
	public Jogo() {
		this.placarMandante = 0;
		this.placarVisitante = 0;
	}

	public Jogo(Time mandante, Time visitante, Date dataDoJogo, String estado, String cidade) {
		super();
		this.mandante = mandante;
		this.visitante = visitante;
		this.dataDoJogo = dataDoJogo;
		this.estado = estado;
		this.cidade = cidade;
		this.placarMandante = 0;
		this.placarVisitante = 0;
	}
	
	public void gerarResultado() {
		int qualidadeMandante = mandante.calcularQualidadeTitulares();
		int qualidadeVisitante = visitante.calcularQualidadeTitulares();		
		String resultado;
		int placar1 = random.nextInt(7) + 1;
		int placar2 = random.nextInt(7) + 1;
		int[] placares = new int[2];
		
		if (placar1 == placar2) {
			placar1++;			
		} 

		if (placar1 > placar2) {
			placares[0] = placar1;
			placares[1] = placar2;
		} else {
			placares[0] = placar2;
			placares[1] = placar1;
		}
		
		double rand = Math.random();		
		
		if (rand <= 0.5) {
			resultado = "maior";
		} else if (rand <= 0.8) {
			resultado = "menor";
		} else {
			resultado = "empate";
		}
		
		if (qualidadeMandante > qualidadeVisitante && resultado.equals("maior")) {
			placarMandante = placares[0];
			placarVisitante = placares[1];
		} else if (qualidadeMandante > qualidadeVisitante && resultado.equals("menor")) {
			placarMandante = placares[1];
			placarVisitante = placares[0];
		} else if (qualidadeMandante < qualidadeVisitante && resultado.equals("maior")) {
			placarMandante = placares[1];
			placarVisitante = placares[0];
		} else if (qualidadeMandante < qualidadeVisitante && resultado.equals("menor")) {
			placarMandante = placares[0];
			placarVisitante = placares[1];
		} else {
			placarMandante = placares[0];
			placarVisitante = placares[0];		
		}
	}
	
	public void gerarLesoes() {
		int lesoes = random.nextInt(2);
		int jogador = random.nextInt(11);
		double time = Math.random();
		
		for (int i = 0; i < lesoes; i++) {
			if (time <= 0.5) {
				mandante.getRelacionados().get(jogador).sofrerLesao();				
			} else {
				visitante.getRelacionados().get(jogador).sofrerLesao();
			}
			time = Math.random();			
		}
	}
	
	public void gerarCartoes() {
		int cartoes = random.nextInt(10);
		int jogador = random.nextInt(11);
		double time = Math.random();
		
		for (int i = 0; i < cartoes; i++) {
			if (time <= 0.5) {
				mandante.getRelacionados().get(jogador).aplicarCartao();
			} else {
				visitante.getRelacionados().get(jogador).aplicarCartao();
			}
			time = Math.random();			
		}
	}
	
	public void permitirTreinamento() {
		for (int i = 0; i < mandante.getPlantel().size(); i++) {
			mandante.getPlantel().get(i).setTreinamento(false);
		}
		for (int i = 0; i < visitante.getPlantel().size(); i++) {
			visitante.getPlantel().get(i).setTreinamento(false);
		}
	}

	public Time getMandante() {
		return mandante;
	}

	public void setMandante(Time mandante) {
		this.mandante = mandante;
	}

	public Time getVisitante() {
		return visitante;
	}

	public void setVisitante(Time visitante) {
		this.visitante = visitante;
	}

	public Date getDataDoJogo() {
		return dataDoJogo;
	}

	public void setDataDoJogo(Date dataDoJogo) {
		this.dataDoJogo = dataDoJogo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Integer getPlacarMandante() {
		return placarMandante;
	}

	public void setPlacarMandante(Integer placarMandante) {
		this.placarMandante = placarMandante;
	}

	public Integer getPlacarVisitante() {
		return placarVisitante;
	}

	public void setPlacarVisitante(Integer placarVisitante) {
		this.placarVisitante = placarVisitante;
	}
	
	
	
	
	
	
}
