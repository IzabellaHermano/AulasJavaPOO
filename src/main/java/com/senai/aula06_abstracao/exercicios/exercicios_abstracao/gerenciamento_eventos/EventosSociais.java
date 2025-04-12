package com.senai.aula06_abstracao.exercicios.exercicios_abstracao.gerenciamento_eventos;

public class EventosSociais extends Eventos{
    @Override
    public void iniciarEvento() {
        validarIntegridade();
        System.out.println("Iniciando Evento Social...");
    }

    @Override
    public void finalizarEvento() {
        System.out.println("Finalizando Evento Social...");
    }

    @Override
    public void premiarParticipantes() {
        System.out.println("Premiando participantes do Evento Social com: R$10.000,00");
    }
}
