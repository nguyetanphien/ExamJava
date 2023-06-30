import util.MainFunction;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int chosse;

        while (true) {
            MainFunction.menu();
            Scanner scanner = new Scanner(System.in);
            chosse = scanner.nextInt();
            switch (chosse) {
                case 1:
                    MainFunction.input(scanner);
                    break;
                case 2, 5:
                    MainFunction.outputSudent();
                    break;
                case 3, 4:
                    MainFunction.outputTeacher();
                    break;
                case 6:
                    MainFunction.sortAvg();
                    break;
                case 7:
                    MainFunction.sortAphabeticalTeacher();
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        }


    }
}