/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prototype1;

import com.mycompany.prototype1.Models.Figura;
import com.mycompany.prototype1.Models.Losango;
import com.mycompany.prototype1.Models.Quadrado;
import com.mycompany.prototype1.Models.Retangulo;
import com.mycompany.prototype1.Models.Triangulo;
import java.util.HashMap;

/**
 *
 * @author Japajuke
 */
public class Prototype1 {
    
    public static HashMap<String, Figura> geometria = new HashMap<String, Figura>();

    public static Figura getFigura(String id)
    {
        Figura fig = geometria.get(id);
        fig.desenhar();
        return (Figura) fig.clone();
    }
    
    public static void criarFiguras()
    {
        Quadrado quad = new Quadrado();
        quad.setId("1");
        geometria.put(quad.getId(),quad);
        
        Triangulo tri = new Triangulo();
        tri.setId("2");
        geometria.put(tri.getId(),tri);
        
        Losango los = new Losango();
        los.setId("3");
        geometria.put(los.getId(),los);
        
        Retangulo ret = new Retangulo();
        ret.setId("4");
        geometria.put(ret.getId(),ret);
    }
    
    
    public static void main(String[] args) {
        criarFiguras();
        
        Figura clone1 = getFigura("1");
        System.out.println("Clone 1     : " + clone1.getTipo());
        System.out.println("Area Clone 1: " + clone1.getArea());
        clone1.setArea(clone1.getArea()+5);
        geometria.put("5", clone1);
        System.out.println("Area Clonada: " + clone1.getArea());
        
        Figura clone2 = getFigura("2");
        System.out.println("Clone 2     : " + clone2.getTipo());
        System.out.println("Area Clone 2: " + clone2.getArea());
        
        Figura clone3 = getFigura("3");
        System.out.println("Clone 3     : " + clone3.getTipo());
        System.out.println("Area Clone 3: " + clone3.getArea());
        
        Figura clone4 = getFigura("4");
        System.out.println("Clone 4     : " + clone4.getTipo());
        System.out.println("Area Clone 4: " + clone4.getArea());
    
        Figura clone5 = getFigura("5");
        System.out.println("Clone 5     : " + clone5.getTipo());
        System.out.println("Area Clone 5: " + clone5.getArea());
    }
}
