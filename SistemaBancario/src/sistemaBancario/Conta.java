package sistemaBancario;

public class Conta {

	private Funcionario titular;
	private double saldo;

	public Conta() {}
	
	public Conta(Funcionario titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public boolean sacar(double valor) {
		if((this.saldo >= valor) && (this.saldo - valor >= 0)) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean tranferir(Conta contaDestino, double valor) {
		if (sacar(valor)) {
			contaDestino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public String getTitular() {
		return this.titular.getNome();
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setTitular(Funcionario titular) {
		this.titular = titular;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	
	
}
