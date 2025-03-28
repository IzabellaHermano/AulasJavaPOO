package com.senai.aula04_heranca.exercicios.sistema_gestao_pedidos;

public class Pedido {
    private int numPedido;
    private double valorTotalPedido;

    public Pedido(int numPedido, double valorTotalPedido) {
        this.numPedido = numPedido;
        this.valorTotalPedido = valorTotalPedido;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public double getValorTotalPedido() {
        return valorTotalPedido;
    }
    public void exibirDadosPedido(){
        System.out.printf("\nNúmero do Pedido:%d\nValor do Pedido:R$%.2f", numPedido,valorTotalPedido);
    }
}
