package Practise.Recursion.Strings;
import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        subseq("","abc");
        ArrayList<String> ans = subseqRet("", "abc");
        System.out.println("\n"+ans);
    }
    public static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        //add the element
        subseq(p+ch, up.substring(1)); // strings are immutable
        //up.substring is not changing up but creating a new object
        subseq(p,up.substring(1));//ignore the element
    }

    public static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subseqRet(p+ch, up.substring(1));//add
        ArrayList<String> right= subseqRet(p,up.substring(1));//ignore

        left.addAll(right);
        return left;
    }
}
