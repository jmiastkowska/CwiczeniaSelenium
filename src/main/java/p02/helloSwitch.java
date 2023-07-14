package p02;

public class helloSwitch {
    public static void main(String[] args){
        int dayNo = 5;
        switch(dayNo){
            case 1:
                System.out.println("pon");
            case 2:
                System.out.println("wt");
            case 3:
                System.out.println("sr");
            case 4:
                System.out.println("czw");
            case 5:
                System.out.println("pt");
            case 6:
                System.out.println("sb");
            case 7:
                System.out.println("nd");
            default:
                System.out.println("błędny dzień");
        }
            System.out.println("-----------");
            System.out.println(dayNumberToString(dayNo));
    }
    public static String dayNumberToString (int dayNo){
        switch (dayNo){
            case 1:
                return "pon";
            case 2:
                return "wt";
            case 3:
                return "sr";
            case 4:
                return "czw";
            case 5:
                return "pt";
            case 6:
                return "sb";
            case 7:
                return "nd";
            default:
                return "błędny dzień";
        }
    }
}
