import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str="throw";
        String str1="worth";


        str=str.toLowerCase();
        str1=str1.toLowerCase();

        if(str.length()==str1.length()){
            char[] strCharArray=str.toCharArray();
            char[] str1CharArray=str1.toCharArray();

            Arrays.sort(strCharArray);
            Arrays.sort(str1CharArray);

            boolean result=Arrays.equals(strCharArray,str1CharArray);

            if(result){
                System.out.println("it is an anagram");
            }

            else{
                System.out.println("it is not an anagram");
            }

            
            

        }
        else{
            System.out.println("it is not an anagram");
        }
    }
    
}
