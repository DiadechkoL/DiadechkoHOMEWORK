public class hwmethods2 {
//    Реализовать программу, которая выводит на экран результаты сложения, вычитания, умножения и деления двух чисел.
//    Каждая из арифметических операций должна быть реализована как отдельный метод.
//    каждый отдельный метод принимает в качестве аргументов два числа и возвращает тоже число

public static void main (String[] args){

   double resultat =  multiplication(5,5);

   System.out.println("Result of multiplication is: " + resultat);

   double resultatDev = division(9, 3);
   System.out.println("Result of division is: " + resultatDev);

    double resultatAdd = add(3,3);
    System.out.println("Result of add is: " + resultatAdd);

    double resultatSubstr = subtraction(6, 9);
    System.out.println("Result of substaction is: " + resultatSubstr);
}


    public static double multiplication (double a, double b) {

         double resultat = a * b;
         return resultat;
    }


    public static double division (double a, double b){
    double resultatDev = a /  b;
    return resultatDev;
    }

        public static double add (double a, double b){
        double resultatAdd = a + b;
        return  resultatAdd;


        }

        public static double subtraction (double a, double b){
        double resultatSubstr = a - b;
        return resultatSubstr;

        }

}
