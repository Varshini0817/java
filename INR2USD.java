import java.util.*;

public class INR2USD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float rs = sc.nextFloat();
        // Conversion from INR to USD
        float usd = rs * 0.0119f;

        // Rounding to 4 decimal places
        usd = Math.round(usd * 10000f) / 10000f;

        System.out.println("USD: $" + usd);
    }
}
