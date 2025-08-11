package com.atividade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner leia = new Scanner(System.in);

        do {
            // Menu
            System.out.println("1 - Exibir dados.");
            System.out.println("2 - Fazer saque.");
            System.out.println("3 - Fazer depósito.");
            System.out.println("Escolha a operação desejada:");
        } while ();

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