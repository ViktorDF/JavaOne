package LessoneOne;

public class lessoneOne {
    public static void main(String [] args){
        byte b = 8;
        short s = 1000;
        int i = 15000;
        long l = 128895536476L;
        float f = 15.5f;
        double d = 12847.1414;
        char c = 'h';
        boolean bool = true;
        String name = "Victor";
        System.out.println(deem(8, 7, 6, 12));
        System.out.println(verify(12, 7));
        System.out.println(checkSign(-5));
        System.out.println(checkNegative(5));
        writeName("Victor");
        checkYear(1900);
    }
    static double deem(int a, int b, int c, int d){
        return a*(b+(c/d));
    }
    static boolean verify(int a, int b){
        if (a + b > 10 && a + b <=20){
            return true;
        } else return false;
    }
    static String checkSign (int a){
        if(a >=0 ){
            return "The number is positive";
        }else return "The number is negative";
    }
    static  boolean checkNegative (int a){
        if(a < 0){
            return true;
        } else return false;
    }
    static void writeName (String name){
        System.out.println("Hello " + name + "!");
    }
    static void checkYear(int year){
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " year is leap!");
        } else System.out.println(year + " year is not leap");
    }
}

