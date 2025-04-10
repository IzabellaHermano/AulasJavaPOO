package com.senai.aula05_polimorfismo.exercicios.sistema_de_relatorios;

public class RelatorioCSV extends Relatorios{
    @Override
    void gerarRelatorio() {
        System.out.println("Gerando Relatório em CSV...");
        System.out.println("..........");
        System.out.println("Relatório em CSV gerado.");
    }
}
