package com.senai.aula06_abstracao.exemplos.exemplos_classe_interface.smartwach;
//Multipla Herança
public class SmartWach implements SensorCardiaco,SensorPassos, SensorSono{
    @Override
    public void medirFrequenciaCardiaca() {
        System.out.println("Medição Cardiaca: 88pm");
    }

    @Override
    public void contarPassos() {
        System.out.println("Passos Hoje: 3000 passos");
    }

    @Override
    public void medirQualidadeSono() {
        System.out.println("Qualidade de Sono: 6 horas dormidas (profundo)");
    }
    public void infoDispositvos(){
        System.out.println("_________________________Dispositivos Conectados_________________________");
    }
}
