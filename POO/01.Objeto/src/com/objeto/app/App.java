package com.objeto.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Intancia da classe Pessoa 
        Pessoa usuario = new Pessoa("", 0, 0.0);
        Scanner leia = new Scanner(System.in);

        // Define os valores dos atributos 
        System.out.println("Informe o nome:");
        usuario.nome = leia.nextLine();
        System.out.println("Informe a idade:");
        usuario.idade = leia.nextInt();
        System.out.println("Informe a altura em metros:");
        usuario.altura = leia.nextDouble();
        
        // Output
        System.out.println(usuario.cumprimentar());
        usuario.exibirDados();

        leia.close();
    }
}
