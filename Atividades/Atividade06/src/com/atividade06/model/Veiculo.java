package com.atividade06.model;

public class Veiculo {
    // Atributos
    private String marca;
    private String modelo;
    private String placa;
    private String ano;
    private String cor;
    private String fabricante;
    private Pessoa proprietario; 

    // Construtor
    public Veiculo(String marca, String modelo, String placa, String ano, String cor, String fabricante, Pessoa proprietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
        this.fabricante = fabricante;
        this.proprietario = proprietario;
    }

    // Get e Set 
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Pessoa getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    // Método
    public String exibirDados() {
        return "Marca: " + this.marca +
        "\nModelo: " + this.modelo +
        "\nPlaca: " + this.placa +
        "\nAno: " + this.ano +
        "\nCor: " + this.cor +
        "\nFabricante: " + this.fabricante;
    }   
}
