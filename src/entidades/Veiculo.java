package entidades;

public class Veiculo {
	private int passageiros;
	private double capacidade;
	private double consumo;
	
	public Veiculo(int passageiros, double capacidade, double consumo) {
		this.passageiros = passageiros;
		this.capacidade = capacidade;
		this.consumo = consumo;
	}
	
	public double tanqueViagem(double quilometro) {
		return quilometro/(consumo*capacidade);
	}
	
	public double dividirDespesas(double quilometro, double combustivel) {
		return (quilometro/consumo*combustivel)/passageiros;
	}
	
	public int getPassageiros() {
		return passageiros;
	}
	
	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	
	public double getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	
	public double getConsumo() {
		return consumo;
	}
	
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	
	public String toString() {
		return "\nO veículo comporta "+passageiros
				+" pessoas,\n tem uma capacidade de "+capacidade
				+" litros de combustível,\n e faz "+consumo
				+" quilômetros por litro.\n";
	}

}
