package taskThree;

public class Dinner {
    private Animal hungerAnimal;
    private Plate plate;

    public Dinner(Animal hungerAnimal, Plate plate) {
        this.hungerAnimal = hungerAnimal;
        this.plate = plate;
        eat();
    }

    private int eat() {
        if (hungerAnimal.hunger - plate.getCapacity() >= 0) {
            System.out.println("Животное поело");
            plate.setCapacity(hungerAnimal.hunger - plate.getCapacity());

            System.out.printf("Корма осталось:"+ plate.getCapacity());
        }

        else {
            System.out.printf("Животное голодает \n");
        }
        return hungerAnimal.hunger;
    }
}
