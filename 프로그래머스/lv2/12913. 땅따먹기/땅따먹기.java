class Solution {
    int solution(int[][] land) {
        int n = land.length;
        int[][] dp = new int[n][4];
        
        // 첫 번째 행 초기화
        for (int i = 0; i < 4; i++) {
            dp[0][i] = land[0][i];
        }
        
        // 두 번째 행부터 dp 배열 채우기
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                int max = 0;
                for (int k = 0; k < 4; k++) {
                    if (j != k && dp[i-1][k] > max) {
                        max = dp[i-1][k];
                    }
                }
                dp[i][j] = max + land[i][j];
            }
        }
        
        // 마지막 행의 최대값 찾기
        int answer = 0;
        for (int i = 0; i < 4; i++) {
            if (dp[n-1][i] > answer) {
                answer = dp[n-1][i];
            }
        }
        
        return answer;
    }
}