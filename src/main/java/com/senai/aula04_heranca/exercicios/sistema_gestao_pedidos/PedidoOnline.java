package com.senai.aula04_heranca.exercicios.sistema_gestao_pedidos;

public class PedidoOnline extends  Pedido{
    private double taxaEntrega;

    public PedidoOnline(int numPedido, double valorTotalPedido, double taxaEntrega) {
        super(numPedido, valorTotalPedido);
        this.taxaEntrega = taxaEntrega;
    }
    public double calcularTotalPedido(){
        return  getValorTotalPedido()+taxaEntrega;
    }

    @Override
    public void exibirDadosPedido() {
        System.out.printf("\nNúmero do Pedido:%d\nValor do Pedido:R$%.2f\nTaxa de Entrega:R$%.2f\nValor Total do Pedido:R$%.2f\n", getNumPedido(),getValorTotalPedido(),taxaEntrega,calcularTotalPedido());
    }
}
