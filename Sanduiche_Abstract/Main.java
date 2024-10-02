
// Classe Main para teste
public class Main {
    public static void main(String[] args) {
        FabricaFastfood fabrica = new Fabrica();

        Fastfood pizza1 = fabrica.criarItem("PortuguesaPan");
        Fastfood padrao1 = new Pizza("fina", "calabresa", 50.00f);
        Fastfood pizza2 = fabrica.cloneItem(padrao1);

        System.out.println(pizza1);
        System.out.println(pizza2);

        Fastfood sanduiche1 = fabrica.criarItem("BovinoMaioneseBrioche");
        Fastfood padrao2 = new Sanduiche("frango", "especial", "australiano", 70.00f);
        Fastfood sanduiche2 = fabrica.cloneItem(padrao2);

        System.out.println(sanduiche1);
        System.out.println(sanduiche2);
    }
}
