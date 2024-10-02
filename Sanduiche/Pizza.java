// Classe Pizza
class Pizza extends Fastfood {
    private String massa;
    private String sabor;

    public Pizza(String massa, String sabor, float preco) {
        super(preco);
        this.massa = massa;
        this.sabor = sabor;
    }

    @Override
    public Fastfood produz() {
        return new Pizza("fina", "calabresa", 50.00f);
    }

    @Override
    public String toString() {
        return "Pizza [Massa: " + massa + ", Sabor: " + sabor + ", " + super.toString() + "]";
    }
}
