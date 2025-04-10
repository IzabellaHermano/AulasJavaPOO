package com.senai.aula05_polimorfismo.exercicios.sistema_reservas_hotel;

public class Reserva {
    private String nome;
    private int dias;

    public Reserva(String nome, int dias) {
        this.nome = nome;
        this.dias = dias;
    }

    public String getNome() {
        return nome;
    }

    public int getDias() {
        return dias;
    }
    public double custoTotal(){
        return 0.0;
    }
}
