package sistemaBancario;

public class ContaLimite extends Conta {

	private double limite;
	
	public ContaLimite() {
	}

	public ContaLimite(Funcionario titular, double saldo, double limite) {
		super(titular, saldo);
		this.limite = limite;
	}

	@Override
	public boolean sacar(double valor) {
		if((this.getSaldo() + this.limite >= valor) && (this.getSaldo() - valor >= 0 - this.limite)) {
			double novoSaldo = this.getSaldo() - valor;
			this.setSaldo(novoSaldo);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "ContaLimite [limite=" + limite + "saldo:" + this.getSaldo() + "]" ;
	}
	
	
	
}
