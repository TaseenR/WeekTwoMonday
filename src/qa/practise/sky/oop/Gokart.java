package qa.practise.sky.oop;

public class Gokart extends Vehicle{

    private int speedLimit;
    public Gokart(String modelName, int makeYear, int speedLimit,int id) {
        super(250, 4, modelName, makeYear, 0,350,id);
        this.speedLimit = speedLimit;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }
}
