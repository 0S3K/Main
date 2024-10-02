// Superclasse abstrata Fastfood
abstract class Fastfood implements Cloneable {
    protected float preco;

    public Fastfood(float preco) {
        this.preco = preco;
    }

    // Método abstrato para produção
    public abstract Fastfood produz();

    // Método de clonagem padrão
    @Override
    public Fastfood clone() {
        try {
            return (Fastfood) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Preço: R$ " + preco;
    }
}