public class printnumberfromnto1 {
    public static void printDec(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        //printDec(n-1); for printing no from 1 to N
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printDec(n);
    }
    
}
