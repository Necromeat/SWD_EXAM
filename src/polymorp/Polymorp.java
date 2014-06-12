/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polymorp;

import cars.Car;
import cars.TestVolvo;
import interfaces.Vehicle;
import java.util.ArrayList;
import java.util.List;
import trucks.Truck;
import vans.Van;

/**
 *
 * @author Andrew
 */
public class Polymorp<T> {
    private static ArrayList<Car> cars = new ArrayList<>();
    private static ArrayList<Truck> trucks = new ArrayList<>();
   private static  ArrayList<Van> vans = new ArrayList<>();
    private static ArrayList<Vehicle> vehicles = new ArrayList<>();
    List<List<? extends Vehicle>> test = new ArrayList<>();
    private static  List<? super Vehicle> tests = new ArrayList<>();
    List tester = new ArrayList();      

    Car c = new Car(1,2,3,"Ford1");
        Car c1 = new Car(3,4,5,"Ford2");
        Car c2 = new Car(5,6,7,"Ford3");
        Car c3 = new Car(8,9,10,"Ford4");
        Truck t1 = new Truck(1,2,3,"Scania1");
        Truck t2 = new Truck(4,5,6,"Scania2");
        Truck t3 = new Truck(7,8,9,"Scania3");
        Truck t4 = new Truck(10,11,12,"Scania4");
        Van v1 = new Van(13,14,15,16,17,"Ford Van");
        TestVolvo tv = new TestVolvo(c1);
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Polymorp p = new Polymorp();
       p.carFun();
       p.truckFun();
       p.vanFun();
       p.VehicleFun();
      
      //Crap
      p.print();
      //Generic
      p.printall(cars);
      p.printall(vans);
      p.printall(trucks);
      p.printall(tests);
     
      //Type
      p.printalls(cars);
      p.printalls(vans);
      p.printalls(trucks);
      p.printalls(tests);
      
      p.crapo();
    }
    
    
    public void carFun(){
         
        cars.add(c);
        cars.add(c2);
        cars.add(c3);
//        cars.add(tv);
        tests.add(tv);
        tests.add(c);
    }
    
    public void truckFun(){
     trucks.add(t1);
     trucks.add(t2);
     trucks.add(t3);
     trucks.add(t4);
    }
    
    public  void vanFun(){
        vans.add(v1);
        
    }
    
    public void VehicleFun(){
        vehicles.add(c);
        vehicles.add(c1);
        vehicles.add(c2);
        vehicles.add(c3);
        vehicles.add(t1);
        vehicles.add(t2);
        vehicles.add(t3);
        vehicles.add(t4);
        vehicles.add(v1);
        vehicles.add(tv);
    }
    
    public void print(){
        for(Car c :cars){
            System.out.println(c.toString());
        }
        for(Truck t : trucks){
            System.out.println(t.toString());
        }
        for(Van v: vans){
            System.out.println(v.toString());
        }
        
        for(Vehicle v: vehicles){
            System.out.println("Vehicle: " + v.getType());
        }
        
        System.out.println(tv.getType());
        tv.print();
    }
    
    public void printall(List<? extends Vehicle> vs) {
        System.out.println("Printing List ?");
        test.add(vs);
        for (Vehicle v: vs) {
        System.out.println(v.getType());
        }
        
    }
    
    public void printalls(List<T> vs) {
        System.out.println("Printing List T");
        
    for (Object v: vs) {
        
        System.out.println(v.toString());
        }
    }
    
    public void crapo(){
        System.out.println("Crapo");
        tester.add(c);
        System.out.println(tester.get(0).toString());
        Car c1 = (Car)tester.get(0);
        System.out.println(c1.getType());
    }
     public void pt(List<? super Object> vs) {
        System.out.println("Printing List ?");
       
        for (Object v: vs) {
        System.out.println(v.toString());
        }
    }
}
