package Practise.Recursion.Arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {5,6,7,8,9,1,2,3};
        int[] arr3 = {5,6,7,1,2,3};
        int[] arr4 = {5,1,2,3};
        System.out.print("Array 1: ");
        for(int num: arr1){
            System.out.print(rbs(arr1,num,0, arr1.length-1)+ " ");
        }
        System.out.print("\n"+"Array 2: ");
        for(int num: arr2){
            System.out.print(rbs(arr2,num,0, arr2.length-1)+ " ");
        }
        System.out.print("\n"+"Array 3: ");
        for(int num: arr3){
            System.out.print(rbs(arr3,num,0, arr3.length-1)+ " ");
        }
        System.out.print("\n"+"Array 4: ");
        for(int num: arr4){
            System.out.print(rbs(arr4,num,0, arr4.length-1)+ " ");
        }
    }
    public static int rbs(int[] arr, int t,int s, int e){
        int m = s +(e-s)/2;
        if(t == arr[m]){
            return m;
        }
        if(e<=s){
            return -1;
        }
        if(arr[s] <= arr[m]){
            if(t >= arr[s] && t < arr[m]){
                //e = m-1;
                return rbs(arr,t,s,m-1);
            }
            else{
                //s=m+1;
                return rbs(arr,t,m+1, e);
            }
        }
        else{
            if(t > arr[m] && t >= arr[s]){
                return rbs(arr, t, s, m-1);
            }
            else {
                return rbs(arr ,t, m+1, e);
            }
        }
    }
}
