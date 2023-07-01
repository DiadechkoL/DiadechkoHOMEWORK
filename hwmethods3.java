public class hwmethods3 {
//    реализовать метод, который конвертирует указанную сумму в евро в сумму в долларах США
//    метод принимает два числа - сумму в евро и текущий курс (количество долларов, которое дают за 1 евро).
//    метод ничего не возвращает, но печатает в консоль:
//            "при курсе … USD за один EUR, при обмене … EUR, вы получте … USD".


    public static void main(String[] args ){
        double howManyEuro = 10;
        double rates = 0.9;


        double howManyUsd = howManyEuro * rates;
                currency(10, 0.9);


    }

    public static void currency(double howManyEuro, double rates){

        double howManyUsd = howManyEuro * rates;

        System.out.println("При курсе:" + rates + "USD за один EUR, при обмене " + howManyEuro + "EUR, вы получите " + howManyUsd
                + "USD.");




    }














}
