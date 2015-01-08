/**
Given a string, find the length of the longest substring without repeating characters. For example, 
the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" 
the longest substring is "b", with the length of 1.
*/
public class LongestNonRepeatingSubstring {
    public int lengthOfLongestSubstring(String s) {
            if (s == null)
                return 0;

            Map<Integer, Integer> dictionary = new HashMap<Integer, Integer>();

            int max = 0;
            int length = 0;

            for (int i = 0; i < s.length(); i++) {
                length++;
                //If found repeating character, check if the character is in the current substring.
                if (dictionary.containsKey(s.codePointAt(i))&&length>(i-dictionary.get(s.codePointAt(i))))
                    length =i - dictionary.get(s.codePointAt(i));
                //Get the longest substring.            
                max = Math.max(length, max);
                dictionary.put(s.codePointAt(i), i);
            }

            return max;
    }
}