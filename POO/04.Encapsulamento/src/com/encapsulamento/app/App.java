package com.encapsulamento.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instanciar a classe Pessoa
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa();

        // Inputs
        System.out.println("Informe o nome:");
        usuario.setNome(leia.nextLine());
        System.out.println("Informe sua idade:");
        usuario.setIdade(leia.nextInt());

        // Output
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());

        leia.close();
    }
}
