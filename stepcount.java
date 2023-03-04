public class stepcount {
    public static int stepcount(int n,int count){
        if(n==0){
            return count;
        }
        if(n%2==0){
            n/=2;
            count++;
        }
        else{
            n-=1;
            count++;
        }

        return(stepcount(n, count));
    }
    public static void main(String[] args) {
        int n=41;
        System.out.println(stepcount(n, 0));
    }
}
