package LessoneTwo;

import java.sql.SQLOutput;

public class lessoneTwo {
    public static void main(String args[]){

        // task 1
        int[] mas1 = {0,1,0,1,1,0,0,0,1,1};
        for(int i = 0; i < mas1.length; i++){
            if( mas1[i] == 1){
                mas1[i] = 0;
            }else if (mas1[i] == 0){
                mas1[i] = 1;
            }
        }
        for(int i = 0; i < mas1.length; i++) {
            System.out.print(mas1[i] + " ");
        }
        System.out.println();
        System.out.println();

        //task 2
        int[] mas2 = new int[8];
        for(int i = 1; i < mas2.length; i++){
            mas2[i] = mas2[i - 1] + 3;
        }
        for(int i = 0; i < mas2.length; i++) {
            System.out.print(mas2[i] + " ");
        }
        System.out.println();
        System.out.println();

        //task 3
        int[] mas3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        for(int i = 0; i < mas3.length; i++){
            if(mas3[i] < 6){
                mas3[i] = mas3[i] * 2;
            }
        }
        for(int i = 0; i < mas3.length; i++) {
            System.out.print(mas3[i] + " ");
        }
        System.out.println();
        System.out.println();

        //task 4
        int n = 5;
        int[][] mas4 = new int[n][n];
        for(int i = 0; i < mas4.length; i++){
            for(int j = 0; j < mas4.length; j++){
                if (i == j || i + j == n-1){
                    mas4[i][j] = 1;
                }
            }
        }
        for(int i = 0; i < mas4.length; i++){
            for(int j = 0; j < mas4.length; j++){
                System.out.print(mas4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // task 5**
        int[] mas5 = {1,2,10,34,101,34,54,12,23,36,6,4,7};
        int mas5Max = mas5[1];
        int mas5Min = mas5[1];
        for(int i = 0; i < mas5.length; i++){
            if(mas5[i] > mas5Max ){
                mas5Max = mas5[i];
            }
            if(mas5[i] < mas5Min){
                mas5Min = mas5[i];
            }
        }
        System.out.println("Minimum element of array: " + mas5Min);
        System.out.println("Maximum of array: " + mas5Max);
        System.out.println();
        System.out.println();

        //task 6**
        int[] mas6 = {2,1,1,1};
        System.out.println(checkBalance(mas6));
        System.out.println();

        //task 7****
        int[] mas7 = {1,2,3,4,5};
        shiftElements(-1, mas7);
    }

    //task 6**
    public static boolean checkBalance(int[] mas){
        int leftElement = 0;
        int rightElement = 0;
        for(int i = 0; i < mas.length - 1; i++){
            leftElement = leftElement + mas[i];
            for(int j = 1; j < mas.length; j++){
                rightElement = rightElement + mas[j];
            }
            if(leftElement == rightElement){
                return true;
            }
        }
        return false;
    }

    //task 7****
    static public void shiftElements(int n, int[] mas){
        if(n > 0) {
            for (int i = 0; i < n; i++) {
                int firstElement = mas[0];
                mas[0] = mas[mas.length - 1];
                for (int j = 1; j < mas.length - 1; j++) {
                    mas[mas.length - j] = mas[mas.length - j - 1];
                }
                mas[1] = firstElement;
            }
        } else if (n < 0){
            for (int i = 0; i > n; i--) {
                int lastElement = mas[mas.length - 1];
                mas[mas.length - 1] = mas[0];
                for (int j = 1; j < mas.length - 1; j++) {
                    mas[j - 1] = mas[j];
                }
                mas[mas.length - 2] = lastElement;
            }
        }
        for(int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }

}
