public class Main {
    public static
    void main(String[] args) {
        Cat[] cats = {
                new Cat("Cat1", 47),
                new Cat("Cat2", 5),
                new Cat("Cat3", 45),
                new Cat("Cat4", 10),
                new Cat("Cat5", 39)
        };
        Plate plate = new Plate( 45);
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

    }
}