package Practise.Recursion.Permutations;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        permutations("",str);
        System.out.println("\n"+permutationsRet("",str));
        System.out.println(permutationsCnt("",str));
    }
    //return type void
    public static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);

        for(int i=0; i<p.length()+1; i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutations(f+ch+s, up.substring(1));
        }
    }

    //return type list
    public static ArrayList<String> permutationsRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<p.length()+1; i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationsRet(f+ch+s, up.substring(1)));
        }
        return ans;
    }


    //return the count of the permutations
    public static int permutationsCnt(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch = up.charAt(0);

        int count = 0;
        for(int i=0; i<p.length()+1; i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count + permutationsCnt(f+ch+s, up.substring(1));
        }
        return count;
    }
}
