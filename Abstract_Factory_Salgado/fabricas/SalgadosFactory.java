package fabricas;

import modelos.Coxinha;
import modelos.Empada;
import modelos.Salgado;

public class SalgadosFactory {
    
    private SalgadoIngredientesFactory ingredientes;
    private Salgado salgadinho;

    public void assarSalgado(String tipo, String regiao) {
        if (tipo.equalsIgnoreCase("Coxinha")) {
            ingredientes = getIngredientes(regiao);
            salgadinho = new Coxinha(ingredientes);
        } else {
            ingredientes = getIngredientes(regiao);
            salgadinho = new Empada(ingredientes);
        }
    }

    public SalgadoIngredientesFactory getIngredientes(String regiao) {
        if (regiao.equalsIgnoreCase("Goias")) {
            return  new GoiasCoxinhaIngredientesFactory();
        } else {
            return new CearaCoxinhaIngredientesFactory();
        }
    } 

    public Salgado getSalgadinho() {
        return salgadinho;
    }

    public String descricao() {
        return "\nMassa:" + getSalgadinho().getMassa() + "\nMolho:" + getSalgadinho().getMolho() + "\nRecheio:" + getSalgadinho().getMolho();
    }

}

