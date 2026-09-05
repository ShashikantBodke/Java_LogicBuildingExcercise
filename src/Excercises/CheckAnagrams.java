package Excercises;

import java.util.Arrays;

public class CheckAnagrams {

	public static void main(String[] args) {

		String s1 = "silent";
		String s2 = "listen";

		if (s1.length() == s2.length()) {

			char s1Array[] = s1.toCharArray();
			char s2Array[] = s2.toCharArray();

			Arrays.sort(s1Array);
			Arrays.sort(s2Array);

			if (Arrays.equals(s1Array, s2Array)) {
				System.out.println("Yes you are correct !! It's an anagram");
			}else {
				System.out.println("Nope!!");
			}
		} else {
			System.out.println("Nope !! Not an anagrams");
		}

	}

}
