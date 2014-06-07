/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package notifiers;

import java.util.Observable;

/**
 *
 * @author Andrew
 */
public class SlowDrinker extends Observable implements Runnable,interfaces.DrinkerInterface{
 protected final int drinkamount = 1;
    private int amountofdrink;
    private int timeatbare;
    private boolean stilldrinking = true;
    private String response= "more drink";
    public SlowDrinker(int amountofdrink, int timeatbare) {
        this.amountofdrink = amountofdrink;
        this.timeatbare = timeatbare;
    }
    
    
    
    @Override
    public void run() {
        while(stilldrinking){
            toast();
        }
    }

    @Override
    public void refill(int liq) {
        amountofdrink += liq;
    
    }

    @Override
    public void toast() {
        timeatbare--;
        if(timeatbare <= 0){
            stilldrinking = false;
        }
        if(amountofdrink >= drinkamount){
            amountofdrink=amountofdrink-drinkamount;
        }
    
        if(amountofdrink<=0){
            setChanged();
            notifyObservers(response);
        }
        
    }
     @Override
    public String getDrinker() {
        return "SlowDrinker";
    }
}
