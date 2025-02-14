package com.senai.aula02_colecoes.exemplos.pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Izabella", 18);
        Pessoa pessoa2 = new Pessoa("Pietra", 17);
        Pessoa pessoa3 = new Pessoa("Ana", 15);

        Pessoa[] matrizPessoas = new Pessoa[4];

        matrizPessoas[0] = pessoa1;
        matrizPessoas[1] = pessoa2;
        matrizPessoas[2] = pessoa3;

        for (Pessoa pessoa : matrizPessoas) {
            System.out.println(pessoa);
        }


        matrizPessoas[0].falar("Bom Dia!! ");
        matrizPessoas[3] = new Pessoa("Nicole", 20);
        System.out.println(matrizPessoas[3].nome);

        ArrayList lista = new ArrayList();

        lista.add(12);
        lista.add(true);
        lista.add("teste");
        lista.add(pessoa1);

        Pessoa pessoa = (Pessoa) lista.get(3);
        pessoa.falar("teste");

        ArrayList<Pessoa> listaPessoas = new ArrayList();

        listaPessoas.add(pessoa1);
        listaPessoas.add(new Pessoa("Luiza", 20));

        System.out.println("Tamanho da lista: "+listaPessoas.size());

        listar(listaPessoas);
        listaPessoas.remove(pessoa1);
        listar(listaPessoas);

    }

    public static void listar(ArrayList<Pessoa> lista){
        for (Pessoa pessoa : lista){
            System.out.println(pessoa);
        }
    }
}
