public class transpose {
 
    public static void printtranspose(int transpose[][]){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(transpose[j][i]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
    
        printtranspose(arr);

    }
}
