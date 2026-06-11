package arrays;
/*
242. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.   
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 */
class AnagramSolution {
    public boolean isAnagram(String s, String t) {

       if(s.length()!=t.length()){
        return false;
       }

       int[] charCounts = new int[26];

       for(int i=0; i<s.length(); i++){
        charCounts[s.charAt(i)-'a']++;
        charCounts[t.charAt(i)-'a']--;
       }

       for(int count:charCounts){
        if(count!=0){
            return false;
        }
       }
       return true;
    }
}

public class ValidAnagram {
    public static void main(String[] args) {
        AnagramSolution solution = new AnagramSolution();
        String s = "anagram";
        String t = "nagaram";
        boolean result = solution.isAnagram(s, t);
        System.out.println("Is Anagram: " + result);
    }
}