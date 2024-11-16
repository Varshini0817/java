package Practise.Recursion.Strings.Permutations;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        int target = 4;
        dice("",target);
        System.out.println("\n"+diceRet("",target));
        int face = 7;
        int target1 = 6;
        dice("",target1,face);
        System.out.print("\n"+diceRet("",target1,face));


    }
    public static void dice(String p, int target){
        if(target == 0){
            System.out.print(p+" ");
            return;
        }
        for(int i=1; i<=6 && i<= target; i++){
            dice(p+i, target-i);
        }
    }

    public static ArrayList<String> diceRet(String p , int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=1; i<=6 && i<= target; i++){
            list.addAll(diceRet(p+i,target-i));
        }
        return list;
    }

    //Dice with custom number of faces
    public static void dice(String p, int target,int face){
        if(target == 0){
            System.out.print(p+" ");
            return;
        }
        for(int i=1; i<=face && i<= target; i++){
            dice(p+i, target-i,face);
        }
    }

    public static ArrayList<String> diceRet(String p , int target, int face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=1; i<=face && i<= target; i++){
            list.addAll(diceRet(p+i,target-i,face));
        }
        return list;
    }
}
