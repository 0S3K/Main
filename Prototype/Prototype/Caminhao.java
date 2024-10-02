public class Caminhao extends Veiculo {

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Caminhão com pneus:\n");
        for (Pneu pneu : pneus) {
            sb.append(pneu.toString()).append("\n");
        }
        return sb.toString();
    }
}
