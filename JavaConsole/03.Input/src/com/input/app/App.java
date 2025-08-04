package com.input.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instância do objeto de entrada de dados
        Scanner leia = new Scanner(System.in);

        // Declaração de variáveis
        String nome;
        String email;
        int idade;

        // Input (Entrada de Dados)
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe sua idade: ");
        idade = leia.nextInt();

        //Limpeza de buffer
        leia.nextLine();

        System.out.println("Informe seu email: ");
        email = leia.nextLine();

        // Output (Saída de Dados)
        System.out.println("Nome: " + nome + ".");
        System.out.println("Idade: " + idade + ".");
        System.out.println("E-mail: " + email + ".");

        // Fechar o objeto
        leia.close();
    }
}
