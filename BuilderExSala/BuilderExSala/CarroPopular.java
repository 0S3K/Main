public class CarroPopular extends Builder{

    @Override
    public void buildAcessorios() {
        carro.setAcessorio("Aerofolio");
    }

    @Override
    public void buildBancos() {
       carro.setBancos("Couro");
    }

    @Override
    public void buildSensor() {
        carro.setSensor(null);
    }

    @Override
    public void buildTipo() {
        carro.setTipo("Esportivo");
    }

    @Override
    public void buildTransmissao() {
        carro.setTransmissao("Paddle Shift");
    }
    
}
