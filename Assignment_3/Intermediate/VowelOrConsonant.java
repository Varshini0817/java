package Assignment_3.Intermediate;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        //Checking if it is a valid character (letter) and an input of length 1
        if(ch.length()==1 && Character.isLetter(ch.charAt(0))) {
            //handling lower & upper case
            String ch1 = ch.toLowerCase();
            //get 1st letter
            char ch2 = ch1.charAt(0);
            if (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u') {
                System.out.print("Vowel");
            } else {
                System.out.print("Consonant");
            }
        }
        else{
                System.out.print("Invalid character");
            }
        }
    }
