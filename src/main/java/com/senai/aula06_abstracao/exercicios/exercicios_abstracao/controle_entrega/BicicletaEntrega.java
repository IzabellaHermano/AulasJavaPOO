package com.senai.aula06_abstracao.exercicios.exercicios_abstracao.controle_entrega;

public class BicicletaEntrega extends DeliveryExpress {
    public BicicletaEntrega(double velocidadeAtual, int capacidadeMaxCarga, double distanciaParaDestino) {
        super(velocidadeAtual, capacidadeMaxCarga, distanciaParaDestino);
    }

    @Override
    public double calcularTempoEstimado() {
        double velocidadeMaxima = 20.0;
        return distanciaParaDestino / velocidadeMaxima;
    }
}
