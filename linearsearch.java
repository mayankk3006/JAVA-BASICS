import java.util.*;
public class linearsearch {
    public static int linearsearch(int arr[],int key){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return 1;
            }

        }
        return -1;

    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int key =1;
        int index=linearsearch(arr,key);
        if(index==1){
            System.out.println("Found at");
    
        }
        else{
            System.out.println("Not found");
        }
    }


    
}
