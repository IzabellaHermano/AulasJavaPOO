package com.senai.aula05_polimorfismo.exercicios.sistema_monitoramento_sensores;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ativando Sensores...");
        testeSensores(new SensorTemperatura(77.3));
        testeSensores(new SensorUmidade(12));
    }
    private static void testeSensores(Sensor sensor){
        sensor.valor();
    }
}
