package Practise.Strings;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = null;//true
        String str1 = "abba"; //true
        String str2 = "abcba"; //true
        String str3 = "abda"; //false

        if(isPalindrome(str)){
            System.out.print("Palindrome!");
        }
        else{
            System.out.print("Not a palindrome!");
        }
    }
    public static boolean isPalindrome(String str){
        if(str == null || str.length() == 0){
            return true;
        }
            int start = 0, end = str.length()-1;
            while(start<=end){
                if(str.charAt(start) != str.charAt(end)){
                    return false;
                }
                else{
                    start++;
                    end--;
                }
            }
            return true;
        }
}

