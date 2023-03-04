import java.util.Arrays;

public class selectionsortrecursion {
    public static void insertion(int arr[],int r ,int c,int max){
        
        if(r==0){
        
            return;
        }
        if(c<r){
        if(arr[c]>arr[max]){
            insertion(arr,r,c+1,c);
        }
        else{
            insertion(arr, r,c+1, max);
        }
    }
    else{
        int temp=arr[max];
        arr[max]=arr[r-1];
        arr[r-1]=temp;
        insertion(arr, r-1, 0, 0);
    }

    }
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4};
        insertion(arr, arr.length, 0,0);

        System.out.println(Arrays.toString(arr));
    }
}
