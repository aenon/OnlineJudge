/* 8. String to Integer (atoi)
 */

public class Solution {
  private static final int max_div_10 = Integer.MAX_VALUE / 10;
  public int myAtoi(String str) {
    int i = 0, n = str.length();
    while (i < n && Character.isWhitespace(str.charAt(i))) {
      i++;
    }
    int sign = 1;
    if (i < n && str.charAt(i) == '+') {
      i++;
    } 
    else if (i < n && str.charAt(i) == '-') {
      sign = -1;
      i++;
    }
    int number = 0;
    while (i < n && Character.isDigit(str.charAt(i))) {
      int digit = Character.getNumericValue(str.charAt(i));
      if (number > max_div_10 || (number == max_div_10 && digit >= 8)) {
        return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }
      number = number * 10 + digit;
      i++;
    }
    return sign * number;
  }
}
