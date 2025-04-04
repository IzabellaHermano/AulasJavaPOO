package com.senai.aula06_abstracao.exemplos.exemplos_classe_interface.veiculo;

public interface Veiculo {
    void acelerrar ();
    default void buzinar (){
        System.out.println("BI BIII");
    }
}
