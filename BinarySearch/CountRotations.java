package BinarySearch;

public class CountRotations {

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int cnt = findPivot(arr)+1;
        System.out.print("The count of rotations: "+cnt);
    }
    static int findPivot(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases
            //case 1 : arr[mid] > arr[mid + 1] --> 7 > 0  (mid < end to compare with mid + 1
            //starting another asc order so , mid becomes the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) return mid;
            //case 2: arr[mid-1] > arr[mid] --> 7 > 6 (mid > start to compare with start
            //if previous num > present num desc order , mid - 1 is largest(pivot)
            if (mid > start && arr[mid - 1] > arr[mid]) return mid - 1;
            //case 3: arr[start] => arr[mid] --> 8 > 7 we need not check the right side so make e = m-1
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
                //case 4: leaving the left array s = m+1
                //in these cases even if we leave mid , we can encounter pivot in first 2 cases
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
