package Practise.Recursion.Strings.Permutations;

public class Dice {
    public static void main(String[] args) {
        dice("",4);
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
}
