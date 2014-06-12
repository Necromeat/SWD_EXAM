/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package command;

import factory.MainFactory;

/**
 *
 * @author Andrew
 */
public class MacroCommandStartAndBuild implements interfaces.CommandInterface{
    private MainFactory m = new MainFactory();

    @Override
    public void execute() {
        m.execute();
    }
    
}
