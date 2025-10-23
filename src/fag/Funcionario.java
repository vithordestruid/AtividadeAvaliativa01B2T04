package fag;

public class Funcionario {
	    private String nome;
	    private double salario;

	    public Funcionario() {

	    }

	    public Funcionario(String nome, double salario) {
	        setNome(nome);
	        setSalario(salario);
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        if (nome == null || nome.trim().isEmpty()) {
	          System.out.println("Nome não pode ser vazio");
	        }
	        this.nome = nome;
	    }

	    public double getSalario() {
	        return salario;
	    }

	    public void setSalario(double salario) {
	        if (salario < 0) {
	        	 System.out.println("Salário não pode ser negativo");
	        }
	        this.salario = salario;
	    }

	    public void aumentarSalario(double percentual) {
	        if (percentual < 0) {
	        	 System.out.println("Percentual não pode ser negativo");
	        }
	        double aumento = this.salario * (percentual / 100);
	        this.salario += aumento;
	    }

	    public void exibirDados() {
	        System.out.println("Nome:  " + nome + "Salario: R$ "+ salario);

	    }
	}