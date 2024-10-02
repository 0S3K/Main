package Salgados_Teste;

import java.util.Scanner;

public class Main {
    public static void imprimeDados(Salgado obj) {
        if (obj != null) {
            System.out.println("Massa: " + obj.getMassa());
            System.out.println("Molho: " + obj.getMolho());
            System.out.println("Recheio: " + obj.getRecheio());
            System.out.println("Descrição: " + obj.descricao());
        } else {
            System.out.println("Salgado inválido.");
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean controle = true;

        while(controle) {
            System.out.println("Digite um tipo de salgado (Coxinha, Empada, Esfirra): ");
            String leitor = ler.nextLine();
            Salgado obj = Fabrica.getSalgados(leitor);
            imprimeDados(obj);

            System.out.println("Deseja sair? (sim/não): ");
            leitor = ler.nextLine();
            if (leitor.equalsIgnoreCase("s")) {
                controle = false;
                
            }

            if(leitor.equalsIgnoreCase("n"))
                controle = true;
        }

    }
}
