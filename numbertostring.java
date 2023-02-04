public class numbertostring {
 static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printdigits(int n){
        if(n==0){
            return;
        }
        int lastdigit=n%10;
        printdigits(n/10);
        System.out.print(digits[lastdigit]+" ");
}
public static void main(String[] args) {
    printdigits(1234);
}
}