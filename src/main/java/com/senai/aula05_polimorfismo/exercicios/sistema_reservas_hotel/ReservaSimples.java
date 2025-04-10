package com.senai.aula05_polimorfismo.exercicios.sistema_reservas_hotel;

public class ReservaSimples extends  Reserva {
    private double custoDia;

    public ReservaSimples(String nome, int dias, double custoDia) {
        super(nome, dias);
        this.custoDia = custoDia;
    }

    @Override
    public double custoTotal() {
        return getDias() * custoDia;
    }
}
