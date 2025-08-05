package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instanciar o objeto Scanner
        Scanner leia = new Scanner(System.in);

        // Declaração de variáveis 
        String nome;
        int idade;

        // Input
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe sua idade: ");
        idade = leia.nextInt();

        //Estrutura de decisão 
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        }
        else {
            System.out.println(nome + " é menor de idade.");
        }
        
        // Fecha objeto leia
        leia.close();
    }
}
