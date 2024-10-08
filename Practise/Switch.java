package Practise;

import java.util.*;

public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       // String fruit = sc.next();

//        switch(fruit){
//            case "Apple":   System.out.print("Red fruit");
//                            break;
//            case "Mango":   System.out.print("Yellow fruit");
//                            break;
//            case "Orange":  System.out.print("Orange fruit");
//                            break;
//            default: System.out.print("Invalid fruit");
//        }

        //Advanced Practise.Switch statement
//        switch(fruit){
//            case "Apple"  ->  System.out.print("Red fruit");
//            case "Mango"  ->  System.out.print("Yellow fruit");
//            case "Orange" -> System.out.print("Orange fruit");
//            default-> System.out.print("Invalid fruit");
//        }

        int day = sc.nextInt();
//        switch(day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.print("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.print("Weekend");
//                break;
//            default:System.out.print("Invalid day");
//        }

        switch(day){
            case 1,2,3,4,5 -> System.out.print("Weekday");
            case 6,7-> System.out.print("Weekend");
            default->System.out.print("Invalid day");
        }
    }
}
