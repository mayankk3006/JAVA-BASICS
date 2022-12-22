public class stringpallindrome {
    public static boolean pallindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        boolean result=pallindrome(str);
        System.out.println(result);
    }
    
}
