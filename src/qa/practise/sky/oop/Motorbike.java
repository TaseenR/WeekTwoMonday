package qa.practise.sky.oop;

public class Motorbike extends Vehicle{

    private boolean hasSideCar;

    public Motorbike(int topSpeed, String modelName, int makeYear, int numPreviousOwners, boolean hasSideCar, int monthlyExpenses,int id) {
        super(topSpeed, 2, modelName, makeYear, numPreviousOwners, monthlyExpenses, id);
        this.hasSideCar = hasSideCar;
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }
}
