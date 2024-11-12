package Practise.Recursion.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequenceAscii {
    public static void main(String[] args){
        String str = "abc";
        subSeqAscii("",str);

        System.out.println("\n"+subSeqAsciiRet("",str));
    }
    public static void subSeqAscii(String p, String u){
        if(u.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = u.charAt(0);
        subSeqAscii(p+ch, u.substring(1));
        subSeqAscii(p+(ch+0), u.substring(1));
        subSeqAscii(p, u.substring(1));
    }

    public static ArrayList<String> subSeqAsciiRet(String p, String u){
        if(u.isEmpty()){
            ArrayList<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }
        char ch = u.charAt(0);
        ArrayList<String> first = subSeqAsciiRet(p+ch, u.substring(1));
        ArrayList<String> second = subSeqAsciiRet(p+(ch+0), u.substring(1));
        ArrayList<String> third = subSeqAsciiRet(p, u.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }

}
