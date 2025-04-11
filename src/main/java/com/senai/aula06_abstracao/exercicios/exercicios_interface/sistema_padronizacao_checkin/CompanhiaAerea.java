package com.senai.aula06_abstracao.exercicios.exercicios_interface.sistema_padronizacao_checkin;

public class CompanhiaAerea implements CheckinFlySafe{
    @Override
    public void validarDoc(String documento) {
        if (documento != null || !documento.isEmpty()) {
            System.out.println("|Documento ["+documento+"] validado com sucesso.");
        }else {
            System.out.println("|Documento Inválido");
        }
    }
    @Override
    public void emitirCartaoEmbarque(String nome) {
        System.out.println("|Cartão de embarque emitido para o passageiro: "+nome);
    }
}
