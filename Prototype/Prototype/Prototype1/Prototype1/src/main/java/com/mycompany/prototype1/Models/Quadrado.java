/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototype1.Models;

/**
 *
 * @author Japajuke
 */
public class Quadrado extends Figura {
    public Quadrado()
    {
        tipo="Quadrado";
        area=10;
    }

    @Override
    public void desenhar() {
            System.out.println("DESENHANDO UM QUADRADO.");
    }
    
}
