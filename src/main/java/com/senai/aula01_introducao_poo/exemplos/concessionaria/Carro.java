package com.senai.aula01_introducao_poo.exemplos.concessionaria;

public class Carro {

    String marca;
    String modelo;
    String cor;
    int anoFabricacao;
    int km;
    int valor;

    public Carro(String marca, String modelo, String cor, int anoFabricacao, int km, int valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.km = km;
        this.valor = valor;
    }

    public void testeDriver(){
        System.out.println("Vrumm! "+ modelo+ " sendo testado");

    }
    public void  comprar(String nomeCliente){
        System.out.println("Parabéns "+nomeCliente+"! \nSua compra foi realizada com sucesso!\nVocê comprou: "+marca+", "+ modelo+", "+ anoFabricacao);


    }

    @Override
    public String toString() {
        return "O carro "+this.modelo+", de cor "+this.cor+ ", da marca "+ this.marca +", do ano "+ this.anoFabricacao + ",com "+this.km +"km rodados, custa R$"+ this.valor;
    }
    public void tabelaFipe(int anoRef){

        int idadeCarro= anoRef -this.anoFabricacao;
        double valorFipe = valor;

        for (int i = 0; i < idadeCarro; i++){
            valorFipe -= valorFipe  * 0.02;
        }

        System.out.println("O carro %d esta custanto R$%f segundo a Tabela Fipe de 2025");



    }
}
