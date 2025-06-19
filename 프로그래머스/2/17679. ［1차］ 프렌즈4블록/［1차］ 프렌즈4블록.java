import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        char[][] map = new char[m][n];
        
        // 문자열 배열을 문자 2차원 배열로 변환
        for (int i = 0; i < m; i++) {
            map[i] = board[i].toCharArray();
        }

        int answer = 0;
        boolean changed = true;

        while (changed) {
            changed = false;
            boolean[][] toDelete = new boolean[m][n];

            // 1. 2x2 블록 체크
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    char c = map[i][j];
                    if (c == ' ') continue;  // 빈칸이면 skip
                    if (c == map[i][j + 1] &&
                        c == map[i + 1][j] &&
                        c == map[i + 1][j + 1]) {
                        toDelete[i][j] = true;
                        toDelete[i][j + 1] = true;
                        toDelete[i + 1][j] = true;
                        toDelete[i + 1][j + 1] = true;
                        changed = true;
                    }
                }
            }

            // 2. 삭제
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (toDelete[i][j]) {
                        map[i][j] = ' ';
                        answer++;
                    }
                }
            }

            // 3. 중력 (아래로 떨어뜨림)
            for (int j = 0; j < n; j++) {
                for (int i = m - 1; i >= 0; i--) {
                    if (map[i][j] == ' ') {
                        // 위에서 내려올 블록 찾기
                        int k = i - 1;
                        while (k >= 0 && map[k][j] == ' ') {
                            k--;
                        }
                        if (k >= 0) {
                            map[i][j] = map[k][j];
                            map[k][j] = ' ';
                        }
                    }
                }
            }
        }

        return answer;
    }
}
