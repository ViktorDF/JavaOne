package lessonSix;

public abstract class Animal {
    protected int runMaximum;
    protected int swimMaximum;
    protected int jumpMaximum;

    public Animal(int runMaximum, int swimMaximum, int jumpMaximum){
        this.jumpMaximum = jumpMaximum;
        this.runMaximum = runMaximum;
        this.swimMaximum = swimMaximum;
    }

    public Animal(int runMaximum, int jumpMaximum){
        this.jumpMaximum = jumpMaximum;
        this.runMaximum = runMaximum;
    }

    public  void run(int limitationRun){
        if (runMaximum >= limitationRun) {
            System.out.println("run: true");
        } else System.out.println("run: false");
    }

    public void swim(int limitationSwim){
        if (swimMaximum >= limitationSwim) {
            System.out.println("swim: true");
        } else System.out.println("swim: false");
    }

    public void jumpOverObstacles(int limitationHeight){
        if (jumpMaximum >= limitationHeight) {
            System.out.println("jump: true");
        } else System.out.println("jump: false");
    }
}
