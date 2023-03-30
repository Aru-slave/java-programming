class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int start = 1; // 시작 아파트
        int idx = 0; // 기지국이 설치된 아파트 배열의 인덱스
        
        while (start <= n) { // 모든 아파트를 돌 때까지
            if (idx < stations.length && start >= stations[idx] - w) { // 현재 아파트가 기지국이 설치된 범위 내에 있으면
                start = stations[idx] + w + 1; // 다음으로 검사할 아파트는 기지국의 오른쪽 끝부터 +1 한 값
                idx++; // 다음 기지국으로
            } else { // 아파트가 기지국의 범위에 속하지 않으면
                start += 2 * w + 1; // 기지국의 왼쪽, 오른쪽으로 W 만큼 떨어진 곳에 기지국을 설치하면 전파를 받을 수 있음
                answer++; // 기지국을 설치
            }
        }
        return answer;
    }
}