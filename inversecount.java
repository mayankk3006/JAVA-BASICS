public class inversecount {
    public static int getinvcnt(int nums[]){
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){

            if(nums[i]>nums[j]){
                count++;
            }

        }
    }
    return count;
}
public static void main(String[] args) {
    int nums[]={1,3,5,2,4,6};
    System.out.println(getinvcnt(nums));

}
}
