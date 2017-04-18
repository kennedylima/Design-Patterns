package com.builder;

import java.util.ArrayList;
import java.util.List;

public class PizzaCustomizadaBuilder implements PizzaBuilder {
    private final List<Adicional> adicionais;
    private String nome;
    private TipoDeMolho tipoDeMolho;
    private String recheio;
    private boolean bordaRecheada;

    public PizzaCustomizadaBuilder() {
        this.adicionais = new ArrayList<Adicional>();
    }

    @Override
    public PizzaCustomizadaBuilder chamada(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public PizzaCustomizadaBuilder comTipoDeMolho(TipoDeMolho tipoDeMolho) {
        this.tipoDeMolho = tipoDeMolho;
        return this;
    }

    @Override
    public PizzaCustomizadaBuilder recheadaCom(String recheio) {
        this.recheio = recheio;
        return this;
    }

    public PizzaCustomizadaBuilder comBorda(){
        this.bordaRecheada = true;
        return this;
    }

    public PizzaCustomizadaBuilder semBorda(){
        this.bordaRecheada = false;
        return this;
    }

    public PizzaCustomizadaBuilder comAdicionalDe(Adicional adicional){
        this.adicionais.add(adicional);
        return this;
    }


    @Override
    public Pizza criar() {
        return new Pizza(nome,tipoDeMolho,recheio,bordaRecheada,adicionais);
    }
}
