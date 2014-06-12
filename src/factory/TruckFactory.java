/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;

import java.util.Random;
import model.Vehicle;

/**
 *
 * @author Andrew
 */
public class TruckFactory implements  interfaces.CommandInterface{
     private Vehicle v = null;
    
   private void buildAVan(){
       Random ran = new Random();
       v = new Vehicle("Truck",ran.nextInt(20));
       System.out.println("Truck built: "+ v.toString());
    }
         
   
    @Override
    public String toString() {
        return "CarFactory{" + "v=" + v + '}';
    }

    @Override
    public void execute() {
        buildAVan();
    }
    
    public Vehicle getV(){
       Random ran = new Random();
       Vehicle v1 = new Vehicle("Gen",ran.nextInt(20));
        return v1;
    }

    
}
