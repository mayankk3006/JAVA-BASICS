public class checkarraysorted {
    public static boolean sortcheck(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        
        return arr[i]<arr[i+1]&&sortcheck(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,2,6};
        int i=0;
        System.out.println(sortcheck(arr, i));
        }
}
