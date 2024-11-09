package Practise.Math;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 36;
        factors1(n);
        System.out.println();
        factors2(n);
        System.out.println();
        factors3(n);
    }
    public static void factors1(int n){
        //method 1 - brute force approach
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }

    public static void factors2(int n){
        //method 2
        //running until sqrt(n) print i and n/i
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                if(n/i == i){
                    System.out.print(i+" ");
                }
                else {
                    System.out.print(i+" "+n/i+" ");
                }
            }
        }
    }

    public static void factors3(int n){
        //method 3 - to print in sorted order
        //running until sqrt(n) print i and n/i
        // take an array list
        // print all i, add n/i to list and next desc order of list elements
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(n/i != i){
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
