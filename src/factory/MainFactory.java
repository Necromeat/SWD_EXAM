/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;

import interfaces.CommandInterface;
import interfaces.FactoryInterface;
import model.Vehicle;

/**
 *
 * @author Andrew
 */
public class MainFactory implements CommandInterface, FactoryInterface{
private CarFactory c = new CarFactory();
private VanFactory v = new VanFactory();
private TruckFactory t = new TruckFactory();
    @Override
    public void execute() {
        System.out.println("Main factory here");
        System.out.println("About to batch build");
            c.execute();
            v.execute();
            t.execute();
    }

    @Override
    public Vehicle buildACar() { Vehicle v1 = c.getV(); return v1;
    }

    @Override
    public Vehicle buildATruck() { Vehicle v1 = t.getV(); return v1;}

    @Override
    public Vehicle buildAVan() { Vehicle v1 = v.getV();  return v1; }

 
    
}
