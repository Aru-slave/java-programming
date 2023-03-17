class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int m = arr1.length;    // arr1의 행 개수
        int n = arr2[0].length; // arr2의 열 개수
        int[][] answer = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < arr1[i].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        return answer;
    }
}