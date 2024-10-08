import java.util.*;

public class NestedSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int empId = sc.nextInt();
        String dept = sc.next();

        switch (empId){
            case 1: System.out.println("One");
                    break;
            case 2: System.out.println("Two");
                    break;
            case 3: System.out.println("Three");
                    switch (dept){
                        case "IT": System.out.println("IT dept");
                                    break;
                        case "CSE": System.out.println("CSE dept");
                                    break;
                        default: System.out.println("Invalid dept");
                    }
                    break;
            default: System.out.println("Invalid empID");
        }
    }
}
