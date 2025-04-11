package com.senai.aula05_polimorfismo.exercicios.sistema_beneficio_funcionarios;

public class ValeAlimentacao extends Beneficio {
        protected double desconto;
        public ValeAlimentacao(String nome, double desconto) {
            super(nome);
            this.desconto = desconto;
        }
        @Override
        public double calcularDesconto(double salarioBase) {
            return salarioBase * (desconto / 100);
        }
}
