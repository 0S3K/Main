/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transformers;

import com.mycompany.transformers.modelos.Autobot;
import factory.LeaderFactory;

/**
 *
 * @author Japajuke
 */
public class Transformers {

    public static void main(String[] args) {
       
          System.out.println("Autobot 1:");
          LeaderFactory fab1 = LeaderFactory.getInstance();
          System.out.println("Hashcode: " + fab1.hashCode());
          Autobot robo=fab1.createAutobot("Optimus");
          robo.AssembleAutobot();
          robo.printCardAutobot();
          
          Autobot robo2=fab1.createAutobot("Nemesis");
          robo2.AssembleAutobot();
          robo2.printCardAutobot();
          
          LeaderFactory fab2 = LeaderFactory.getInstance();
          System.out.println("Hashcode: " + fab1.hashCode());
          System.out.println("Hashcode: " + fab2.hashCode());

          //Autobot autobot2=fab1.createAutobot();
         // autobot2.AssembleAutobot();
          //autobot2.printCardAutobot();
          
//          System.out.println("Autobot 2:");
//          LeaderFactory fab2 = LeaderFactory.getInstance("Nemesis");
//          Autobot autobot2=fab2.createAutobot("Nemesis");
//          autobot2.AssembleAutobot();
//          autobot2.printCardAutobot();
//          System.out.println("Hashcode: " + fab2.hashCode());
    }
}
