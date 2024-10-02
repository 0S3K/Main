/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototype1.Models;

/**
 *
 * @author Japajuke
 */
public class Losango extends Figura {
    public Losango()
    {
        tipo="Losango";
        area=60;
    }

    @Override
    public void desenhar() {
        System.out.println("DESENHANDO UM LOSANGO.");
    }
    
}
