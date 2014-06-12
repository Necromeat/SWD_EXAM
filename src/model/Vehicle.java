/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Andrew
 */
public class Vehicle implements interfaces.VechicleInterface{
    private String type;
    private int hp;

    public Vehicle(String type, int hp) {
        this.type = type;
        this.hp = hp;
    }
    
    
    
    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getHorsepower() {
        return hp;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "type=" + type + ", hp=" + hp + '}';
    }
    
    
}
