public class towerofhanoi {
    public static void toh(int n,char from,char torod,char helper){
        if(n==1){
            System.out.println("take disk 1 from rod " + from + " to rod " + torod);
            return;
        }

        toh(n-1,from,helper,torod);
        System.out.println("take disk "+n+" from rod "+from+" to rod "+torod);
        toh(n-1,helper,torod,from);
    }
    public static void main(String[] args) {
        int n=5;
        toh(n,'A','B','C');

    }
}
