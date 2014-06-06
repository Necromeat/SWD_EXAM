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
public class TestVolvo extends Volvo{
    private final Car car;

    public TestVolvo(Car car) {
        this.car = car;
    }
            
    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public int amountOfDoors() {
    return car.amountOfDoors();
    }

    @Override
    public int getFuelTankSize() {
        return car.getFuelTankSize();
    }

    @Override
    public int getHorsePower() {
        return car.getHorsePower();
    }

    @Override
    public int getAmountOfSeats() {
        return car.getAmountOfSeats();
    }

    @Override
    public String getType() {
        String x = "Volvos rule";
        return x;
    }

    @Override
    public String toString() {
        return "TestVolvo{" + "car=" + car + '}';
    }
    
}
