/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comp;

import interfaces.thing;

/**
 *
 * @author Andrew
 */
public class thingab implements interfaces.thing{
    private final thing t;

    public thingab(thing t) {
        this.t = t;
    }
    
    
    
    @Override
    public void shout(String message) {
        System.out.println(message);
    }

  
    
}
