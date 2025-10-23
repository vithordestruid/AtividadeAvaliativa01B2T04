package fag;

public class aluguelBicicleta {
	private int horas;
	private double valorHora;

	public aluguelBicicleta(int horas, double valorHora) {
	        setHoras(horas);
	        setValorHora(valorHora);
	    }

	public int getHoras() {
		return horas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setHoras(int horas) {
		if (horas < 1) {
			System.out.println("Horas deve ser maior ou igual a 1");
		}
		this.horas = horas;
	}

	public void setValorHora(double valorHora) {
		if (valorHora <= 0) {
			System.out.println("Valor por hora deve ser maior que 0");
		}
		this.valorHora = valorHora;
	}

	public double calcularValor() {
		return horas * valorHora;
	}
}