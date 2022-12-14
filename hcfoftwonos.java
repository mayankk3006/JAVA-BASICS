public class hcfoftwonos {
    public static void main(String[] args) {
        int a=31,b=119,hcf=0,i;
        for( i = 1; i <= a || i <= b; i++) {
            if( a%i == 0 && b%i == 0 )
            hcf = i;
         }

         int lcm=(a*b)/hcf;
        
       System.out.println(hcf);
       System.out.println(lcm);
    
    
}
}
