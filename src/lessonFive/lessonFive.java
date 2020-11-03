package lessonFive;

public class lessonFive {
    public static void main(String[] args){
        Personal[] personals = new Personal[5];
        personals[0] = new Personal("Dima", "head", "d@mail.ru", 616,500000,39);
        personals[1] = new Personal("Masha", "head head", "m@mail.ru", 610,1000000,29);
        personals[2] = new Personal("Peter", "post", "p@mail.ru", 500,123435,49);
        personals[3] = new Personal("Sasha", "driver", "s@mail.ru", 550,615343,59);
        personals[4] = new Personal("Igor", "seller", "i@mail.ru", 400,6234125,19);

        for (int i = 0; i < personals.length; i++) {
            if (personals[i].getAge() > 40) {
                personals[i].print(personals[i]);
            }
        }
    }
}
