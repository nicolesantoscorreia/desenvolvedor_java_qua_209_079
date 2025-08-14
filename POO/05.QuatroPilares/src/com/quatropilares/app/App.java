package com.quatropilares.app;

import java.util.Scanner;
import com.quatropilares.model.PessoaFisica;
import com.quatropilares.model.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null, null, null);

        // Input do usuário
        System.out.println("Informe os dados do usuário\n");
        System.out.println("Informe o nome:");
        usuario.setNome(leia.nextLine());
        System.out.println("Informe o CPF:");
        usuario.setCpf(leia.nextLine());
        System.out.println("Informe a data de nascimento:");
        usuario.setDataNascimento(leia.nextLine());
        System.out.println("Informe o e-mail:");
        usuario.setEmail(leia.nextLine());
        System.out.println("Informe o telefone:");
        usuario.setTelefone(leia.nextLine());
        System.out.println("Informe o endereço:");
        usuario.setEndereco(leia.nextLine());

        // Input da empresa
        System.out.println("Informe os dados do empresa\n");
        System.out.println("Informe a Razão Social:");
        empresa.setRazaoSocial(leia.nextLine());
        System.out.println("Informe o nome da empresa:");
        empresa.setNomeFantasia(leia.nextLine());
        System.out.println("Informe o CNPJ:");
        empresa.setCnpj(leia.nextLine());
        System.out.println("Informe o e-mail:");
        empresa.setEmail(leia.nextLine());
        System.out.println("Informe o telefone:");
        empresa.setTelefone(leia.nextLine());
        System.out.println("Informe o endereço:");
        empresa.setEndereco(leia.nextLine());

        // Output do usuário
        System.out.println("Informações do usuário:\n");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("Data de nascimento: " + usuario.getDataNascimento());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Telefone: " + usuario.getTelefone());
        System.out.println("Endereço: " + usuario.getEndereco());

        // Output da empresa
        System.out.println("Informações da empresa:\n");
        System.out.println("Razão Social: " + empresa.getRazaoSocial());
        System.out.println("Nome da empresa: " + empresa.getNomeFantasia());
        System.out.println("CNPJ: " + empresa.getCnpj());
        System.out.println("E-mail: " + empresa.getEmail());
        System.out.println("Telefone: " + empresa.getTelefone());
        System.out.println("Endereço: " + empresa.getEndereco());

        leia.close();
    }
}
