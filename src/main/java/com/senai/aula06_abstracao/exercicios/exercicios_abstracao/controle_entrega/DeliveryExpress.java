package com.senai.aula06_abstracao.exercicios.exercicios_abstracao.controle_entrega;

public abstract class DeliveryExpress {
    protected double velocidadeAtual;
    protected int capacidadeMaxCarga;
    protected double distanciaParaDestino;

    public DeliveryExpress(double velocidadeAtual, int capacidadeMaxCarga, double distanciaParaDestino) {
        this.velocidadeAtual = velocidadeAtual;
        this.capacidadeMaxCarga = capacidadeMaxCarga;
        this.distanciaParaDestino = distanciaParaDestino;
    }

    public abstract double calcularTempoEstimado();

    public void exibirDetalhes() {
        System.out.println("|Velocidade Atual: " + velocidadeAtual + "KM");
        System.out.println("|Capacidade Máxima de Carga: " + capacidadeMaxCarga + " Pedidos");
        System.out.println("|Distância para o Destino: " + distanciaParaDestino + "KM");
    }
}
