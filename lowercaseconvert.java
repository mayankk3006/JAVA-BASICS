public class lowercaseconvert {
    public static String tolowercase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toLowerCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&&i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }                                                          

        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str="Hi Mayank";
        String result=tolowercase(str);
        System.out.println(result);
        String str1="mayank";
        String str2="saket";
        String str3="mayank";
        String str4="ApnaCollege".replace("l","");
        System.out.println(str1.equals(str2) +" "+str1.equals(str3));
        System.out.println(str4);
    }
    
}
