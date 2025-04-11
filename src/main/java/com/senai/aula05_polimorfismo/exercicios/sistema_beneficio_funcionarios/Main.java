package com.senai.aula05_polimorfismo.exercicios.sistema_beneficio_funcionarios;

public class Main {
    public static void main(String[] args) {
        double salarioBase = 3000;

        Beneficio valeAlimentacao = new ValeAlimentacao("Vale Alimentação", 5);
        Beneficio planoDeSaude = new PlanoDeSaude("Plano de Saúde", 300);
        Beneficio auxilioTransporte = new AuxilioTransporte("Auxílio Transporte", 150);

        double descontoTotal = valeAlimentacao.calcularDesconto(salarioBase)
                + planoDeSaude.calcularDesconto(salarioBase)
                + auxilioTransporte.calcularDesconto(salarioBase);
        double salarioFinal = salarioBase - descontoTotal;

        System.out.println("FOLHA DE PAGAMENTO:\n");
        System.out.println("|Salário Base: R$"+salarioBase);
        System.out.println("|Descontos Totais: R$"+descontoTotal);
        System.out.println("|Salário Final: R$"+salarioFinal);
    }
}
