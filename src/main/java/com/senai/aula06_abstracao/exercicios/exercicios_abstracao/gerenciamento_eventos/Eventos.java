package com.senai.aula06_abstracao.exercicios.exercicios_abstracao.gerenciamento_eventos;

public abstract class Eventos {

    public abstract void iniciarEvento();

    public abstract void finalizarEvento();

    public abstract void premiarParticipantes();


    protected void validarIntegridade() {
        System.out.println("Validando integridade do evento...");
    }

    public void registrarLog() {
        System.out.println("Registrando evento no sistema...");
    }
}

