package locadora;

public class Veiculo {

	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private double valorKmRodado;
	private int kmInicial;
	private int kmFinal;
	
	public Veiculo() {
	}

	public Veiculo(String placa, String marca, String modelo, int ano, double valorKmRodado, int kmInicial,
			int kmFinal) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorKmRodado = valorKmRodado;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
	}

	public int calculaKmRodados() {
		return kmFinal - kmInicial;
	}
	
	public double calculaValorLocacao() {
		return calculaKmRodados() * valorKmRodado;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValorKmRodado() {
		return valorKmRodado;
	}

	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}

	public int getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(int kmInicial) {
		this.kmInicial = kmInicial;
	}

	public int getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(int kmFinal) {
		this.kmFinal = kmFinal;
	}
	
	
	
}
