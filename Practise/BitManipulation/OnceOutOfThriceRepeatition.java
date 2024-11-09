package Practise.BitManipulation;

public class OnceOutOfThriceRepeatition {
    public static void main(String[] args) {
        int arr[] = { 2,2,3,2,7,7,8,7,8,8};
        System.out.println(findNum(arr)%3);
    }

    private static int findNum(int[] arr) {
        int sum = 0;
        for(int num: arr){
            int ans = Integer.parseInt(Integer.toBinaryString(num));
            sum += ans;
        }
        int res = 0,i=0 ;
        while(sum>0){
            int dig = sum&1;
            System.out.print(" dig "+dig);
            res += Math.pow(2,i) *dig%3;
            System.out.print(" res "+res);
            i++;
            sum=sum>>1;
        }
        return res;
    }
}
