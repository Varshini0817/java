package BinarySearch;

public class SmallestLetterGTTarget {
    //smallest letter > target
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(letters[mid] > target){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
            // System.out.println(start+" "+end+" "+mid+" ");
        }
        return letters[start%letters.length];
    }

    public static void main(String[] args) {
        char[] letters = {'c','f','g'};
        char target = 'd';
        SmallestLetterGTTarget obj = new SmallestLetterGTTarget();
        System.out.print(obj.nextGreatestLetter(letters, target));
    }
}
