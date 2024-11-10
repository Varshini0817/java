package Practise.Recursion;

public class CountNoOfZeros {
    public static void main(String[] args) {
        System.out.print(cntOfZeros(51010123));
    }
    public static int cntOfZeros(int n){
        return helper(n,0);
    }

    private static int helper(int n, int cnt) {
        if(n==0){
            return cnt;
        }
        if(n%10 == 0){
            return helper(n/10, cnt+1);
        }
        else {
            return helper(n/10, cnt);
        }
    }

}
