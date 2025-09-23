package com.projetofinal.app.models;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PessoaDesaparecida implements Serializable {
    // Atributos
    private static final long serialVersionUID = 1L ; 

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPessoaDesaparecida;
    private String nome;
    private String dataNascimento;
    private String estado;
    private String cidade;
    private String bairro;
    private String genero;
    private String telefone;
    private String email;

    // Construtor
    public PessoaDesaparecida() {
    }

    // Getters e Setters
    public long getIdPessoaDesaparecida() {
        return this.idPessoaDesaparecida;
    }

    public void setIdPessoaDesaparecida(long idPessoaDesaparecida) {
        this.idPessoaDesaparecida = idPessoaDesaparecida;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }    
}
