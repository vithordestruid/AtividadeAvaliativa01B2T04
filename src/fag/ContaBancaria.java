package fag;

public class ContaBancaria {
    private String titular;
    private double saldo;


    public ContaBancaria(String titular, double saldo) {
        setTitular(titular);
        setSaldo(saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular.isEmpty()) {
            System.out.println("Titular não pode estar vazio");
        } else {
            this.titular = titular;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Saldo não pode ser negativo");
        } else {
            this.saldo = saldo;
        }
    }

    public void depositar(double valor) {
        if(valor <= 0) {
            System.out.println("Depósito deve ser positivo");
        } else {
            this.saldo = this.saldo + valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque deve ser positivo");
        } else if (this.saldo - valor < 0) {
            System.out.println("Saldo insuficiente para saque");
        } else {
            this.saldo = this.saldo - valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        }
    }
}