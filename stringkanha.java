import java.util.Scanner;

public class stringkanha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
       
        
        System.out.println(middle(str, 0));
        
    }
    public static String middle(String str,int i){
        int beg=i;
        int end=str.length()-1;
        int mid=beg+(end-beg)/2;
        if(str.length()%2==0){
            return str.substring(mid,mid+2);

        }
        
            
            return str.substring(mid,mid+1);
        
    }
}
