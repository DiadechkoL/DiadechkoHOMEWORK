public class hwboolean1 {

    public static void main(String[] args){
        System.out.println(canWalk(true, true));
    }

    public static boolean canWalk (boolean isRain, boolean isWeekend){
        boolean canWalk = !isRain && isWeekend;
        return canWalk;

    }
}
