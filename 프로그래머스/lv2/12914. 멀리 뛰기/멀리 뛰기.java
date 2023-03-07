class Solution {
    public long solution(int n) {
        //f(1) = 1;
        //f(2) = 2;
        //f(3) = 3;
        //f(4) = 5;
        //f(n) = f(n-1) + f(n-2);
    long[] dp = new long[n + 1];
    dp[0] = 1;
    dp[1] = 1;

        for (int i = 2; i <= n; i++)
	dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;

return dp[n];
}
}