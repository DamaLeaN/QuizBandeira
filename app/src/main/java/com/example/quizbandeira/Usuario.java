package com.example.quizbandeira;

public class Usuario {

    public static String nome;
    public static int pontos;

    public static String getNome() {
        return nome;
    }

    public static int getPontos() {
        return pontos;
    }

    public static void setNome(String nome) {
        Usuario.nome = nome;
    }

    public static void setPontos(int pontos) {
        Usuario.pontos = pontos;
    }
}