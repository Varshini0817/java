package Practise.BitManipulation;

public class APowerB {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println(apowerb(a,b));
    }

    private static int apowerb(int base, int power) {
        int ans = 1;
        while(power>0){
            if((power&1) != 0){
                ans = ans*base;
            }
            power=power>>1;
            base *=base; // every set bit is a power of 2
            // like we need to square the base
        }
        return ans;
    }
}
