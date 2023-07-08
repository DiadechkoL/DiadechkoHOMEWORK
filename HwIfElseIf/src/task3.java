import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();
        boolean leapornot = isYearLeap(year);
        if (leapornot) {
            System.out.println("високосный");
        } else {
            System.out.println("невисокосный");
        }

    }

    public static boolean isYearLeap(int year) {


        if (year % 400 == 0) {
            if (year % 100 == 0) {
                if (year % 4 == 0) {
                    return true;
                } else {
                    return false;
                }
            }

        }
        return false;
    }
}
