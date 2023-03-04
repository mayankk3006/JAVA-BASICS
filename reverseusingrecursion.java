public class reverseusingrecursion {
    static int sum=0;
    public static void main(String[] args) {
        int n=121;
    
        System.out.println(pallin(n));
        System.out.println(rev(n));
    }
    public static int rev(int n) {
        if(n==0){
    
            return n;
        }
            int rem=n%10;
            sum=sum*10+rem;
            rev(n/10);

            return sum;
    }

    public static boolean pallin(int n){
        return n==rev(n);
    }
    
}
