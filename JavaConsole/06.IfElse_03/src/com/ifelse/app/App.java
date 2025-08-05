package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instancia do objeto Scanner
        Scanner leia = new Scanner(System.in);

        // Declaração de variáveis
        String nome;
        double nota;

        // Input
        System.out.println("Informe o nome do aluno: ");
        nome = leia.nextLine();
        System.out.println("Informe a nota do aluno: ");
        nota = leia.nextDouble();

        // Output
        if (nota >= 7) {
            System.out.println(nome + " está aprovado.");
        }
        else if (nota >= 5) {
            System.out.println(nome + " está de recuperação.");
        }
        else {
            System.out.println(nome + " está reprovado.");
        }

        // Fecha objeto leia
        leia.close();
    }
}
