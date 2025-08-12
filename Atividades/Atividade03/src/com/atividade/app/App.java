package com.atividade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instancia das classes
        Scanner leia = new Scanner(System.in);
        Conta cc = new Conta("", "", "10101-1", "1001-10", 0.0);

        // Declaração de variáveis
        int opcao;
        double valor;

        // Input
        System.out.println("Informe o nome do titular da conta:");
        cc.titular = leia.nextLine();
        System.out.println("Informe o seu cpf:");
        cc.cpf = leia.nextLine();

        do {
            // Menu
            System.out.println("BANCO JAVA");
            System.out.println("1 - Exibir dados da conta.");
            System.out.println("2 - Fazer depósito.");
            System.out.println("3 - Fazer saque.");
            System.out.println("4 - Sair do programa.");
            System.out.println("Informe a opção desejada:");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    cc.exibirDados();
                    break;
                case 2:
                    System.out.println("Informe o valor do depósito, em R$:");
                    valor = leia.nextDouble();
                    leia.nextLine();
                    System.out.println((valor > 0) ? "Depósito realizado com sucesso. Saldo: R$ " + cc.fazerDeposito(valor) : "Valor do depósito inválido.");
                    break; 
                case 3:
                    System.out.println("Informe o valor do saque, em R$:");
                    valor = leia.nextDouble();
                    leia.nextLine();
                    System.out.println((valor > 0 && valor <= cc.saldo) ? "Saque efetuado com sucesso. R$ " + cc.fazerSaque(valor) : "Valor do saque inválido.");
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        leia.close();
    }
}
 /*!SECTION
     * Crie um programa com uma classe chamada Contas, com os
     * seguintes atributos:
     * - Titular da conta
     * - CPF do titular 
     * - Agência 
     * - Número da conta 
     * - Saldo
     * O usuário deverá informar o nome do titular e o cpf, e 
     * o programa exibe um menu com as seguintes operações:
     * - Exibir dados da conta
     * - Fazer saque
     * - Fazer depósito
     * - Sair do programa 
 */