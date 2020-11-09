package lessonSix;

public class lessonSix {
    public static void main(String[] args){

        Cat cat = new Cat(200, 3);
        Dog dog = new Dog(500, 15, 2);

        cat.jumpOverObstacles(5);
        cat.run(400);
        cat.swim(15);

        dog.jumpOverObstacles(123);
        dog.run(120);
        dog.swim(20);
    }
}
