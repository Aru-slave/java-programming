import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Map<String, Integer> cache = new LinkedHashMap<String, Integer>(cacheSize, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > cacheSize;
            }
        };
        for (String city : cities) {
            city = city.toLowerCase();
            if (cache.containsKey(city)) {
                answer += 1;
            } else {
                answer += 5;
            }
            cache.put(city, 0);
        }
        return answer;
    }
}