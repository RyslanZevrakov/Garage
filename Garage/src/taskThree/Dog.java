package taskThree;

public class Dog extends Animal{

    public Dog(String name, int age, int hunger) {

    }

    public void run(int length) {
        if (length <= 500 && length > 0) {
            System.out.println(name + " Пробежал " + length + " метров");
        } else {
            System.out.println(name + " не смог пробежать");
        }
    }

    public void swim(int length){
        if (length <= 10 && length > 0) {
            System.out.println(name + " проплыл " + length + " метров");
        } else {
            System.out.println(name + " утонул(");
        }
    }



    public int getHunger() {

        return this.hunger;
    }
}
