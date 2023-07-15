package p02;

public class ControlFlowDemo {
    public static void main(String[] args) {
       System.out.println(sum(3,5)) ;
    }
    /*
    sum(0,3)->6
    (0+1+2+3=6)
     */
    public static int sum(int fromInclusive,int toInclusiv){
        int sum = 0;
        for(int i = fromInclusive; i<= toInclusiv; i++){
            sum += i;
        }
        return sum;
    }

    public static int fibo(int n){
        return 0;
    }



}
