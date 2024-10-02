// Classe Main para teste
public class Main {
    public static void main(String[] args) {
        Fastfood pizza1 = Fabrica.crieItem("PortuguesaPan");
        Fastfood padrao1 = new Pizza("fina", "calabresa", 50.00f);
        Fastfood pizza2 = Fabrica.cloneItem(padrao1);
        System.out.println(pizza1);
        System.out.println(pizza2);

        Fastfood sanduiche1 = Fabrica.crieItem("BovinoMaioneseBrioche");
        Fastfood padrao2 = new Sanduiche("frango", "especial", "australiano", 70.00f);
        Fastfood sanduiche2 = Fabrica.cloneItem(padrao2);
        System.out.println(sanduiche1);
        System.out.println(sanduiche2);
    }
}
