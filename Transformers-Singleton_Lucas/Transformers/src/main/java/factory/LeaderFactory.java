/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import com.mycompany.transformers.modelos.Autobot;
import com.mycompany.transformers.modelos.Leader;

/**
 *
 * @author Japajuke
 */
public class LeaderFactory extends AutobotFactory{
        private static LeaderFactory singleton=null;
        private Autobot roboAutobot;
        
        public static LeaderFactory getInstance()
        {
            if(singleton==null)
                singleton=new LeaderFactory();
            return singleton;
        }

        private LeaderFactory() {
          this.roboAutobot = null;
 
         }
    
        
   @Override
    public Autobot createAutobot(String robot) {
        if (robot.equals("Optimus"))
            return new Leader("Optimus");
        else if (robot.equals("Nemesis"))
            return new Leader("Nemesis");
        return null;
    }
    
}
