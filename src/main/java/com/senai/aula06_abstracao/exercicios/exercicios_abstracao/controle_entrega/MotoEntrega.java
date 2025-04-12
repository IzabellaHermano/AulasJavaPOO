package com.senai.aula06_abstracao.exercicios.exercicios_abstracao.controle_entrega;

public class MotoEntrega extends DeliveryExpress{
    public MotoEntrega(double velocidadeAtual, int capacidadeMaxCarga, double distanciaParaDestino) {
        super(velocidadeAtual, capacidadeMaxCarga, distanciaParaDestino);
    }
    @Override
    public double calcularTempoEstimado() {
        double tempoBase = distanciaParaDestino /velocidadeAtual;
        return tempoBase + 0.5;

    }
}
