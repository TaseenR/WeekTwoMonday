package qa.practise.sky.oop;

import java.util.List;

public class Garage {

    private List<Vehicle> vehicleList;

    public Garage(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void addToList(Vehicle v){
        vehicleList.add(v);
    }

//    public void removeByType(Vehicle model){
//        Class instance = model.getClass();
//        for(Vehicle v: vehicleList){
//
//            if(v.getClass() == instance){
//                vehicleList.remove(v);
//            }
//        }
//    }

    public void removeById(int id){
        boolean found = false;
        for(Vehicle v: vehicleList){
            if(v.getId() == id){
                vehicleList.remove(v);
                found = true;
                break;
            }
        }
        if(found == false){
            System.out.println("This vechicle is not in garage");
        }
    }

    public void printList(){
        for(Vehicle v : vehicleList){
            System.out.println(v);
        }
    }

    public double totalBill(){
        double returnBill = 50;
        if(vehicleList.isEmpty()){
            return 0;
        }
        else {
            for (Vehicle v: vehicleList) {
                returnBill =+ v.bill();
            }
            return returnBill;
        }

    }


}
