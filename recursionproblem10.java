public class recursionproblem10 {
    //optimised print x^n 

    public static int power(int a,int n){
        if(n==0){
            return 1;
        }
        if(n%2!=0){
            return a*power(a,n/2)*power(a,n/2);
        }
        return power(a,n/2)*power(a,n/2);
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
}
