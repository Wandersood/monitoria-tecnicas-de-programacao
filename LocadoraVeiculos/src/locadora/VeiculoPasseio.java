package locadora;

public class VeiculoPasseio extends Veiculo {

	private boolean arCondicionado;
	private int numeroPortas;
	
	public VeiculoPasseio() {
		
	}
	
	public VeiculoPasseio(String placa, String marca, String modelo, int ano, double valorKmRodado, int kmInicial,
			int kmFinal, boolean arCondicionado, int numeroPortas) {
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal);
		this.arCondicionado = arCondicionado;
		this.numeroPortas = numeroPortas;
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}	
	
}
