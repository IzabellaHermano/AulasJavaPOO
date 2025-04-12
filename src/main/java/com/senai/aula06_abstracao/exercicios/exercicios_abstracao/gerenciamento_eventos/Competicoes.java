package com.senai.aula06_abstracao.exercicios.exercicios_abstracao.gerenciamento_eventos;

public class Competicoes extends Eventos{
    @Override
    public void iniciarEvento() {
        validarIntegridade();
        System.out.println("Iniciando Competição...");
    }

    @Override
    public void finalizarEvento() {
        System.out.println("Finalizando Competição...");
    }

    @Override
    public void premiarParticipantes() {
        System.out.println("Premiando vencedores da Competição com: Medalhas de Ouro");
    }
}
