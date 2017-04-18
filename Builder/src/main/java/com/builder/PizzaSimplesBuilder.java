package com.builder;

import java.util.ArrayList;
import java.util.List;

public class PizzaSimplesBuilder implements PizzaBuilder {
    private String nome;
    private TipoDeMolho tipoDeMolho;
    private String recheio;

    @Override
    public PizzaBuilder chamada(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public PizzaBuilder comTipoDeMolho(TipoDeMolho tipoDeMolho) {
        this.tipoDeMolho = tipoDeMolho;
        return this;
    }

    @Override
    public PizzaBuilder recheadaCom(String recheio) {
        this.recheio = recheio;
        return this;
    }


    private boolean semBorda() {
        return false;
    }

    private List<Adicional> semAdicionais() {
        return new ArrayList<Adicional>();
    }

    @Override
    public Pizza criar() {
        return new Pizza(nome,tipoDeMolho,recheio,semBorda(),semAdicionais());
    }
}
