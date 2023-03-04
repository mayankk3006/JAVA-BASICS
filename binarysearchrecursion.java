public class binarysearchrecursion {
    public static int binarysearch(int arr[],int key,int end,int beg){
        
        if(beg<=end){
            int mid=(beg+end)/2;
        
        
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]>key){
          return  binarysearch(arr, key, mid-1, beg);
        }
        else{
            return binarysearch(arr, key, end, mid+1);
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int key=4;
        int beg=0;
        int end =3;
        int index=binarysearch(arr, key, end, beg);
        if(index==-1){
            System.out.println("element not found");

        }
        else{
            System.out.println("element found at :"+index);
        }
    }
}
