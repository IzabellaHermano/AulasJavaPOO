package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Professor [] professoresExatas ={
                new Professor("Alice", 4500.00, "Matemática"),
                new Professor("GianLucca", 4500,"Física"),
                new Professor("Maria", 4500.00,"Química"),
                new Professor("Rafael",4500.00, "Biologia")
        };
        Professor [] professoresHumanas = {
                new Professor("Arthur", 4500.00, "História"),
                new Professor("Giulia", 4500,"Geografia"),
                new Professor("Marcos", 4500.00,"Filosofia"),
                new Professor("Rayane",4500.00, "Sociologia")
        };
        Professor [] professoresLinguagens = {
                new Professor("Joana",4500.00,"Português"),
                new Professor("Ricardo", 4500.00,"Inglês")

        };


    }
}
