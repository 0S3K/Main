package modelos;

public abstract class Salgado {
    private String massa;
    private String molho;
    private String recheio;

    public Salgado(String massa, String molho, String recheio) {
        this.massa = massa;
        this.molho = molho;
        this.recheio = recheio;
    }

    public String getMassa() {
        return massa;
    }

    public String getMolho() {
        return molho;
    }

    public String getRecheio() {
        return recheio;
    }

    public abstract String descricao();
}
