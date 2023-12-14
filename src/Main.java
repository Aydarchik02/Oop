
public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat();

        cat1.name = "Garfild";
        cat1.age = 4;
        cat1.weight = 8.5;
        cat1.color = "Black";

        System.out.println(cat1.name);

        Cat cat2 = new Cat();

        cat2.name = "Murka";
        cat2.age = 2;
        cat2.weight = 3.4;
        cat2.color = "White";

        System.out.println("Мышыктын аты " +cat2.name);
        System.out.println(cat2.age);
        System.out.println(cat2.weight);
        System.out.println(cat2.color);
    }
}