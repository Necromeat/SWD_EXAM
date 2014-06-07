/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer;

import interfaces.DrinkerInterface;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Andrew
 */
public class Bartender implements Observer{
    private String resp;
    
    @Override
    public void update(Observable o, Object arg) { if (arg instanceof String) {
            resp = (String) arg;
            if(arg.equals("more drink")){
                DrinkerInterface d = (DrinkerInterface)o;
                System.out.println(d.getDrinker());
                d.refill(10);
            }
        }
    }
    
}
