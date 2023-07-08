import java.util.Scanner;

//5. Напишите метод, который определяет время года (весна, лето, осень, зима) в зависимости от заданного месяца.
//        используйте конструкции if-else-if. Метод принимает строку и возвращает тоже строку
public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the name of the month");
        String month = scanner.nextLine();

        String yourSeason = whatSeason(month);
        System.out.println("It is " + yourSeason);
    }

    public static String whatSeason(String month) {
        if (month.equalsIgnoreCase("december") || month.equalsIgnoreCase("january") ||
                month.equalsIgnoreCase("fabruary")) {
            return "winter";
        } else if (month.equalsIgnoreCase("march") || month.equalsIgnoreCase("april") ||
                month.equalsIgnoreCase("may")) {
            return "spring";
        } else if (month.equalsIgnoreCase("june") || month.equalsIgnoreCase("july") ||
                month.equalsIgnoreCase("august")) {
            return "summer";
        } else if (month.equalsIgnoreCase("september") || month.equalsIgnoreCase("october") ||
                month.equalsIgnoreCase("november")) {
            return "autumn";
        }
        return month;
    }
}


























