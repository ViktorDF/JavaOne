package lessonFive;

public class Personal {
    public Object print;
    private String FIO;
    private String position;
    private String email;
    private long telephone;
    private long salary;
    private int age;

    public Personal(String FIO, String position, String email, long telephone, long salary, int age){
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void print(Personal personal){
        System.out.println("FIO: " + personal.FIO);
        System.out.println("position: " + personal.position);
        System.out.println("email: " + personal.email);
        System.out.println("telephone: " + personal.telephone);
        System.out.println("salary: " + personal.salary);
        System.out.println("age: " + personal.age);
        System.out.println("-----------------------------------------------");
        System.out.println();
    }
}
