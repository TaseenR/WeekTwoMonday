package qa.practise.sky.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Runner {


    public static void main(String[] args) {
        Bird bird1 = new Bird();
        Bird bird2 = new Bird();
        Plane plane1 = new Plane(2000,4,"Concord-543",2017,0,2000,001);
        Plane plane2 = new Plane(2500,4,"Concord-453",2012,0,2300,002);

        List<Flyable> flyableList = List.of(bird1,bird2,plane1,plane2);
        for(Flyable F: flyableList){
            F.fly();
        }
    }
}
