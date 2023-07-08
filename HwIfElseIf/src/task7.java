import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int x = scanner.nextInt();

        String isMultiple = multiple(x);
        System.out.println("Ваше число " + isMultiple);
    }

    public static String multiple(int x) {

        if (x % 3 == 0) {
            return "кратное 3";
        } else if (x % 5 == 0) {
            return "кратное 5";
        } else if (x % 3 == 0 || x % 5 == 0) {
            return "кратное 3 ил 5 ";
        } else {
            return "не кратное ни  3  , ни 5 ";
        }
    }
}
