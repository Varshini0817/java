package Practise.Recursion.Arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,2,34,56,0};
        //int t1 = 78;//false -1 -1 []
        //int t2 = 0; //true 5 5 [5]
        int t = 2;//true 1 2 [1,2]
        System.out.println(linearSearch(arr,t,0));
        System.out.println(linearSearchInd(arr,t,0));
        System.out.println(linearSearchIndBack(arr,t,arr.length-1));
        linearSearchAllInd(arr,t,0);
        System.out.println(list);
    }
    //if to check it is present
    public static boolean linearSearch(int[] arr, int t,int i){
        if(arr.length == i){ // it is not arr.length-1 as it needs to check even with the last element
            return false;
        }
        return arr[i] == t || linearSearch(arr, t,i+1);
    }
    //to get the index value of that number
    public static int linearSearchInd(int[] arr, int t,int i){
        if(arr.length == i){ // it is not arr.length-1 as it needs to check even with the last element
            return -1;
        }
        if(arr[i] == t){
            return i;
        }
        else {
            return linearSearchInd(arr, t,i+1);
        }
    }
    //to traverse from reverse
    public static int linearSearchIndBack(int[] arr, int t,int i){
        if(-1 == i){ // it is not arr.length-1 as it needs to check even with the last element
            return -1;
        }
        if(arr[i] == t){
            return i;
        }
        else {
            return linearSearchIndBack(arr, t,i-1);
        }
    }

    //if there are multiple occurrences of the target, return all indices
    static ArrayList<Integer> list = new ArrayList<>();
    public static void linearSearchAllInd(int[] arr, int t, int i){
        if(arr.length == i){ // it is not arr.length-1 as it needs to check even with the last element
            return ;
        }
        if(arr[i] == t){
            list.add(i);
        }
        linearSearchAllInd(arr, t,i+1);

    }
}
