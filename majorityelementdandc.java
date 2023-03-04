public class majorityelementdandc {
    public static int majorityelement(int nums[],int beg,int end){
        if(beg==end){
            return nums[beg];
        }
        int mid=beg+(end-beg)/2;
        int left=majorityelement(nums,beg,mid);
        int right=majorityelement(nums, mid+1, end);
        if(left==right){
            return left;
        }
        int leftc=countrange(nums, left, beg, end);
        int rightc=countrange(nums, right, beg, end);
        return leftc>rightc?left:right;
    }

    private static int countrange(int[] nums, int num,int beg, int end) {
        int count =0;
        for(int i=beg;i<end;i++){
            if(nums[i]==num){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[]={2,2,2,21,3,4};
        System.out.println(majorityelement(nums, 0,nums.length-1));
    }
}
