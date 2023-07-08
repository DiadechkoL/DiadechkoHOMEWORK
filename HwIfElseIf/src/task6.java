import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону a");
        double a = scanner.nextDouble();
        System.out.println("Введите сторону b");
        double b = scanner.nextDouble();
        System.out.println("Введите сторону c");
        double c = scanner.nextDouble();

        String result = whichTriangle(a, b, c);
        System.out.println("Ваш треугольник " + result);
    }

    public static String whichTriangle(double a, double b, double c) {
        if (a == b && a == c ) {
            return "равносторонний";
        } else if (a == b  || a == c || b == c){
            return "равнобедренный";
        } else {
            return "разносторонний";
        }
    }
}


