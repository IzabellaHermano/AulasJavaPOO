package com.senai.aula04_heranca.exercicios.sistema_gestao_pedidos;

public class PedidoPresencial extends Pedido{
    private double desconto;

    public PedidoPresencial(int numPedido, double valorTotalPedido, double desconto) {
        super(numPedido, valorTotalPedido);
        this.desconto = desconto;
    }
    public double calcularTotalAVista(){
        return  getValorTotalPedido()*(1-desconto);
    }
    @Override
    public void exibirDadosPedido() {
        System.out.printf("\nNúmero do Pedido:%d\nValor do Pedido:R$%.2f\nValor do Pedido a Vista:R$%.2f\n", getNumPedido(),getValorTotalPedido(), calcularTotalAVista());

    }
}
