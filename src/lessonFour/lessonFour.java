import java.util.Random;
import java.util.Scanner;

public class lessonFour {
    public static void main(String[] args) {
        char[][] field = createNewField();

        do {
            doPlayerMove(field);
            drawField(field);
            if (checkWin(field, 'X')) {
                System.out.println("Player won!!!");
                break;
            }
            if (checkDraw(field)) {
                System.out.println("It is draw! Sorry!");
                break;
            }

            System.out.println("===========");
            doPlayerAI(field);
            drawField(field);
            if (checkWin(field, 'O')) {
                System.out.println("AI won!!!");
                break;
            }
            if (checkDraw(field)) {
                System.out.println("It is draw! Sorry!");
                break;
            }
        } while (true);
    }

    static boolean checkDraw(char[][] field) {
        int maxMinus = field.length * field.length;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != '-') {
                    maxMinus--;
                }
            }
        }

        return maxMinus == 0;
    }

    //task 2, task 3
    static boolean checkWin(char[][] field, char sign) {
        // Horizontal and vertical

        boolean hor, ver;
        for (int i = 0; i < field.length; i++) {
            hor = true;
            ver = true;
            for (int j = 0; j < field.length; j++) {
                hor &= (field[i][j] == sign);
                ver &= (field[j][i] == sign);
            }
            if(hor || ver) return true;
        }


        // diagonals

        boolean mainDia, secDia;
        mainDia = true;
        secDia = true;
        for (int i = 0; i < field.length; i++) {
            mainDia &= (field[i][i] == sign);
            secDia &= (field[field.length - i - 1][i] == sign);
        }
        if (mainDia||secDia) return true;


        return false;
    }

    static void doPlayerAI(char[][] field) {
        Random random = new Random();
        int x, y;
        do {
            x = random.nextInt(field.length);
            y = random.nextInt(field.length);
        } while (field[x][y] != '-');
        field[x][y] = 'O';
    }

    static void doPlayerMove(char[][] field) {
        int x, y;
        do {
            x = getIndexCoordinate('X', field.length);
            y = getIndexCoordinate('Y', field.length);
        } while (field[x][y] != '-');
        field[x][y] = 'X';
    }

    static int getIndexCoordinate(char coordName, int max) {
        return getCoordinate(coordName, max) - 1;
    }

    static int getCoordinate(char coordName, int max) {
        int coord;
        do {
            System.out.println(String.format("Please input %s-coordinate [1-%s]", coordName, max));
            Scanner scanner = new Scanner(System.in);
            coord = scanner.nextInt();
        } while (coord < 1 || coord > max);

        return coord;
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    static char[][] createNewField() {
        return new char[][]{
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
    }
}
