package Practise.Strings;

import java.util.Arrays;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        //without creating new objects, it concatenates
        for(int i=0; i<26; i++){
            char ch = (char) ('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println("Methods: ");
        System.out.println(builder.reverse());
        System.out.println(builder);
        System.out.println(builder.indexOf("z"));
        builder.append("zyq");
        System.out.println(builder);
        System.out.println(builder.lastIndexOf("z"));

        System.out.println("String methods: ");
        String name = "Veda Varshini";
        System.out.println(Arrays.toString(name.toCharArray()));
    }
}
