/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trucks;

/**
 *
 * @author Andrew
 */
public class Truck implements interfaces.TruckInterface{
    private final int loadsize,hp,amountofseats;
    private final String type;

    public Truck(int loadsize, int hp, int amountofseats, String type) {
        this.loadsize = loadsize;
        this.hp = hp;
        this.amountofseats = amountofseats;
        this.type = type;
    }
    
    
    
    @Override
    public int getLoadSize() {
        return loadsize;
    }

    @Override
    public int getHorsePower() {
        return hp;
    }

    @Override
    public int getAmountOfSeats() {
        return amountofseats;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Truck{" + "loadsize=" + loadsize + ", hp=" + hp + ", amountofseats=" + amountofseats + ", type=" + type + '}';
    }
    
}
