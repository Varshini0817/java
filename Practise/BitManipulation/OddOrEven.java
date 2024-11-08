package Practise.BitManipulation;

public class OddOrEven {
    public static void main(String[] args) {
        // eg : 10 --> 1010 if you '&' last digit with 1 you'll get the last digit of that num
        // by that we can say if it is even(if 0) or odd(if 1)
        int num = 48;
        System.out.println("Prints true for even and false for odd");
        System.out.println(num+" "+ ((num&1)==1));
        for(int i=0 ; i<=11; i++){
            System.out.println(i + " "+ ((i & 1) == 1));
        }
    }

}
