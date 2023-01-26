public class recursionass {
    public static void keyfind(int arr[],int key,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.println(i+" ");
        }
        keyfind(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,5,3,4};
        int key=2;
        keyfind(arr,key,0);
        System.out.println();
    }
    
    
    
}
