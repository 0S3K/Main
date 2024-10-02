// Simple Factory Method
class Fabrica {
    public static Fastfood crieItem(String tipo) {
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

    public static Fastfood cloneItem(Fastfood item) {
        return item.clone();
    }
}