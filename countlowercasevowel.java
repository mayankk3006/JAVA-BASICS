public class countlowercasevowel {
    public static int countlowercasevowel(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(isVowel(str.charAt(i))){
                count++;
                

            }
        }
        return count;
    }

    
    public static boolean isVowel(char ch)
    {
        
        return (ch=='a' || ch=='e' || ch=='i' ||
                           ch=='o' || ch=='u');
    }
public static void main(String[] args) {
    String str="aeiouU";
    int result =countlowercasevowel(str);
    System.out.println(result);
}
   
    
}
