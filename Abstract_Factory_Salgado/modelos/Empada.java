package modelos;
import fabricas.SalgadoIngredientesFactory;

public class Empada extends Salgado {
    public Empada(SalgadoIngredientesFactory ingredientes) {
        super(ingredientes.criarMassa(), ingredientes.criarMolho(), ingredientes.criarRecheio());
    }

    @Override
    public String descricao() {
        return "Empada com massa " + getMassa() + ", molho " + getMolho() + " e recheio " + getRecheio();
    }
}
