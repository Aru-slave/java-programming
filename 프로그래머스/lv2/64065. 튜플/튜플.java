import java.util.*;

class Solution {
    public int[] solution(String s) {
        // 문자열을 파싱하여 정수 배열로 변환
        String[] strArr = s.substring(2, s.length()-2).split("\\},\\{");
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            String[] nums = strArr[i].split(",");
            List<Integer> tuple = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
            tuple.add(Integer.parseInt(nums[j]));
            list.add(tuple);
        }
        }
        // 튜플의 원소 수를 기준으로 정렬
        Collections.sort(list,(a,b) -> a.toString().length() - b.toString().length());
        // 튜플의 원소들을 순서대로 추가하면서 중복된 원소는 건너뛰기
        Set<Integer> set = new HashSet<>();
        int[] answer = new int[list.get(list.size() - 1).size()];
        int index = 0;
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.get(i).size(); j++){
                if(set.add(list.get(i).get(j)))
                    answer[index++] = list.get(i).get(j);
            }
        }
        return answer;
    }
}
