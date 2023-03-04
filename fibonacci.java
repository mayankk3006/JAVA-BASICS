import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int c=0;
    int a=0;
        int b=1;
        System.out.print("Enter a number to check fibonnaci:");
        int n= sc.nextInt();
       

    while(a<n){
       c=a+b;
        a=b;
        b=c;
       
        
        
    }
    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(c);
    if(n==a){
        
        System.out.println("True");

    }
    else{
        System.out.println( n +" not a fib number ");
    }
    sc.close();
    }
    
}
