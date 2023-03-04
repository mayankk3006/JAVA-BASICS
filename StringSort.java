public class StringSort {
   public static String[] sort(String[] str,int beg,int end){
    if(beg==end){
        String[] A={str[beg]};
        return A;
    }
    int mid=beg+(end-beg)/2;
    String[] arr=sort(str, beg, mid);
    String[] srr=sort(str,mid+1, end);
    String[] mrr=merge(arr,srr);
    return mrr;

   } 
   public static String[] merge(String arr[],String[] srr){
    int m=arr.length;
    int n=srr.length;
    String[] mrr=new String[m+n];
    int idx=0;
    int i=0;
    int j=0;
    
    while(i<m && j<n){
        if(arr[i].compareTo(srr[j])<0){
            mrr[idx++]=arr[i++];
            
        }
        else{
            mrr[idx++]=srr[j++];
        }
    }
    while(i<m){
        mrr[idx++]=arr[i++];
    }
    while(j<n){
        mrr[idx++]=srr[j++];
    }

    return mrr;
   }


public static void main(String[] args) {
    String[] str={"mango","apple","banana","ample"};
    String[] temp=sort(str, 0, str.length-1);
    for(int i=0;i<temp.length;i++){
        System.out.println(temp[i]);
    }
}
}
