public class CarroImportado extends Builder{

    @Override
    public void buildAcessorios() {
        carro.setAcessorio("Insulfilm e Friso Lateral");
    }

    @Override
    public void buildBancos() {
       carro.setBancos("Couro");
    }

    @Override
    public void buildSensor() {
        carro.setSensor("Estacionamento");
    }

    @Override
    public void buildTipo() {
        carro.setTipo("Importado");
    }

    @Override
    public void buildTransmissao() {
        carro.setTransmissao("Automatica");
    }
    
}
