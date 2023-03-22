import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int count = 0;
        for(int i = 0; i < discount.length - 9; i++){
            Map<String,Integer> map = new HashMap<>();
            Set<String> set = new HashSet<>();
            for(int k = i; k < i+10; k++){
                map.put(discount[k], map.getOrDefault(discount[k], 0) + 1);
            }
            for(int j = 0; j < want.length; j++){
                if(map.containsKey(want[j])){
                    if(map.get(want[j]) == number[j]){
                        set.add(want[j]);
                        if(set.size() == want.length){
                            count++;
                        }
                    }
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}
