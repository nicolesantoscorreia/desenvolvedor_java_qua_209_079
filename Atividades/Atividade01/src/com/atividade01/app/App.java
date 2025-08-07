package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instância de Scanner
        Scanner leia = new Scanner(System.in);

        // Declaração de variáveis
        String nome, opcao, diagnostico; // opcao
        double peso, altura, imc;
        int saida = 0;

        // Loop
        do {
            // Menu
            System.out.println("1 - Calcular IMC.");
            System.out.println("2 - Sair do programa.");
            System.out.println("Informe a opção desejada.");
            opcao = leia.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Informe seu nome:");
                    nome = leia.nextLine();
                    System.out.println("Informe seu peso:");
                    peso = leia.nextDouble();
                    System.out.println("Informe sua altura:");
                    altura = leia.nextDouble();

                    imc = peso / (altura*altura);

                    System.out.println("O IMC do " + nome + " é " + String.format("%.2f", imc) + ".");

                    diagnostico = (imc < 18.5) ? nome +  " está abaixo do peso." 
                    : (imc < 25) ? nome + " está com o peso normal."
                    : (imc < 30) ? nome + " está com sobrepeso."
                    : (imc < 35) ? nome + " está com obesidade grau I."
                    : (imc < 40) ? nome + " está com obesidade grau II."
                    : nome + " está com obesidade grau III.";

                    System.out.println(diagnostico);

                    /* 
                    if (imc < 18.5) {
                        System.out.println(nome +  " está abaixo do peso.");
                    }
                    else if (imc > 18.5 && imc <= 24.9) {
                        System.out.println(nome + " está com o peso normal.");
                    }
                    else if (imc >= 25 && imc <= 29.9) {
                        System.out.println(nome + " está com sobrepeso.");
                    }
                    else if (imc >= 30 && imc <= 34.9) {
                        System.out.println(nome + " está com obesidade grau I.");
                    }
                    else if (imc >= 35 && imc <= 39.9) {
                        System.out.println(nome + " está com obesidade grau II.");
                    }
                    else {
                        System.out.println(nome + " está com obesidade grau III.");
                    }
                    */
                    break;
                case "2":
                    saida = Integer.parseInt(opcao);
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }    
        } while (saida != 2);

        // Fecha o objeto Scanner
        leia.close();
    }
}
/*!SECTION
 * Criar um programa que receba o nome, peso e altura de usuário,
 * e calcule o valor de seu IMC (Índice de Massa Corporal),
 * cuja fórmula é peso/altura*altura, e informe o seu diagnóstico
 * baseado na tabela do IMC (pesquisa na internet pela tabela),
 * O programa poderá calcular o IMC de vários usuários,
 * e deverá ter a opção de sair do programa.
 */

