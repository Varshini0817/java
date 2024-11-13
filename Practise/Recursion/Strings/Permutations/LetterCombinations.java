package Practise.Recursion.Strings.Permutations;

import java.util.ArrayList;

//  1   2   3
//abc  def ghi
//  4   5   6
//jkl  mno  pqr
//  7   8   9
//stu   vwx yz
public class LetterCombinations {
    public static void main(String[] args) {
        String str = "12";
        combi("", str);

        System.out.print("\n" + combiRet("", str));
        System.out.print("\n" + combiCount("", str));
    }

    public static void combi(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        int digit = up.charAt(0) - '0'; // converts the string to int ('1' to 1)

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            if (i != 26) {
                combi(p + ch, up.substring(1));
            }
        }
    }


    //return type is a list
    public static ArrayList<String> combiRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0'; // converts the string to int ('1' to 1)

        ArrayList<String> ans = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            if (i != 26) {
                ans.addAll(combiRet(p + ch, up.substring(1)));
            }
        }
        return ans;
    }

    //return the count
    public static int combiCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int digit = up.charAt(0) - '0'; // converts the string to int ('1' to 1)

        int count = 0;
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            if (i != 26) {
                count = count+combiCount(p + ch, up.substring(1));
            }
        }
        return count;
    }
}
