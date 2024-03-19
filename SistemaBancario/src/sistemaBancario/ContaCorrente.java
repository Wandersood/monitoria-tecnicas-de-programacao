package sistemaBancario;

public class ContaCorrente extends Conta {
	
	public ContaCorrente() {}

	public ContaCorrente(Funcionario titular, double saldo) {
		super(titular, saldo);
	}

	@Override
	public String toString() {
		return "ContaCorrente [titular=" + this.getTitular() + "saldo=" + this.getSaldo() + " + getClass()" + getClass() + "]";
	}
	
	
}
