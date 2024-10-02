import fabricas.SalgadosFactory;

public class Main {
    public static void main(String[] args) {
        SalgadosFactory fabrica = new SalgadosFactory();
        fabrica.assarSalgado("Coxinha", "Goias");
        System.out.println(fabrica.descricao());
        System.out.println();
        fabrica.assarSalgado("Coxinha", "Ceara");
        System.out.println(fabrica.descricao());
    }
}
