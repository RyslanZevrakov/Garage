package taskThree;

public class Cat extends Animal {


    public Cat(String name, int age, int hunger) {

    }

    public void run(int length) {
        if (length <= 200 && length > 0) {
            System.out.println(name + " Пробежал " + length + " метров");
        } else {
            System.out.println(name + " не смог пробежать");
        }
    }

    public void swim() {
        System.out.println("Коты не умеют плавать");
    }

    public int getHunger() {
        return this.hunger;
    }


}
