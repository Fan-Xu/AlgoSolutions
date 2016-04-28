/*
 * After robbing those houses on that street, the thief has found himself a new place for his thievery so that he will not get too much attention. This time, all houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, the security system for these houses remain the same as for those in the previous street.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

 Notice

This is an extension of House Robber.

Example
nums = [3,6,4], return 6
 */
public class HouseRobberII {

    /**
     * @param nums: An array of non-negative integers.
     * return: The maximum amount of money you can rob tonight
     */
    public int houseRobber2(int[] nums) {
        int sum0 = rob(nums, 0, nums.length - 2);
        int sum1 = rob(nums, 1, nums.length - 1);
        return Math.max(sum0, sum1);
    }

    public int rob(int[] nums, int start, int end) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length + 1];
        if (start < nums.length) {
            dp[start + 1] = nums[start];
        }
        for (int i = start + 1; i <= end; ++i) {
            dp[i + 1] = Math.max(dp[i], dp[i - 1] + nums[i]);
        }
        return dp[nums.length];
    } 

}
