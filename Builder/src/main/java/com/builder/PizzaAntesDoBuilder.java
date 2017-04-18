package com.builder;

public class PizzaAntesDoBuilder {
        private final String nome;
        private final TipoDeMolho molho;
        private final String recheio;
        private final boolean comBorda;
        private boolean comAzeitonasPretas;
        private boolean comRequeijao;
        private boolean comCebola;

        public PizzaAntesDoBuilder(String nome, TipoDeMolho molho, String recheio, boolean comBorda, boolean comAzeitonasPretas,
                     boolean comRequeijao, boolean comCebola) {

            this.nome = nome;
            this.molho = molho;
            this.recheio = recheio;
            this.comBorda = comBorda;

            if(comAzeitonasPretas){
                this.colocarAzeitonasPretas();
            }else if(comRequeijao){
                this.colocarRequeijao();
            }else if(comCebola){
                this.colocarCebola();
            }
        }

        private void colocarAzeitonasPretas() {
            this.comAzeitonasPretas = true;
        }

        private void colocarRequeijao() {
            this.comRequeijao = true;
        }

        private void colocarCebola() {
            this.comCebola = true;
        }

        public String getNome() {
            return nome;
        }


}
