import java.util.*;
public class pairsinarray {
    public static void pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+current+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        pairs(arr);

    }
    
}
