package fag;

public class musica {
	private String titulo;
	private int duracaoSegundos;

	public musica(String titulo, int duracaoSegundos) {
		if (titulo == null || titulo.isEmpty())
			System.out.println("Título não pode ser vazio!");
		if (duracaoSegundos <= 0)
			System.out.println("Duração deve ser maior que 0!");
		this.titulo = titulo;
		this.duracaoSegundos = duracaoSegundos;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getDuracaoSegundos() {
		return duracaoSegundos;
	}

	public void setTitulo(String titulo) {
		if (titulo != null && !titulo.isEmpty())
			this.titulo = titulo;
	}

	public void setDuracaoSegundos(int duracaoSegundos) {
		if (duracaoSegundos > 0)
			this.duracaoSegundos = duracaoSegundos;
	}

	public String formatarDuracao() {
		int minutos = duracaoSegundos / 60;
		int segundos = duracaoSegundos % 60;
		return String.format("%02d:%02d", minutos, segundos);
	}
}