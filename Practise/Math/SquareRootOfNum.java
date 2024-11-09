package Practise.Math;

public class SquareRootOfNum {
    public static void main(String[] args) {
        int num = 40 , p=3;
        System.out.printf("%.3f",sqrt(num,p));
    }
    public static double sqrt(int num,int p){
        int s = 0, e = num;
        double ans = 0.0;
        while(s<=e)
        {
            int m = s+ (e-s)/2;
            if (m * m == num) {
                return m;
            } else if (m * m > num) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
       ans  = e;
        // to get decimal points
        double incr = 0.1;
        for(int i=0; i<p;i++){
            while (ans * ans<=num) {
                ans+=incr;
            }
            ans-=incr;
            incr/=10;
        }
        return ans;
    }
}
