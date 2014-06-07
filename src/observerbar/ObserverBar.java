/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observerbar;

import interfaces.DrinkerInterface;
import notifiers.FastDrinker;
import notifiers.SlowDrinker;
import observer.Bartender;

/**
 *
 * @author Andrew
 */
public class ObserverBar {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         FastDrinker a = new FastDrinker(10,200);
   SlowDrinker b = new SlowDrinker(10,200);
    Bartender c = new Bartender();
    
     a.addObserver(c);
     
     b.addObserver(c);
      Thread t = new Thread(a);
      Thread t1 = new Thread(b);
  
        t.start();
        t1.start();
    
        // TODO code application logic here
    }
    
}
