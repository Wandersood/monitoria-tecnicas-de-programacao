package br.com.brasfut.models;

import java.util.Date;

public class Jogador {

	private int id;
	private String nome;
	private String apelido;
	private Date dataNascimento;
	private int numero;
	private String posicao;
	private int qualidade;
	private int cartoes;
	private boolean suspenso;
	private boolean treinamento;
	private static int jogadores = 0;
	
	public Jogador() {
		this.id = jogadores++;
		this.cartoes= 0;
		this.suspenso = false;
	}

	public Jogador(String nome, String apelido, Date dataNascimento, int numero, String posicao, int qualidade) {
		this.id = jogadores++;
		this.nome = nome;
		this.apelido = apelido;
		this.dataNascimento = dataNascimento;
		this.numero = numero;
		this.posicao = posicao;
		this.qualidade = qualidade;
		this.cartoes= 0;
		this.suspenso = false;
		this.treinamento = false;	
	}
	
	public void aplicarCartao() {
		cartoes++;
		if (cartoes == 3) {
			suspenso = true;			
		}
	}
	
	public void cumprirSuspensao() {
		cartoes = 0;
		suspenso = false;
	}
	
	public void sofrerLesao() {
		double rand = Math.random();
		
		if (rand <= 0.05) {
			qualidade -=  (15 * qualidade) / 100;
		} else if (rand <= 0.15) {
			qualidade -=  (10 * qualidade) / 100;
		} else if (rand <= 0.30) {
			qualidade -=  (5 * qualidade) / 100;
		} else if (rand <= 0.60) {
			qualidade -= 2;
		} else {
			qualidade -= 1;
		}		
	}
	
	
	public void executarTreinamento() {
		double rand = Math.random();
		
		if (!treinamento) {
			if (rand <= 0.05 && qualidade <= 95) {
				qualidade += 5;
			} else if (rand <= 0.15 && qualidade <= 96) {
				qualidade += 4;
			} else if (rand <= 0.30 && qualidade <= 97) {
				qualidade += 3;
			} else if (rand <= 0.60 && qualidade <= 98) {
				qualidade += 2;
			} else if (qualidade <= 99) {
				qualidade += 1;
			}
			
			treinamento = true;
		}
		
		
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public int getQualidade() {
		return qualidade;
	}

	public void setQualidade(int qualidade) {
		this.qualidade = qualidade;
	}

	public int getCartoes() {
		return cartoes;
	}

	public void setCartoes(int cartoes) {
		this.cartoes = cartoes;
	}

	public boolean isSuspenso() {
		return suspenso;
	}

	public void setSuspenso(boolean suspenso) {
		this.suspenso = suspenso;
	}
	
	public boolean isTreinamento() {
		return treinamento;
	}

	public void setTreinamento(boolean treinamento) {
		this.treinamento = treinamento;
	}

	public int getId() {
		return id;
	}
	
}
