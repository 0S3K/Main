public class CarroEsportivo extends Builder{

    @Override
    public void buildAcessorios() {
        carro.setAcessorio("null");
    }

    @Override
    public void buildBancos() {
       carro.setBancos("Tecido");
    }

    @Override
    public void buildSensor() {
        carro.setSensor(null);
    }

    @Override
    public void buildTipo() {
        carro.setTipo("Popular");
    }

    @Override
    public void buildTransmissao() {
        carro.setTransmissao("Manual");
    }
    
}
