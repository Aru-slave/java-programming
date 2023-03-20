import java.util.*;

class Solution {
    public int[] solution(String s) {
        // 문자열을 파싱하여 정수 배열로 변환
        String[] strArr = s.substring(2, s.length()-2).split("\\},\\{");
        int[][] tuple = new int[strArr.length][];
        for (int i = 0; i < tuple.length; i++) {
            String[] nums = strArr[i].split(",");
            tuple[i] = new int[nums.length];
            for (int j = 0; j < tuple[i].length; j++) {
                tuple[i][j] = Integer.parseInt(nums[j]);
            }
        }
        // 튜플의 원소 수를 기준으로 정렬
        Arrays.sort(tuple, (a, b) -> Integer.compare(a.length, b.length));
        // 튜플의 원소들을 순서대로 추가하면서 중복된 원소는 건너뛰기
        Set<Integer> set = new HashSet<>();
        int[] answer = new int[tuple.length];
        int idx = 0;
        for (int[] t : tuple) {
            for (int num : t) {
                if (!set.contains(num)) {
                    set.add(num);
                    answer[idx++] = num;
                }
            }
        }
        return answer;
    }
}