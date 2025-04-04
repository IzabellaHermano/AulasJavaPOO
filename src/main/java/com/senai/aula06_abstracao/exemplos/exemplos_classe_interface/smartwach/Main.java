package com.senai.aula06_abstracao.exemplos.exemplos_classe_interface.smartwach;

public class Main {
    public static void main(String[] args) {
        SmartWach smartWach = new SmartWach();
        smartWach.infoDispositvos();
        smartWach.medirFrequenciaCardiaca();
        smartWach.contarPassos();
        smartWach.medirQualidadeSono();
    }
}
