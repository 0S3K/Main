public class Main {
    public static void main(String[] args) {
        Pneu pneuCarro = new Pneu("Firestone", 16);

        Carro carro = new Carro();
        carro.pneus.add(pneuCarro);  
        for (int i = 0; i < 3; i++) {
            carro.pneus.add(pneuCarro.clone());
        }

        Pneu pneuCaminhao = new Pneu("Michelin", 30);

        Caminhao caminhao = new Caminhao();
        caminhao.pneus.add(pneuCaminhao);
        for (int i = 0; i < 5; i++) {
            caminhao.pneus.add(pneuCaminhao.clone()); 
        }

        System.out.println(carro);
        System.out.println(caminhao);
    }
}
