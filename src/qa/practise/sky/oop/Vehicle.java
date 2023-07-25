package qa.practise.sky.oop;

public class Vehicle {
    private int topSpeed;
    private int numberOfWheels;
    private String modelName;
    private int makeYear;
    private int numPreviousOwners;

    private int monthlyExpenses;

    private int id;

    public Vehicle(int topSpeed, int numberOfWheels, String modelName, int makeYear, int numPreviousOwners, int monthlyExpenses,int id) {
        super();
        this.topSpeed = topSpeed;
        this.numberOfWheels = numberOfWheels;
        this.modelName = modelName;
        this.makeYear = makeYear;
        this.numPreviousOwners = numPreviousOwners;
        this.monthlyExpenses = monthlyExpenses;
        this.id = id;
    }

    public int getMonthlyExpenses() {
        return monthlyExpenses;
    }

    public void setMonthlyExpenses(int monthlyExpenses) {
        this.monthlyExpenses = monthlyExpenses;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(int makeYear) {
        this.makeYear = makeYear;
    }

    public int getNumPreviousOwners() {
        return numPreviousOwners;
    }

    public void setNumPreviousOwners(int numPreviousOwners) {
        this.numPreviousOwners = numPreviousOwners;
    }

    @Override
    public String toString() {
        return "I am " + this.getModelName() + " my top speed is " + this.getTopSpeed() + " I was born in  " + this.makeYear;
    }

    public int getId() {
        return id;
    }
}
