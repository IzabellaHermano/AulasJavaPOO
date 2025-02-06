package com.senai.aula01_introducao_poo.exemplos.pessoa;

public class Endereco {
    String nomeRua;
    String bairro;
    String cidade;
    String estado;
    int cep;
    int numCasa;

    public Endereco(String nomeRua, String bairro, String cidade, String estado, int cep, int numCasa) {
        this.nomeRua = nomeRua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.numCasa = numCasa;
    }

    @Override
    public String toString() {
        return "Rua "+ this.nomeRua + ", "+this.bairro + ", "+ this.cidade + ", "+ this.estado+ ", "+this.cep;
    }
}
