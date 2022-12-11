public class prefixsumsubarray {
    public static void prefixarray(int arr[]){
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];

        // claculating prefix array

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(maxsum<sum){
                    maxsum=sum;
                }
            }
        }
        System.out.println("Maximum sum is "+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        prefixarray(arr);
    }
    
}
