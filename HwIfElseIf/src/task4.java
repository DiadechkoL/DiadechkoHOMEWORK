import java.util.Scanner;

//4. Напишите метод, который определяет оценку студента в зависимости от полученного балла:
//        90-100 - A, 80-89 - B, 70-79 - C, 60-69 - D, меньше 60 - F.
//        Метод принимает число в качестве аргумента и возвращает строку

public class task4 {
    public static void main(String[] args){
CheckMyGrade();
    }

    public static void CheckMyGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number of points");
        double myPoints = scanner.nextInt();

        if (myPoints >= 90 && myPoints <= 100) {
            System.out.println("Your grade is \"A\"");
        } else if (myPoints >= 80 && myPoints == 89){
            System.out.println("Your grade is \"B\"");
        } else if (myPoints >= 70 && myPoints == 79) {
            System.out.println("Your grade is \"C\"");
        }else if (myPoints >= 60 && myPoints == 69){
            System.out.println("Your grade is \"D\"");
        } else if (myPoints < 60){
            System.out.println("Your grade is \"F\"");
        }
    }}

// Я написала через сканнер и потом увидела, что в задании он должен принимать число в качестве аргумента и отдавать строку,
// но при этом работает корректно. Является ли это ошибкой?