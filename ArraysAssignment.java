
  //________________________  //QUES 1.___________________________                       

import java.util.*;
 public class ArraysAssignment {
//     public static boolean check(int nums[]){
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,1};
//         boolean temp=check(arr);
//         System.out.println(temp);
//     }
// }



//________________________  //QUES 2.___________________________        




// public static void rotatearray(int nums[],int index,int target){
//     int flag=0;
//     for(int i=0;i<index;i++)
//     {
//         int temp = nums[0];
//         for(int j=1; j<nums.length; j++)
//             nums[j-1] = nums[j];
//         nums[nums.length-1] = temp;
//     }
    
//     for(int i=0;i<nums.length;i++){
//         System.out.print(nums[i]);
//     }
//     System.out.println();
//     for(int i=0;i<nums.length;i++){
        
//         if(nums[i]==target){
//             flag=i;
//             break;
//         }
//             else{
//                 flag=-1;
//             }
//     }
//     System.out.println(flag);
    
// }
// public static void main(String[] args) {
//     int arr[]={1,2,3,4,5,6,7};
//     int index=3;
//     int target =6;
//     rotatearray(arr,index,target);
    
    
// }




//________________________  //QUES 3.___________________________        

// public static int buyandsell(int prices[]){
//   int buyprice=Integer.MAX_VALUE;
//   int maxprofit=0;
//   for(int i=0;i<prices.length;i++){
//     if(buyprice<prices[i]){
//       int profit=prices[i]-buyprice;
//       maxprofit=Math.max(profit,maxprofit);
//     }
//     else{
//       buyprice=prices[i];
//     }
//   }
//   return maxprofit;
// }
// public static void main(String[] args) {
//   int arr[]={7,1,5,3,6,4};
//   System.out.println(buyandsell(arr));
  
// }


//________________________  //QUES 4.___________________________ 

// public static int trappingrainwater(int height[]){
//   int leftmax[]=new int[height.length];
//   leftmax[0]=height[0];
//   for(int i=1;i<height.length;i++){
//     leftmax[i]=Math.max(height[i],leftmax[i-1]);
//   }
//   int rightmax[]=new int[height.length];
//   rightmax[height.length-1]=height[height.length-1];
//   for(int i=height.length-2;i>=0;i--){
//     rightmax[i]=Math.max(height[i],rightmax[i+1]);
//   }
//   int trappedwater=0;
//   for(int i=0;i<height.length;i++){
//     int waterlevel=Math.min(rightmax[i],leftmax[i]);
//     trappedwater += waterlevel-height[i];
//   }
// return trappedwater;

// }
// public static void main(String[] args) {
//   int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
//   int output=trappingrainwater(arr);
//   System.out.println(output);
// }




//________________________  //QUES 5.______INCOMPLETE_____________________ 
public static void triplet(int arr[]){
  for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
      for(int k=j+1;k<arr.length;k++){
       
          if(arr[i] +  arr[j] +  arr[k] == 0){
            
            System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
          }
        
       

      } 
    }
  }
}
public static void main(String[] args) {
  int arr[]={-1,0,1,2,-1,-4};
  triplet(arr);
}




 }