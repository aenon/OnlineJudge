/* 3. Longest Substring without Repeating Characters
 * O(n) time, O(1) space - two iterations
 */

public class Solution {
  public int lengthOfLongestSubstring(String s) {
    boolean[] exist = new boolean[256];
    int i = 0, maxLen = 0;
    for (int j = 0; j < s.length(); j++) {
      while (exist[s.charAt(j)]) {
        exist[s.charAt(i)] = false;
        i++;
      }
      exist[s.charAt(j)] = true;
      maxLen = Math.max(j - i + 1, maxLen);
    }
  return maxLen;
  }
}