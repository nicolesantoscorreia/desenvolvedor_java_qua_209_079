package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instanciar a classe Scanner
        Scanner leia = new Scanner(System.in);

        // Declaração de variáveis
        String nome;
        int idade;
        double altura;

        // Input 
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe sua idade: ");
        idade = leia.nextInt();
        System.out.println("Informe sua altura: ");
        altura = leia.nextDouble();

        // Estrutura de decisão
        if (idade >= 12 && altura >= 1.15) {
            System.out.println(nome + " está autorizado.");
        }
        else {
            System.out.println(nome + " não está autorizado.");
        }

        // Fecha objeto leia
        leia.close();
    }
}
