/*
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given an encoded message containing digits, determine the total number of ways to decode it.

Example
Given encoded message 12, it could be decoded as AB (1 2) or L (12).
The number of ways decoding 12 is 2.
 */
public class DecodeWays {

    /**
     * @param s a string,  encoded message
     * @return an integer, the number of ways decoding
     */
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= s.length(); ++i) {
            dp[i] += dp[i - 1];
            if (i > 1 && '0' <= s.charAt(i - 1) && s.charAt(i - 1) <= '6' && (s.charAt(i - 2) == '1' || s.charAt(i - 2) == '2')) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[s.length()];
    }

}
