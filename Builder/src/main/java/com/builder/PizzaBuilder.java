package com.builder;

public interface PizzaBuilder {
    PizzaBuilder chamada(String nome);

    PizzaBuilder comTipoDeMolho(TipoDeMolho tipoDeMolho);

    PizzaBuilder recheadaCom(String recheio);

    Pizza criar();
}
