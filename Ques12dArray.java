public class Ques12dArray {

    //print the no 0f 7 in 2D Array 

    public static void main(String[] args) {
        int count=0;
        int key=7;
        int arr[][]={{1,2,3},{2,7,7}};
        for(int i=0;i<arr.length;i++ ){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    count++;
                }
            }
           
        }
        System.out.println(count);
}
}
