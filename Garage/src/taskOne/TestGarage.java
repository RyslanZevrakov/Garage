package taskOne;

import taskOne.Car;
import taskOne.GarageCar;

public class TestGarage {

    public static void main(String[] args) {
        GarageCar myGarage = new GarageCar();
        Car myCar1 = new Car("Ford", 200, "Mustang", 2, false,"O905JU");
        myGarage.addCar(myCar1);
        myGarage.addCar(new Car("Lada", 140, "Kalina", 4, false,"S231AD"));
        Truck myTruck = new Truck("Dove", 160, "DTS", 700, true,"N130KL");
        myGarage.addCar(myTruck);

        myGarage.printGarage();
        if(myGarage.findCar(myTruck)) {
            System.out.println("Да");
        }else {
            System.out.printf("Нет");
        }
        myGarage.deliteCar(myTruck);
        myGarage.printGarage();
        if(myGarage.findCar(myTruck)) {
            System.out.println("Да");
        }else {
            System.out.printf("Нет");
        }
    }
}

