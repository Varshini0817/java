package Practise.Recursion.Strings;

public class SkipAString {
    public static void main(String[] args) {
        System.out.println(skip("bcadssapplelk"));
        System.out.println(skipAppNotApple("bacappdssapplelk"));
    }
    public static String skip(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("apple")){
            //01234 apple , so next one starts with 5
            return skip(str.substring(5));
        }
        else {
            char ch = str.charAt(0);
            return ch+skip(str.substring(1));
        }
    }

    public static String skipAppNotApple(String str){
        if(str.isEmpty()){
            return "";
        }

        if( str.startsWith("app") && !str.startsWith("apple")){
            //012 app , so next one starts with 3
            return skipAppNotApple(str.substring(3));
        }
        else {
            char ch = str.charAt(0);
            return ch+skipAppNotApple(str.substring(1));
        }
    }
}
