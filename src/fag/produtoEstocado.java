package fag;

public class produtoEstocado {
	 private String nome;
	    private int quantidade;

	    public produtoEstocado(String nome, int quantidade) {
	        this.nome = nome;
	        this.quantidade = quantidade;

	        if (nome.isEmpty()) {
	            System.out.println("Nome não pode ser vazio");
	        }
	        if (quantidade < 0) {
	            System.out.println("Quantidade não pode ser negativa");
	            this.quantidade = 0;
	        }
	    }

	    public String getNome() {
	        return nome;
	    }

	    public int getQuantidade() {
	        return quantidade;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	        if (nome.isEmpty()) {
	            System.out.println("Nome não pode ser vazio");
	        }
	    }

	    public void setQuantidade(int quantidade) {
	        if (quantidade < 0) {
	            System.out.println("Quantidade não pode ser negativa");
	        } else {
	            this.quantidade = quantidade;
	        }
	    }

	    public void adicionarEstoque(int qtd) {
	        if (qtd < 0) {
	            System.out.println("Quantidade a adicionar não pode ser negativa");
	        } else {
	            this.quantidade += qtd;
	        }
	    }

	    public void removerEstoque(int qtd) {
	        if (qtd < 0) {
	            System.out.println("Quantidade a remover não pode ser negativa");
	        } else if (qtd > this.quantidade) {
	            System.out.println("Quantidade insuficiente em estoque. Disponível: " + this.quantidade);
	        } else {
	            this.quantidade -= qtd;
	        }
	    }
	}