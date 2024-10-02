/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transformers.modelos;

/**
 *
 * @author Japajuke
 */
public class Leader extends Autobot{
        private String nome;

    public Leader(String nome) {
        this.nome = nome;
    }

    @Override
    public void printCardAutobot() {
        System.out.println("Nome: " + this.nome);
        if(nome.equals("Optimus"))
            System.out.println(">> AUTOBOT LEADER:");
        else
            System.out.println(">> AUTOBOT REBEL/DECEPTICON:");
        System.out.println("\tAtaque: 3\n" +
                           "\tDefesa: 7\n" +
                           "\tVida: 10\n" +
                           "\tEspecialidade: Estrategista de Gerra.\n");
    }
        
  
}
