package sistemaBancario;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario() {}
	
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public double getBonificacao() {		
		return this.salario * 0.10;
	}

	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + ", getBonificacao()="
				+ getBonificacao() + ", getClass()=" + getClass() + "]";
	}
	
}
