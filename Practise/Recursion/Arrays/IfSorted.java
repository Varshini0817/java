package Practise.Recursion.Arrays;

public class IfSorted {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5,64,7};
        System.out.print(ifSorted(arr,0));
    }
    public static boolean ifSorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index]<=arr[index+1] && ifSorted(arr,index+1);
    }
}
