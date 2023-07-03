public class hwboolean2 {

    public static void main(String[] args){

        System.out.println("Я могу купить еду, это " + canBuy(true, false));
    }

    public static boolean canBuy(boolean isEdecaOpen, boolean isReweOpen){
        boolean canBuy = isEdecaOpen || isReweOpen;
        return canBuy;

    }
}
