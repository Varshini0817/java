package Practise.Recursion;

// RECURSION - A function calling itself
public class MessageModify {
    // DRY -> Do Not Repeat Yourself
    // let's remove the repeated lines and adjust the code accordingly
    public static void main(String[] args) {
        message(1);
    }
    public static void message(int n) {
        System.out.println("Hello World!");
        if (n == 5) {
            return;
        }
        message(n + 1);
    }
}
