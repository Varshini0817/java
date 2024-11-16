package Practise.Recursion.Strings;

public class SkipALetter {
    public static void main(String[] args) {
        String str = "bcaddessad";
        //initially process string is empty
        skip("",str);
        //if the return type is empty
        System.out.println(skipRT(str));
    }
    //return type is empty
    public static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1));
        }
        else {
            skip(p+ch, up.substring(1));
        }
    }

    public static String skipRT( String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
           return skipRT(up.substring(1));
        }
        else {
            return ch+skipRT(up.substring(1));
        }
    }
}
