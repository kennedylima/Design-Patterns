package com.builder;


import java.util.List;

public class Pizza {
    private final String nome;
    private final TipoDeMolho molho;
    private final String recheio;
    private final boolean comBorda;
    private final List<Adicional> adicionais;


    public Pizza(String nome, TipoDeMolho molho, String recheio, boolean comBorda, List<Adicional> adicionais) {

        this.nome = nome;
        this.molho = molho;
        this.recheio = recheio;
        this.comBorda = comBorda;
        this.adicionais = adicionais;
    }

    public String getNome() {
        return nome;
    }

    public List<Adicional> getAdicionais() {
        return adicionais;
    }

    public boolean isBordaRecheada() {
        return comBorda;
    }
}
