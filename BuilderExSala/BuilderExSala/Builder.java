public abstract class Builder {
    protected Carro carro;

    public Builder()
    {
        carro = new Carro();
    }

    public Carro getCarro(){
        return carro;
    }

    public abstract void buildTipo();
    public abstract void buildTransmissao();
    public abstract void buildBancos();
    public abstract void buildAcessorios();
    public abstract void buildSensor();
}
