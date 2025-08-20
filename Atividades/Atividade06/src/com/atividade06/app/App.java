package com.atividade06.app;

import javax.swing.JOptionPane;
import com.atividade06.model.Pessoa;
import com.atividade06.model.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        // Instância das classes Pessoa e Veiculo
        Pessoa proprietario = new Pessoa(
            null, 
            null, 
            null, 
            null, 
            null, 
            null
        );
        Veiculo veiculo = new Veiculo(
            null, 
            null, 
            null, 
            null, 
            null, 
            null, 
            proprietario
        );

        // Input dos dados do usuário
        proprietario.setNome(JOptionPane.showInputDialog("Informe o nome do proprietário do veículo:"));
        proprietario.setCpf(JOptionPane.showInputDialog("Informe o cpf do proprietário do veículo:"));
        proprietario.setEmail(JOptionPane.showInputDialog("Informe o email do proprietário do veículo:"));
        proprietario.setTelefone(JOptionPane.showInputDialog("Informe o telefone do proprietário do veículo:"));
        proprietario.setEndereco(JOptionPane.showInputDialog("Informe o endereço do proprietário do veículo:"));
        proprietario.setCnh(JOptionPane.showInputDialog("Informe a CNH do proprietário do veículo:"));

        // Input dos dados do veículo
        veiculo.setMarca(JOptionPane.showInputDialog("Informe a marca do veículo:"));
        veiculo.setModelo(JOptionPane.showInputDialog("Informe o modelo do veículo"));
        veiculo.setPlaca(JOptionPane.showInputDialog("Informe a placa do veículo"));
        veiculo.setCor(JOptionPane.showInputDialog("Informe a cor do veículo"));
        veiculo.setAno(JOptionPane.showInputDialog("Informe o ano do veículo"));
        veiculo.setFabricante(JOptionPane.showInputDialog("Informe o fabricante do veículo:"));

        // Output
        JOptionPane.showMessageDialog(
            null, 
            veiculo.exibirDados(), 
            "Dados do veículo", 
            JOptionPane.INFORMATION_MESSAGE
        ); 
    }
}
/* Atividade 06
 * Crie uma aplicação onde o usuário cadastra seus
 * dados pessoais e os dados do seu veículo pessoal, e o
 * programa exibe os dados do veículo na tela.
 * NOTE: use o conceito de composição,
 * onde um dos atributos de veículo é o proprietário.
 */
