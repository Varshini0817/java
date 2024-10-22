package BinarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        System.out.print(splitArray(arr,k ));
    }
    public static  int splitArray(int[] nums, int k) {
        int start = 0, end = 0;
        for(int num: nums){
            start = Math.max(start, num);
            end+=num;
        }
        //System.out.println("Start: "+start+" End: "+end);
        while(start<end){
           int mid = start + (end - start)/2;
           //System.out.println(" "+mid+" "+"Start: "+start+" End: "+end);
           int pieces = 1,sum=0;
           for(int num:nums){
               if(sum+num > mid) {
                   pieces++;
                   sum = num;
               }else{
                   sum+=num;
               }
           }
           if(pieces>k){
               start = mid+1;
           }
           else {
               end = mid;
           }
        }
        return start;//start = mid = end
    }

}
