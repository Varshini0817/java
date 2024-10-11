package Assignment_3.Intermediate;

public class PlayDays {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i<=31 ;i++ ){
            if(i % 2 == 0){
                sum++;
            }
        }
        System.out.print("Number of even days (August): "+sum);
    }
}
