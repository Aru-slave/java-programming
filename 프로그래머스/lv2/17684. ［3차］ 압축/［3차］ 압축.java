import java.util.*;

class Solution {
    public int[] solution(String msg) {
        List<Integer> ans = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        int index = 27;
        String str = "";
        for(int i = 0; i < msg.length(); i++){
            str = str + msg.charAt(i);
            if(map.containsKey(str) || str.length() == 1)
                continue;
            else{
                map.put(str,index++);
                String findStr = str.substring(0,str.length()-1);
                if(findStr.length() == 1) ans.add((findStr.charAt(0) - 'A') + 1);
                else ans.add(map.get(findStr));
                i--;
                str = "";
            }
        }
        if(str.length() == 1) ans.add((str.charAt(0) - 'A') + 1);
        else ans.add(map.get(str));
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}