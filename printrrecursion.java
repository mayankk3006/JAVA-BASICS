public class printrrecursion {
    public static void print(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            print(r,c+1);
            System.out.print("*");
            
            
        }
        else{
            
            print(r-1, 0);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(4,0);
    }
}
