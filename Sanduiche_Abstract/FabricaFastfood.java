// Classe abstrata para a fábrica
abstract class FabricaFastfood {
    // Método abstrato para criação de itens de Fastfood
    public abstract Fastfood criarItem(String tipo);

    // Método para clonar o item
    public Fastfood cloneItem(Fastfood item) {
        return item.clone();
    }
}