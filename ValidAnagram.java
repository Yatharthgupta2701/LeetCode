// 242. Valid Anagram

import java.util.Arrays;
public class ValidAnagram {

    public static boolean IsValidAnagram(String s, String t){
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1,s2);
    }
    public static void main(String args[]){
        String s = "anagram", t = "nagaram";
        System.out.println(IsValidAnagram(s, t));
    }
}
