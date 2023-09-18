package taskOne;

import taskOne.Auto;

import java.util.ArrayList;

public class GarageCar {

    private ArrayList<Auto> masCar = new ArrayList<Auto>();


    public void addCar(Auto m) {
        masCar.add(m);
    }

    public GarageCar() {
    }
    public  void deliteCar(Auto m){
        masCar.remove(m);
    }


    public Boolean findCar(Auto m) {
        return masCar.contains(m);
    }


    public GarageCar(ArrayList <Auto> n) {
        masCar = n;
    }


    public void printGarage() {
        System.out.print("В гараже: ");
        for(Auto a:masCar) {
            System.out.println("\t" + a.toString());
        }
    }
}

