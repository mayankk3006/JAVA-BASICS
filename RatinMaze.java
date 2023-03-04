public class RatinMaze {
    public static boolean rat(int arr[][]){
      int N=arr.length;
      int sol[][]=new int[N][N];
      for(int i=0;i<sol.length;i++){
        for(int j=0;j<sol.length;j++){
            sol[i][j]=0;
        }
      }
      

    
        
    }
    public static boolean ratutil(int arr[][],int x,int y,int sol[][]){
        //base case
        if(x==arr.length-1 && y==arr.length-1 && arr[x][y]==1){
            sol[x][y]=1;
            return true;

        }
        ratutil(arr, x, y, sol);
        ratutil(arr, x, y, sol);


    }
    public static boolean issafe(int arr[][],int x,int y){
        return(x>=0 && x<arr.length && y>=0 && y<arr.length && arr[x][y]==1);
    }

    public static void print(int sol[][]){
        for(int i=0;i<sol.length;i++){
            for(int j=0;j<sol.length;j++){
                System.out.print(" "+sol[i]+" ");
            }
            System.out.println();
        }
    }
    
}
