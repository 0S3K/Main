public class Main {
        public static void CompararCarro(Builder builder)
        {
            Director director= new Director(builder);
            director.ConstruirCarro();
            System.out.println(director.getProdutoCarro());
            System.out.println("********************************");
        }
        public static void main(String[] args) {
            CompararCarro(new CarroEsportivo());
            CompararCarro(new CarroImportado());
            CompararCarro(new CarroPopular());
        }
}
