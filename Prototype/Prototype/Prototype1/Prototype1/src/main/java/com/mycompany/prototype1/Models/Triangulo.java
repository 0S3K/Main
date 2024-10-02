/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototype1.Models;

/**
 *
 * @author Japajuke
 */
public class Triangulo extends Figura {
    public Triangulo()
    {
        tipo="Triangulo";
        area=20;
    }

    @Override
    public void desenhar() {
        System.out.println("DESENHANDO UM TRIANGULO.");
    }
    
}
