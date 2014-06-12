/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cars;

/**
 *
 * @author Andrew
 */
public class Car implements interfaces.CarInterface{
    private final int amountofdoors,fueltanksize,hp;
    private final String type;

    public Car(int amountofdoors, int fueltanksize, int hp, String type) {
        this.amountofdoors = amountofdoors;
        this.fueltanksize = fueltanksize;
        this.hp = hp;
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
        return amountofdoors;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Car{" + "amountofdoors=" + amountofdoors + ", fueltanksize=" + fueltanksize + ", hp=" + hp + ", type=" + type + '}';
    }

   
    
    
}
