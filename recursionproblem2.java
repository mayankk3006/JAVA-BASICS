public class recursionproblem2 {
    // pritn number from 1 to n
    public static void printnum(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        printnum((n-1));
        System.out.print(n+" ");
    }
public static void main(String[] args) {
    printnum(10);
}
    
}
