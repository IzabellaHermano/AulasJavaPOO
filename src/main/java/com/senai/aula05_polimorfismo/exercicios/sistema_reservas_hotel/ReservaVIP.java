package com.senai.aula05_polimorfismo.exercicios.sistema_reservas_hotel;

public class ReservaVIP extends  Reserva{
    private double custoDia;
    private double taxaAdd;

    public ReservaVIP(String nome, int dias, double custoDia, double taxaAdd) {
        super(nome, dias);
        this.custoDia = custoDia;
        this.taxaAdd = taxaAdd;
    }

    @Override
    public double custoTotal() {
        return (getDias()*custoDia)+taxaAdd;
    }
}
