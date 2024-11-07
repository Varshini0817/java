package Practise.Recursion;

public class FibWithFormula {
    public static void main(String[] args) {
        for (int i=0; i<= 10 ; i++){
            System.out.println(fibFormula(i));
        }

        System.out.println("Fibonacci for 50th: "+fibFormula(50));
    }
    public static int fibFormula(int n){

        return (int)((Math.pow(((1+Math.sqrt(5)) /2),n) - Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
      //  return (int) Math.pow(((1+ Math.sqrt(5))/2),n);


    }
}
