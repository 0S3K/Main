public class Director {
    private Builder builder;
    
    public Director(Builder builder)
    {
        this.builder = builder;
    }

    public void ConstruirCarro()
    {
        builder.buildAcessorios();
        builder.buildBancos();
        builder.buildSensor();
        builder.buildTipo();
        builder.buildTransmissao();
    }

    public Carro getProdutoCarro()
    {
        return builder.getCarro();
    }
}
