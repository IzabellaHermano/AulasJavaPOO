package com.senai.aula05_polimorfismo.exercicios.sistema_monitoramento_sensores;

public class SensorUmidade extends Sensor{
    double valorUmidade;

    public SensorUmidade(double valorUmidade) {
        this.valorUmidade = valorUmidade;
    }

    @Override
    public void valor() {
        System.out.printf("\nSensor de Umidade Ligado...\nUmidade Detectada:%.1f%%",valorUmidade);
    }
}
