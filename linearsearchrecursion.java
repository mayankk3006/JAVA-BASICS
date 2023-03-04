public class linearsearchrecursion {
    public static boolean search(int arr[],int key,int i) {
        if(i==arr.length){
            return false;
        }
        if(arr[i]==key){
            return true;
        }
        else{
            return search(arr, key,i+1);

        }
        
        
    }
    public static void main(String[] args) {
        int i=0;
        int arr[]={1,2,3,6,3,4};
        int key=5;
        System.out.println(search(arr, key, i));
    }
}
