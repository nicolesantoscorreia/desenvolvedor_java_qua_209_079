package com.atividade.app;

public class Conta {
    // Atributos
    public String titular;
    public String cpf;
    public String agencia;
    public String numConta;
    public double saldo;

    // Construtor
    public Conta(String titular, String cpf, String agencia, String numConta, double saldo) {
        this.titular = titular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    // Métodos
    public void exibirDados() {
        System.out.println("Nome do titular: " + this.titular + ".");
        System.out.println("CPF do titular: " + this.cpf + ".");
        System.out.println("Agência: " + this.agencia + ".");
        System.out.println("Número da conta: " + this.numConta + ".");
        System.out.println("Saldo da conta: R$ " + String.format("%.2f", this.saldo) + ".");
    }

    public double fazerDeposito(double valor) {
        this.saldo += valor; // Ou... this.saldo = this.saldo + valor;
        return this.saldo;
    }

    public double fazerSaque(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }
}
