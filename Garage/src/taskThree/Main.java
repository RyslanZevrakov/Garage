package taskThree;
public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(50);

        Dog bobik = new Dog("Bobik", 2, 50);
        Dinner dinnerFirst = new Dinner(bobik, plate);
        System.out.println(bobik.getHunger());
        bobik.run(150);
        bobik.swim(10);


        Cat barsik = new Cat("Barsik", 1, 1);
        Dinner dinnerSecond = new Dinner(barsik, plate);
        System.out.println(barsik.getHunger());
        barsik.run(150);
        barsik.swim();
        System.out.printf("\n");
        System.out.printf("Животных здесь:2\n");
        System.out.printf("Собак здесь:1\n");
        System.out.printf("Котов здесь:1");
    }
}