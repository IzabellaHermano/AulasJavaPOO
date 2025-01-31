package com.senai.aula01_introducao_poo.exemplo01.pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa01 = new Pessoa();
        pessoa01.nome = "Hermano";
        pessoa01.idade = 18;
        pessoa01.altura =1.70f;

        Endereco endereco01 = new Endereco();
        endereco01.nomeRua = "Marfim";
        endereco01.bairro = "Cidade Ademar";
        endereco01.cidade = "São Paulo";
        endereco01.estado = "SP";
        endereco01.cep = 87635144;
        endereco01.numCasa = 98;

        System.out.println(pessoa01.nome);
    }
}
