package com.senai.aula06_abstracao.exercicios.exercicios_abstracao.gerenciamento_eventos;

public class DesafiosRelampagos extends Eventos{
    @Override
    public void iniciarEvento() {
        validarIntegridade();
        System.out.println("Iniciando Desafios Relâmpagos...");
    }

    @Override
    public void finalizarEvento() {
        System.out.println("Finalizando Desafios Relâmpagos...");
    }

    @Override
    public void premiarParticipantes() {
        System.out.println("Premiando vencedores do Desafios Relâmpagos com: Troféus");
    }
}
