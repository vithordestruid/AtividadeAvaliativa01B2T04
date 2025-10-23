package fag;

public class contaLuz {
	private double consumoKwh;
	private double valorKwh;

	public contaLuz(double consumoKwh, double valorKwh) {
	        setConsumoKwh(consumoKwh);
	        setValorKwh(valorKwh);
	    }

	public double getConsumoKwh() {
		return consumoKwh;
	}

	public double getValorKwh() {
		return valorKwh;
	}

	public void setConsumoKwh(double consumoKwh) {
		if (consumoKwh <= 0) {
			System.out.println("Consumo deve ser maior que 0");
		}
		this.consumoKwh = consumoKwh;
	}

	public void setValorKwh(double valorKwh) {
		if (valorKwh <= 0) {
			System.out.println("Valor por kWh deve ser maior que 0");
		}
		this.valorKwh = valorKwh;
	}

	public double valorTotal() {
		return consumoKwh * valorKwh;
	}
}