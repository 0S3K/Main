package Salgados_Teste;
public class Empada extends Salgado{
    private String prato;

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }

    public Empada(String massa, String molho, String recheio, String prato) {
    	super(massa,molho,recheio);
    	this.prato = prato;
    }
    
    public String descricao() {
        return "Empada de " + getMassa() + " com " + getMolho() + " e recheio de " + getRecheio() + " no prato " + getPrato();
    }
}
