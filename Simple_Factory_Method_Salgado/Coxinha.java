package Salgados_Teste;

public class Coxinha extends Salgado{
	private String acompanhamento;

    public String getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    public Coxinha(String massa, String molho, String recheio, String acompanhamento) {
    	super(massa,molho,recheio);
    	this.acompanhamento = acompanhamento;
    }

    public String descricao() {
        return "Coxinha de " + getMassa() + " com " + getMolho() + " e recheio de " + getRecheio() + " com " + getAcompanhamento();
    }   
}
