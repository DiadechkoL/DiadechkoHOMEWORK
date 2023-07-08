import java.util.Scanner;

//1. Напишите метод, который проверяет, является ли заданное число положительным, отрицательным или нулём и
// печатает ответ в консоль
public class task1 {
    public static void main(String[] args) {
        CheckNumber();
    }

    public static void CheckNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше число");

        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Ваше число отрицательное");
        } else if (number == 0) {
            System.out.println("Ваше число ноль");

        } else if (number > 0) {
            System.out.println("Ваше число положительное");
        }

    }
}