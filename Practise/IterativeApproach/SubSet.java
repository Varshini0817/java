package Practise.IterativeApproach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet{
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        List<List<Integer>> res = subset(arr);
        for(List<Integer> list : res){
            System.out.print(list+" ");
        }

        int [] arr2 = {1,2,2};
        List<List<Integer>> ans = subsetDuplicate(arr2);
        for(List<Integer> list : ans){
            System.out.print("\n"+list+" ");
        }

    }
    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num: arr){
            int n =outer.size();
            for(int i=0; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    public static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start =0, end =0;

        for(int i=0; i<arr.length; i++){
            start =0;
            int n =outer.size();

            if(i>0 && arr[i] == arr[i-1]){
                start = end +1;
            }
            end = outer.size()-1;
            for(int j= start; j<n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
