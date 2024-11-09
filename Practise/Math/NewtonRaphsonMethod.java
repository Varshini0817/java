package Practise.Math;

public class NewtonRaphsonMethod {
    //to find sqrt of a number
    public static void main(String[] args) {
        int num = 36;
        System.out.printf("%.4f",sqrt(num));
    }
    public static double sqrt(int num){
        double x = num;
        double root;
        while(true){
            root = 0.5 * (x + (num/x));
            if(Math.abs(root - x) < 0.5){
                break;
            }
            x = root;
        }
        return root;
    }
}
