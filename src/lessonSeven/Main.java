package lessonSeven;

public class Main {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Barsic", 10),
                new Cat("Snap", 12),
                new Cat("Varan", 14)};
        Plate plate = new Plate(30);
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        for (Cat cat: cats) {
            cat.seeSatiety();
        }
        plate.info();
        plate.addFood(112);
        plate.info();

    }
}
