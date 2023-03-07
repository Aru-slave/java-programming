import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        for(int i = 0; i < tangerine.length; i++){
        map.put(tangerine[i],map.getOrDefault(tangerine[i],0) + 1);
        }
    List<Map.Entry<Integer,Integer>> list = new LinkedList<>(map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());
        for(int i = 0 ; i < map.size(); i++){
            if(k <= sum) return ans;
           sum = sum + list.get(i).getValue();
           ans++; 
            
        }
        return ans;
    }
}