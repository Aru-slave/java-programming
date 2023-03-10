import java.util.*;

class Solution {
    public int[] solution(String msg) {
        List<Integer> ans = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        int index = 27;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < msg.length(); i++){
            sb.append(msg.charAt(i));
            if(map.containsKey(sb.toString()) || sb.length() == 1)
                continue;
            else{
                map.put(sb.toString(),index++);
                String findStr = sb.substring(0,sb.length()-1);
                if(findStr.length() == 1) ans.add((findStr.charAt(0) - 'A') + 1);
                else ans.add(map.get(findStr));
                sb = new StringBuilder();
                i--;
            }
        }
        if(sb.length() == 1) ans.add((sb.charAt(0) - 'A') + 1);
        else ans.add(map.get(sb.toString()));
        return ans.stream().mapToInt(Integer::intValue).toArray();
        
    }
}