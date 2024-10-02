package modelos;

import fabricas.SalgadoIngredientesFactory;

public class Coxinha extends Salgado {
    public Coxinha(SalgadoIngredientesFactory ingredientes) {
        super(ingredientes.criarMassa(), ingredientes.criarMolho(), ingredientes.criarRecheio());
    }

    @Override
    public String descricao() {
        return "Coxinha com massa " + getMassa() + ", molho " + getMolho() + " e recheio " + getRecheio();
    }
}

