package com.senai.aula06_abstracao.exercicios.exercicios_interface.sistema_padronizacao_checkin;

public interface CheckinFlySafe {
    void validarDoc(String documento);

    void emitirCartaoEmbarque(String nome);

    default void exibirMsgSeguranca() {
        System.out.println("Check-in Realizado com Sucesso pela FlySafe");
    }

    int PESO_BAGAGEM_NACIONAL = 23;
    int PESO_BAGAGEM_INTERNACIONAL = 32;

    static void exibirMsgBoasVindas() {
        System.out.println("Bem-Vindo a Companhia Aerea FlySafe!");
    }
}
