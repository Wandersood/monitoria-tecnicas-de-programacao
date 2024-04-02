package locadora;

public class VeiculoCarga extends Veiculo {
	
	private int capacidadeCarga;

	public VeiculoCarga() {
	}

	public VeiculoCarga(String placa, String marca, String modelo, int ano, double valorKmRodado, int kmInicial,
			int kmFinal, int capacidadeCarga) {
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal);
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	@Override
	public double calculaValorLocacao() {
		return super.calculaValorLocacao() * 1.1;
	}
	
}
