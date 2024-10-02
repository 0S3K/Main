package Salgados_Teste;

public class Fabrica {
    public enum Salgados { COXINHA, EMPADA, ESFIRRA; }

    public static Salgado getSalgados(String tipoSalgados) {
        try {
            Salgados tipoEscolha = Salgados.valueOf(tipoSalgados.toUpperCase());

            switch(tipoEscolha) {
                case COXINHA:
                    return new Coxinha("Fina", "Pequi", "Frango", "Batata Palha");
                case EMPADA:
                    return new Empada("Podre", "Tomate", "Calabresa", "Prato Descartável");
                case ESFIRRA:
                    return new Esfirra("Crepioca", "Camarao", "Peixe", "Caixa");
                default:
                    return null;   
            }
        } catch (Exception e) {
            System.out.println("\nTipo de salgado não encontrado: " + tipoSalgados);
            return null;
        }
    }
}
