package LC;

import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueCharacter {
        public int firstUniqChar(String s) {
            HashMap<Character, Integer> cnt = new HashMap();
            for(char c: s.toCharArray()){
                cnt.put(c, cnt.getOrDefault(c,0)+1);
            }
            for(int i=0; i<s.length(); i++){
                if(cnt.get(s.charAt(i)) == 1) {
                    System.out.print(s.charAt(i) + "-> char ");
                    return i;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        FirstUniqueCharacter obj = new FirstUniqueCharacter();
        System.out.print("Index is: "+obj.firstUniqChar(s));
        }
}
