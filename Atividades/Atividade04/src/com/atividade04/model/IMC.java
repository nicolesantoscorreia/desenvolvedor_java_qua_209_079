package com.atividade04.model;

public class IMC {
    private double peso;
    private double altura;

    public IMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }

    public String diagnostico(double imc) {
        return (imc < 18.5) ? "Você está abaixo do peso." 
        : (imc < 25) ? "Você está com o peso normal."
        : (imc < 30) ? "Você está com sobrepeso."
        : (imc < 35) ? "Você está com obesidade grau I."
        : (imc < 40) ? "Você está com obesidade grau II."
        : "Você está com obesidade grau III.";
    }
}
