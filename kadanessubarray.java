public class kadanessubarray {
    public static void kadans(int arr[]){
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum<0){
                sum=0;
            }
            maxsum=Math.max(sum,maxsum);
        }
        System.out.println("Maximum sum is "+maxsum);

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        kadans(arr);
    }
}
