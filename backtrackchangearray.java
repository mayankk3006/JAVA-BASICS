public class backtrackchangearray {
    public static void change(int arr[],int i,int val){
        if(i==arr.length){
            printarr(arr);
            return;

        }
        arr[i]=val;
        change(arr, i+1, val+1);  //recursive step
        arr[i]-=2;   //back tracking step
        
    }
    private static void printarr(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        int arr[]=new int[5];
        change(arr, 0, 1);
        printarr(arr);
       
        }
    
}
