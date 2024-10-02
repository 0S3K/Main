package Salgados_Teste;
public class Esfirra extends Salgado{
    private String embalagem;

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String modelo) {
        this.embalagem = modelo;
    }

    public Esfirra(String massa, String molho, String recheio, String embalagem) {
        super(massa,molho,recheio);
        this.embalagem = embalagem;
    }

    @Override
    public String descricao() {
        return "Esfirra de " + getMassa() + " com " + getMolho() + " e recheio de " + getRecheio() + " na embalagem " + getEmbalagem();
    }
}
