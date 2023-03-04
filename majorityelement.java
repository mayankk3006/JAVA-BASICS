public class majorityelement {
    public static int majority(int nums[]){
        int majcount=nums.length/2;
        int i,j;
        for(i=0;i<nums.length;i++){
            int count=0;
            for(j=0;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    count+=1;
                }
            }
            if(count>=majcount){
                majcount=count;
                return nums[i];
            }

        }
        return -1;
        
        }
        
        
        public static void main(String[] args) {
            int nums[]={0,0,0,2,3,1,1};
            int temp=majority(nums);
            System.out.println(temp);
        }
        
    }
    

