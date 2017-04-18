package com.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PizzaTeste {

    /* Como a pizza era crianda antes de ser utilizado o padrão Builder

    @Test
    public void deve_criar_uma_pizza_calabresa(){
        String nome = "Calabresa";
        TipoDeMolho molho = TipoDeMolho.TOMATE;
        String recheio = "Calabresa";
        boolean comBorda = true;
        boolean comAzeitonasPretas = false;
        boolean comRequeijao = false;
        boolean comCebola = true;

        Pizza pizza = new Pizza(nome,molho,recheio,comBorda,comAzeitonasPretas,comRequeijao,comCebola);

        assertEquals(nome,pizza.getNome());
    }*/

    @Test
    public void deve_criar_uma_pizza_calabresa_com_builder(){
        Adicional bacon = new Adicional("Bacon");

        Pizza pizzaDeCalabresa =
                new PizzaCustomizadaBuilder().chamada("Calabresa").comTipoDeMolho(TipoDeMolho.TOMATE).comAdicionalDe(bacon).comBorda().criar();


        assertEquals(bacon,pizzaDeCalabresa.getAdicionais().get(0));
    }


    @Test
    public void deve_criar_uma_pizza_de_calabresa_simples(){
        Pizza pizzaDeCalabresaSimples =
                new PizzaSimplesBuilder().
                        chamada("Calabresa Simples").
                        comTipoDeMolho(TipoDeMolho.TOMATE).
                        recheadaCom("Calabresa").
                        criar();

        assertFalse(pizzaDeCalabresaSimples.isBordaRecheada());
        assertTrue(pizzaDeCalabresaSimples.getAdicionais().isEmpty());
    }
}
