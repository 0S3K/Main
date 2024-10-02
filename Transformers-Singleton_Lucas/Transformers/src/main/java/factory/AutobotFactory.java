/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package factory;

import com.mycompany.transformers.modelos.Autobot;

/**
 *
 * @author Japajuke
 */
public abstract class AutobotFactory {
    //public Autobot summonAutobot(String robot);
    public abstract Autobot createAutobot(String robot);
}
