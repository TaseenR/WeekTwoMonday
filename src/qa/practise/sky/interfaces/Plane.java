package qa.practise.sky.interfaces;

import qa.practise.sky.oop.Vehicle;

public class Plane extends Vehicle implements Flyable{
    public Plane(int topSpeed, int numberOfWheels, String modelName, int makeYear, int numPreviousOwners, int monthlyExpenses, int id) {
        super(topSpeed, numberOfWheels, modelName, makeYear, numPreviousOwners, monthlyExpenses, id);
    }

    @Override
    public void fly() {
        System.out.println("Vrooooommm");
    }
}
