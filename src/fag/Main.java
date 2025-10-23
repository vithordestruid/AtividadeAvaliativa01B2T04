package fag;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		int opcao = 0;
		System.out.println("atividade para rodar: 1 a 10");
		Scanner scanner = new Scanner(System.in);
		opcao = scanner.nextInt();
		switch (opcao) {
		case 1:
			Att1();
			break;
		case 2:
			Att2();
			break;
		case 3:
			Att3();
			break;
		case 4:
			Att4();
			break;
		case 5:
			Att5();
			break;
		case 6:
			Att6();
			break;
		case 7:
			Att7();
			break;
		case 8:
			Att8();
			break;
		case 9:
			Att9();
			break;
		case 10:
			Att10();
			break;
		}

	}

	public static void Att1() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome do titular:");
		String nome = scanner.nextLine();

		System.out.println("Digite o saldo inicial:");
		double saldoInicial = scanner.nextDouble();

		ContaBancaria conta = new ContaBancaria(nome, saldoInicial);

		int opcao;
		do {
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Ver Saldo");
			System.out.println("4 - Ver Informações da Conta");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");

			opcao = scanner.nextInt();
			scanner.nextLine();
			switch (opcao) {
			case 1:
				System.out.print("Digite o valor para depósito: R$ ");
				double valorDeposito = scanner.nextDouble();
				scanner.nextLine();
				conta.depositar(valorDeposito);
				break;

			case 2:
				System.out.print("Digite o valor para saque: R$ ");
				double valorSaque = scanner.nextDouble();
				scanner.nextLine();
				conta.sacar(valorSaque);
				break;

			case 3:
				System.out.println("Saldo atual: R$ " + conta.getSaldo());
				break;

			case 4:
				System.out.println("Titular: " + conta.getTitular());
				System.out.println("Saldo: R$ " + conta.getSaldo());
				break;
			}
			System.out.println();
		} while (opcao != 0);

		scanner.close();
	}

	public static void Att2() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Primeiro filme:");
		System.out.print("Digite o título: ");
		String titulo1 = scanner.nextLine();
		System.out.print("Digite a avaliação (0-5): ");
		double avaliacao1 = scanner.nextDouble();
		scanner.nextLine();

		Filmes filme1 = new Filmes(titulo1, avaliacao1);

		System.out.println("Segundo filme");
		System.out.print("Digite o título: ");
		String titulo2 = scanner.nextLine();

		System.out.print("Digite a avaliação (0-5): ");
		double avaliacao2 = scanner.nextDouble();

		Filmes filme2 = new Filmes(titulo2, avaliacao2);

		System.out.println("FILMES CADASTRADOS");
		filme1.exibir();
		filme2.exibir();
		scanner.close();
	}

	public static void Att3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nome do funcionario:");
		String nome = scanner.nextLine();

		System.out.println("Salario do funcionario");
		double salario = scanner.nextDouble();

		Funcionario funcionario = new Funcionario(nome, salario);

		System.out.println("Antes do aumento:");
		funcionario.exibirDados();

		System.out.print("Digite o percentual de aumento (%): ");
		double percentual = scanner.nextDouble();

		funcionario.aumentarSalario(percentual);

		System.out.println("Depois do aumento:");
		funcionario.exibirDados();

		scanner.close();
	}

	public static void Att4() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a largura do retângulo: ");
		double largura = scanner.nextDouble();
		System.out.print("Digite a altura do retângulo: ");
		double altura = scanner.nextDouble();

		retangulo retan = new retangulo(largura, altura);
		if (altura > 0 && largura > 0) {
			System.out.println("Largura: " + retan.getLargura());
			System.out.println("Altura: " + retan.getAltura());
			System.out.println("Área: " + retan.area());
			System.out.println("Perímetro: " + retan.perimetro());
		}
		scanner.close();
	}

	public static void Att5() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o título da primeira música: ");
		String titulo1 = scanner.nextLine();
		System.out.print("Digite a duração em segundos da primeira música: ");
		int duracao1 = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Digite o título da segunda música: ");
		String titulo2 = scanner.nextLine();
		System.out.print("Digite a duração em segundos da segunda música: ");
		int duracao2 = scanner.nextInt();
		scanner.nextLine();

		musica musica1 = new musica(titulo1, duracao1);
		musica musica2 = new musica(titulo2, duracao2);

		System.out.println(musica1.getTitulo() + " - " + musica1.formatarDuracao());
		System.out.println(musica2.getTitulo() + " - " + musica2.formatarDuracao());
	}

	public static void Att6() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o nome da pessoa: ");
		String nome = scanner.nextLine();

		System.out.print("Digite o peso da pessoa (kg): ");
		double peso = scanner.nextDouble();

		System.out.print("Digite a altura da pessoa (m): ");
		double altura = scanner.nextDouble();
		scanner.nextLine();

		pessoa pessoa = new pessoa(nome, peso, altura);

		double imc = pessoa.calcularIMC();
		System.out.println(pessoa +" possui IMC = "+ imc);
		System.out.println("Classificação: " + pessoa.classificacaoIMC());
	}

	public static void Att7() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o consumo em kWh: ");
		double consumo = scanner.nextDouble();

		System.out.print("Digite o valor por kWh: ");
		double valorKwh = scanner.nextDouble();

		contaLuz conta = new contaLuz(consumo, valorKwh);

		System.out.println("Consumo: " + conta.getConsumoKwh() + " kWh");
		System.out.println("Valor por kWh: " + conta.getValorKwh());
		System.out.println("Valor total a pagar: " + conta.valorTotal());
	}

	public static void Att8() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de horas: ");
		int horas = scanner.nextInt();

		System.out.print("Digite o valor por hora: R$ ");
		double valorHora = scanner.nextDouble();

		aluguelBicicleta novoAluguel = new aluguelBicicleta(horas, valorHora);
		System.out.println("Valor total do aluguel: R$ " + novoAluguel.calcularValor());

		scanner.close();
	}

	public static void Att9() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o nome do produto: ");
		String nome = scanner.nextLine();

		System.out.print("Digite a quantidade inicial: ");
		int quantidade = scanner.nextInt();

		produtoEstocado produto = new produtoEstocado(nome, quantidade);

		System.out.println("Produto criado: " + produto.getNome() + " - Quantidade: " + produto.getQuantidade());

		System.out.print("Quantidade para adicionar ao estoque: ");
		int qtdAdicionar = scanner.nextInt();
		produto.adicionarEstoque(qtdAdicionar);
		System.out.println("Apos adicionar: " + produto.getQuantidade());

		System.out.print("Quantidade para remover do estoque: ");
		int qtdRemover = scanner.nextInt();
		produto.removerEstoque(qtdRemover);
		System.out.println("Quantidade final: " + produto.getQuantidade());

		scanner.close();
	}

	public static void Att10() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a temperatura em Celsius: ");
		double celsius = scanner.nextDouble();

		temperatura temp = new temperatura(celsius);

		System.out.println("Temperatura em Celsius: " + temp.getCelsius() + "°C");
		System.out.println("Temperatura em Fahrenheit: " + temp.paraFahrenheit() + "°F");
		System.out.println("Temperatura em Kelvin: " + temp.paraKelvin() + "K");

		scanner.close();
	}

}