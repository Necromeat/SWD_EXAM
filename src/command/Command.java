/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package command;

import interfaces.CommandInterface;

/**
 *
 * @author Andrew
 */
public class Command {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CommandInterface mc = new MacroCommandStartAndBuild();
        mc.execute();
    }
    
}
