package com.senai.aula05_polimorfismo.exercicios.sistema_de_relatorios;

public class RelatorioPDF extends Relatorios{
    @Override
    void gerarRelatorio() {
        System.out.println("Gerando Relatório em PDF...");
        System.out.println("..........");
        System.out.println("Relatório em PDF gerado.");
    }
}
