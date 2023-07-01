import java.util.Scanner;

public class hwmethods1 {
//    - введите 2 слова используя сканер, состоящие из четного количества букв (проверьте количество букв в слове).
//
//    создайте метод "returnNewWord", который принимает в качестве аргумента 2 строки и возвращает тоже строку.
//    Получите слово, состоящее из первой половины первого слова и второй половины второго слова.
//    Предполагаем, что пользователь вводит корректные данные.
//
//"aabb", "ccdd" -> "aadd"
//        "12", "abcd" -> "1cd"
//    убедитесь, что ваш код работает, прежде чем сдавать.
//    убедитесь, что ваш код возвращает корректные значения для слов разной длины.
//    слова считываются НЕ в методе returnNewWord, там происходит только обработка


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово с четным кол-во букв");
        String first = scanner.nextLine();

        System.out.println("Введите второе слово с четным кол-во букв");
        String second = scanner.nextLine();

        String firstAndSecond = returnNewWord(first, second);
        System.out.println("Ваше новое слово: " + firstAndSecond);
    }

    public static String returnNewWord(String partOne, String partTwo){


        int lengthOfFirst = partOne.length();
        int lengthOfSecond = partTwo.length();

        int midOfIndexFirst = lengthOfFirst / 2 ;
        int midOfIndexSecond = lengthOfSecond / 2 ;

        String firstHalf = partOne.substring(0, midOfIndexFirst);
        String secondHalf = partTwo.substring(midOfIndexSecond, lengthOfSecond);

        String result = firstHalf + secondHalf;

        return result;

    }

















}
