package com.senai.aula05_polimorfismo.exercicios.sistema_de_relatorios;

public class RelatorioJSON extends Relatorios{
    @Override
    void gerarRelatorio() {
        System.out.println("Gerando Relatório em JSON...");
        System.out.println("..........");
        System.out.println("Relatório em JSON gerado.");
    }
}
