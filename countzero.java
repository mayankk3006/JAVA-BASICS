public class countzero {
    public static int countzero1(int n,int count){
        
        if(n==0){
            return count;
        }
        int rem=n%10;
        if(rem==0){
            count++;
        }
            return countzero1(n/10,count);
            
        
       
        
        
    }
    public static void main(String[] args) {
        int n=2030303030;
        int ans=countzero1(n,0);
        System.out.println(ans);
    }
}
