public class diagonalsum {
    public static int diagonalsum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            //primary diagonal formula
            sum+=matrix[i][i];

            //secondary diagonal formula

            //as i+j=n-1 
            //therefore j=n-i-1

            if(i!=matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=diagonalsum(arr);
        System.out.println(sum);
    }   
}
