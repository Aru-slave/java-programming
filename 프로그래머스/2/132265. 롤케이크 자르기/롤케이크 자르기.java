import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        //1. 왼쪽에서 카운트를 할 경우 토핑의 종류의 개수만 알면 됨. -> Set으로 카운트
        //2. 오른쪽에 남은 토핑의 개수는 종류 별 개수를 알아야 함. ->Map으로 매핑이 필요
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < topping.length; i++)
        {
            if(map.containsKey(topping[i]))
                map.put(topping[i], map.get(topping[i]) + 1);
            else
                map.put(topping[i], 1);
        }
        for(int i = 0; i < topping.length; i++)
        {
            set.add(topping[i]);
            map.put(topping[i], map.get(topping[i]) - 1);
            if(map.get(topping[i]) == 0)
                map.remove(topping[i]);
            if(map.size() == set.size())
                answer++;
        }
        return answer;
    }
}