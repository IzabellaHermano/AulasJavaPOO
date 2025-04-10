package com.senai.aula04_heranca.exercicios.sistema_atendimento_medico;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Paciente> pacientes = new ArrayList<>();

        PacienteParticular paciente01 = new PacienteParticular("Ana", 17, 100.0);
        PacienteConvenio paciente02 = new PacienteConvenio("Izabella", 18,20.0);

        pacientes.add(paciente01);
        pacientes.add(paciente02);

        for(Paciente paciente: pacientes){
            System.out.println("DADOS DOS PACIENTES:\n"+paciente);

        }

    }
}
