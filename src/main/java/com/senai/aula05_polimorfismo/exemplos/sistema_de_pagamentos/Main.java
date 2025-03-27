package com.senai.aula05_polimorfismo.exemplos.sistema_de_pagamentos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pagamentos> listaPagamentos = new ArrayList<>();

        listaPagamentos.add(new CLT("Ana", 1200.00));
        listaPagamentos.add(new Freelancers("Izabella", 9000.00));
        listaPagamentos.add(new PJ("Andre",4,300));

        listaPagamentos.forEach(pagamentos ->
                System.out.printf("%s recebe R$%.2f\n", pagamentos.getNome(),pagamentos.calcularPagamento()));

    }
}
