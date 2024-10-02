// Classe Sanduíche
class Sanduiche extends Fastfood {
    private String carne;
    private String molho;
    private String pao;

    public Sanduiche(String carne, String molho, String pao, float preco) {
        super(preco);
        this.carne = carne;
        this.molho = molho;
        this.pao = pao;
    }

    @Override
    public Fastfood produz() {
        return new Sanduiche("frango", "especial", "australiano", 70.00f);
    }

    @Override
    public String toString() {
        return "Sanduíche [Carne: " + carne + ", Molho: " + molho + ", Pão: " + pao + ", " + super.toString() + "]";
    }
}
