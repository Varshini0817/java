package Practise.BitManipulation;

public class OnlyOnceOutOfTwice {
    public static void main(String[] args) {
        // all twice numbers become zero leaving the num which is present once
        // a^a = 0
        // 0 ^ a = a
        int arr[] = {2,3,2,4,5,6,4,3,5};
        int ans = 0;
        for(int num: arr){
            ans^=num;
        }
        System.out.println(ans);
    }

}
