/*
 *
 */
public class ClimbingStairs {

    // TLE
    public int climbStairs(int n) {
        if (n == 0 || n == 1)
            return 1;
        return climbStairs(n - 2) + climbStairs(n - 1);
    }

}
