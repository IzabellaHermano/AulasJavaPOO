package com.senai.aula06_abstracao.exercicios.exercicios_interface.sistema_padronizacao_checkin;

public class Main {
    public static void main(String[] args) {
        CheckinFlySafe.exibirMsgBoasVindas();
        CompanhiaAerea companhiaAerea = new CompanhiaAerea();
        companhiaAerea.exibirMsgSeguranca();
        companhiaAerea.validarDoc("CPF: 222.222.222-22");
        companhiaAerea.emitirCartaoEmbarque("Izabella Carolina Hermano Alves");
        System.out.println("|Peso Máximo Permitido para Voos Nacionais: " + CheckinFlySafe.PESO_BAGAGEM_NACIONAL + "KG");
        System.out.println("|Peso Máximo Permitido para Voos Internacionais: " + CheckinFlySafe.PESO_BAGAGEM_INTERNACIONAL + "KG");
    }
}
