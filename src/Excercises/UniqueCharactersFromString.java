package Excercises;

import java.util.LinkedHashSet;

public class UniqueCharactersFromString {
    public static void main(String[] args) {

        String input = "aabbccddeeffgg";
        char[] inputCharArray = input.toCharArray();

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder sb=new StringBuilder();
        for (char c : inputCharArray) {
            if(set.add(c)){
                sb.append(c);
            }
        }
        System.out.println(set);
        System.out.println(sb);

    }
}
