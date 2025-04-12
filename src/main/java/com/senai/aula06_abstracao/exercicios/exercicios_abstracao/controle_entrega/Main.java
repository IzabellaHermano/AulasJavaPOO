package com.senai.aula06_abstracao.exercicios.exercicios_abstracao.controle_entrega;

public class Main {
    public static void main(String[] args) {
        System.out.println("IMFORMAÇÕES DE BICICLETA DE ENTREGA:");
        entrega(new BicicletaEntrega(20,3,50));
        System.out.println("IMFORMAÇÕES DE MOTO DE ENTREGA:");
        entrega(new MotoEntrega(45,6,80));

    }
    public static void entrega(DeliveryExpress deliveryExpress){
        deliveryExpress.exibirDetalhes();
        System.out.printf("|Tempo Estimado: %.2fmin\n\n", deliveryExpress.calcularTempoEstimado());
    }
}
