/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vans;

/**
 *
 * @author Andrew
 */
public class Van implements interfaces.CarInterface,interfaces.TruckInterface{
    private final int loadsize,hp,amountofseats,fueltanksize,amountofdoors;
    private final String type;

    public Van(int loadsize, int hp, int amountofseats, int fueltanksize, int amountofdoors, String type) {
        this.loadsize = loadsize;
        this.hp = hp;
        this.amountofseats = amountofseats;
        this.fueltanksize = fueltanksize;
        this.amountofdoors = amountofdoors;
        this.type = type;
    }

    
        
    @Override
    public int amountOfDoors() {
        return amountofdoors;
    }

    @Override
    public int getFuelTankSize() {
        return fueltanksize;
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
    public int getLoadSize() {
        return loadsize;
    }

    @Override
    public String toString() {
        return "Van{" + "loadsize=" + loadsize + ", hp=" + hp + ", amountofseats=" + amountofseats + ", fueltanksize=" + fueltanksize + ", amountofdoors=" + amountofdoors + ", type=" + type + '}';
    }
    
}
