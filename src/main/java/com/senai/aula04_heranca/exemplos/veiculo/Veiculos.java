package com.senai.aula04_heranca.exemplos.veiculo;
//classe pai
public class Veiculos {
    private String marca;
    private int ano;

    public Veiculos(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void exibirDetalhes(){

        System.out.print("Marca: "+marca+"\nAno: "+ano);
    }
}
