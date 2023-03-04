import java.util.ArrayList;

public class monotonic {
    public static boolean monotonicarray(ArrayList<Integer>num){
        boolean inc=true;
        boolean dec=true;

        for(int i=0;i<num.size()-1;i++){
            
                if(num.get(i)<num.get(i+1)){
                    dec= false;
                }
                if(num.get(i)>num.get(i+1)){
                    inc= false;
        }
        
    }
    return inc||dec;
}
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.add(6);

        list.add(5);
        System.out.println(monotonicarray(list));
        
    }
}
