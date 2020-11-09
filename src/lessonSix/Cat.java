package lessonSix;

public class Cat extends Animal{

        public Cat(int run, int jump){
            super(run, jump);
        }
        @Override
        public void swim(int limitationSwim) {
            System.out.println("cat cant swim");
        }
    }
