package fag;

public class Filmes {
    private String titulo;
    private double avaliacao;

    public Filmes() {
    }


    public Filmes(String titulo, double avaliacao) {
        setTitulo(titulo);
        setAvaliacao(avaliacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.trim().isEmpty()) {
            System.out.println("Título não pode ser vazio");
            System.exit(0);
        }
        this.titulo = titulo;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        if (avaliacao < 0 || avaliacao > 5) {
            System.out.println("Avaliação deve estar entre 0 e 5");
            System.exit(0);
        }
        this.avaliacao = avaliacao;
    }

    public void exibir() {
        System.out.println("Filme:" + titulo + " Avaliação:" + avaliacao);
    }
}