package com.senai.aula05_polimorfismo.exercicios.sistema_monitoramento_sensores;

public class SensorTemperatura extends Sensor{
    double valorTemp;

    public SensorTemperatura(double valorTemp) {
        this.valorTemp = valorTemp;
    }

    @Override
    public void valor() {
        System.out.printf("\nSensor de Temperatura Ligado...\nTemperatura Detectada:%.1f°F",valorTemp);
    }
}
