package fag;

public class pessoa {
    private String nome;
    private double peso;
    private double altura;

    public pessoa(String nome, double peso, double altura) {
        if (nome.isEmpty())
            System.out.println("Nome não pode ser vazio!");
        if (peso <= 0)
        	System.out.println("Peso deve ser maior que 0!");
        if (altura <= 0)
            System.out.println("Altura deve ser maior que 0!");

        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() { return nome; }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String classificacaoIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) return "Abaixo do peso";
        else if (imc < 24.9) return "Normal";
        else if (imc < 29.9) return "Sobrepeso";
        else if (imc < 34.9) return "Obesidade Grau 1";
        else if (imc < 39.9) return "Obesidade Grau 2";
        else return "Obesidade Grau 3 (mórbida)";
    }
}
