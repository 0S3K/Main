// Implementação concreta da fábrica
class Fabrica extends FabricaFastfood {
    @Override
    public Fastfood criarItem(String tipo) {
        switch (tipo) {
            case "PortuguesaPan":
                return new Pizza("pan", "portuguesa", 30.00f);
            case "BovinoMaioneseBrioche":
                return new Sanduiche("bovino", "maionese", "brioche", 40.00f);
            default:
                System.out.println("Erro: Tipo desconhecido.");
                return null;
        }
    }
}