public class BruteForceMaxSubArray {
    public static void maxsubarray(int arr[]){
        int sum;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                    System.out.print(arr[k]+" ");
                   
                    }
                    System.out.println(" ---> "+sum);
                    if(maxsum<sum){
                        maxsum=sum;
                   
                }
               
            }
        }
        System.out.print("Maximum sum is "+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        maxsubarray(arr);
    }
}
