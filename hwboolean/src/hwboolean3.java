public class hwboolean3 {

    public static void main(String[] args){
    System.out.println(check(101, 50));
        System.out.println(check(50, 101));
    }

    public static boolean check(double temperature1, double temperature2){
        boolean check2 = temperature1 > 100 && temperature2 < 100;
    return check2;
    }


}
