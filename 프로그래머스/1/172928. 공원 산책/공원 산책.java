class Solution {
    public int[] solution(String[] park, String[] routes) {
        int startX = 0;
        int startY = 0;

        // 시작 위치 찾기
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    startX = i;
                    startY = j;
                }
            }
        }

        // 방향 설정 (N, S, W, E)
        int[][] directions = {
            {-1, 0}, // N
            {1, 0},  // S
            {0, -1}, // W
            {0, 1}   // E
        };

        for (String route : routes) {
            String[] parts = route.split(" ");
            String op = parts[0];
            int steps = Integer.parseInt(parts[1]);

            int dx = 0, dy = 0;
            switch (op) {
                case "N": dx = directions[0][0]; dy = directions[0][1]; break;
                case "S": dx = directions[1][0]; dy = directions[1][1]; break;
                case "W": dx = directions[2][0]; dy = directions[2][1]; break;
                case "E": dx = directions[3][0]; dy = directions[3][1]; break;
            }

            int nx = startX, ny = startY;
            boolean validMove = true;

            for (int i = 0; i < steps; i++) {
                nx += dx;
                ny += dy;

                if (nx < 0 || nx >= park.length || ny < 0 || ny >= park[0].length() || park[nx].charAt(ny) == 'X') {
                    validMove = false;
                    break;
                }
            }

            if (validMove) {
                startX = nx;
                startY = ny;
            }
        }

        return new int[]{startX, startY};
    }
}