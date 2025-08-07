package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instância da classe Scanner
        Scanner leia = new Scanner(System.in);

        // Declaração de variáveis 
        String nome, sala;
        int idade, idadeMinima = 0;

        // Input
        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe sua idade:");
        idade = leia.nextInt();

        // Limpeza de buffer
        leia.nextLine();

        do {
            // Salas
            System.out.println("☕ Cine Java ☕\n");
            System.out.println("Sala 1 - Como treinar seu dragão (Livre)");
            System.out.println("Sala 2 - Jumanji (12 anos)");
            System.out.println("Sala 3 - Jurassic World (14 anos)");
            System.out.println("Sala 4 - Matrix (16 anos)");
            System.out.println("Sala 5 - Deadpool (18 anos)");
            System.out.println("Qual sala deseja entrar:");
            sala = leia.nextLine();

            switch (sala) {
                case "1":
                    break;
                case "2":
                    idadeMinima = 12;
                    break;
                case "3":
                    idadeMinima = 14;
                    break;
                case "4":
                    idadeMinima = 16;
                    break;
                case "5":
                    idadeMinima = 18;
                    break;
                default:
                    idadeMinima = idade + 1;
                    System.out.println("Sala inexistente.");
            }

            if (idade >= idadeMinima) {
                System.out.println("Entrada permitida para " + nome + ".");
                System.out.println("Tenha um bom filme! 🎟");
            }
            else {
                System.out.println("Favor escolher outro filme!");
            }
        } while (idade < idadeMinima);

        leia.close();
    }
}

/*!SECTION
         * Crie uma aplicação em Java em que o usuário informe o nome 
         * e a idade, e o programa exibe 5 salas de cinema, cada uma
         * exibindo um filme com uma classificação indicativa.
         * O programa deverá escolher a sala de acordo com o filme desejado,
         * e se o usuário tiver idade para ver o filme, o programa imprime
         * o ingresso e encerra. Caso usuário não tenha a idade mínima,
         * o programa proíbe a entrada e pede para escolher outro filme.
         */
