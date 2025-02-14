package com.senai.aula02_colecoes.exemplos.pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Izabella", 18);
        Pessoa pessoa2 = new Pessoa("Pietra", 20);
        Pessoa pessoa3 = new Pessoa("Ana", 10);

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

        listaPessoas.set(0,pessoa2);
        listar(listaPessoas);

        listaPessoas.add(0,pessoa3);
        listar(listaPessoas);

        System.out.println("-----------teste------------");
        listaPessoas.forEach(System.out::println);
        List<Pessoa> listaFiltrada = listaPessoas.stream().filter(p -> p.idade >=10).toList();
        System.out.println("--------------lista filtrada----------------------");
        listaFiltrada.forEach(System.out::println);

        listaPessoas.add(new Pessoa("Carolina", 24));

        listaFiltrada = listaPessoas.stream().filter(p ->p.nome.toLowerCase().contains("na")).toList();
        System.out.println("--------------teste-----------------");
        listaFiltrada.forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Preencha os dados a seguir: ");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        listaPessoas.add(new Pessoa(nome,idade));
        listaPessoas.forEach(System.out::println);

    }

    public static void listar(ArrayList<Pessoa> lista){
        for (Pessoa pessoa : lista){
            System.out.println(pessoa);
        }
    }
}
