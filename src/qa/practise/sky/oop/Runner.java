package qa.practise.sky.oop;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Vehicle car = new Vehicle(200,4,"TazMobile",2023,0, 400,001);
        Vehicle dunebugs = new Vehicle(100,4,"dune",2000,0,3000,002);
        Motorbike bike = new Motorbike(120,"HondaBike",2010,2,false,300,003);
        Gokart gokart = new Gokart("zoomKart",2015,100,004);
        Gokart goOkart = new Gokart("zoomKart",2015,100,004);
        Gokart goOokart = new Gokart("zoomKart",2015,100,004);
        Gokart goOookart = new Gokart("zoomKart",2015,100,004);


        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(gokart);
        vehicles.add(goOkart);
        vehicles.add(goOokart);
        vehicles.add(goOookart);

        Garage garage = new Garage(vehicles);

        garage.removeByType(gokart);

        garage.printList();
        garage.removeById(003);
        garage.printList();



        System.out.println("The total monthly bill for this garage is " + garage.totalBill());


    }

}
