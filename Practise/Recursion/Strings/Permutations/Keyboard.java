package Practise.Recursion.Strings.Permutations;
import java.util.ArrayList;
//Leetcode 17
//  1   2   3
//  -  abc  def
//  4   5   6
//ghi   jkl  mno
//  7   8   9
//pqrs  tuv wxyz
public class Keyboard {
    public static void main(String[] args) {
        String str = "";
        keyboard("",str);
        System.out.print(keyboardRet("",str));
    }
    public static void keyboard(String p, String up){
        if(up.isEmpty() ){
            System.out.print(p+" ");
            return;
        }

        int digit = up.charAt(0)-'0';
        if(digit!=1) {
            int start,end;
            if(digit < 7){
                start = (digit - 2) * 3;
                end = (digit - 1) * 3;
            }
            else if(digit == 7){
                start = (digit - 2) * 3;
                end =  (digit - 1) * 3+1;
            }
            else if(digit == 8){
                start = (digit - 2) * 3 + 1;
                end = (digit - 1) * 3+1;
            }
            else{
                start = (digit-2)*3+1;
                end = (digit-1)*3+2;
            }
            for (int i = start; i < end; i++) {
                char ch = (char) ('a' + i);
                keyboard(p + ch, up.substring(1));
            }
        }
        else{
            keyboard(p , up.substring(1));
        }
    }

    public static ArrayList<String> keyboardRet(String p, String up){
        if(up.isEmpty() ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0)-'0';
        ArrayList<String> ans = new ArrayList<>();
        if(digit!=1) {
            int start,end;
            if(digit < 7){
                start = (digit - 2) * 3;
                end = (digit - 1) * 3;
            }
            else if(digit == 7){
                start = (digit - 2) * 3;
                end =  (digit - 1) * 3+1;
            }
            else if(digit == 8){
                start = (digit - 2) * 3 + 1;
                end = (digit - 1) * 3+1;
            }
            else {
                start = (digit-2)*3+1;
                end = (digit-1)*3+2;
            }
            for (int i = start; i < end; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(keyboardRet(p + ch, up.substring(1)));
            }
        }
        else{
            ans.addAll(keyboardRet(p , up.substring(1)));
        }
        return ans;
    }
}
