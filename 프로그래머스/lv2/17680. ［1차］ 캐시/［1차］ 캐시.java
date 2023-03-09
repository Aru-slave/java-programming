 public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> cache = new LinkedList<String>();
        for (String city : cities) {
            city = city.toLowerCase();
            if (cache.contains(city)) {
                cache.remove(city);
                cache.add(city);
                answer += 1;
            } else {
                if (cache.size() >= cacheSize) {
                    cache.poll();
                }
                if (cacheSize > 0) {
                    cache.add(city);
                }
                answer += 5;
            }
        }
        return answer;
    }
import java.util.*;

class Solution {
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if (cacheSize == 0) return cities.length * 5;
        
        Queue<String> cache = new LinkedList<>();
        for (String city : cities) {
            city = city.toLowerCase();
            if (cache.contains(city)) {
                cache.remove(city);  // 기존에 캐시에 있던 것을 삭제하고
                cache.add(city);     // 맨 뒤에 다시 추가
                answer += 1;
            } else {
                if (cache.size() == cacheSize) { // 캐시가 가득 찼으면
                    cache.poll();               // 가장 오래된 것을 삭제하고
                }
                cache.add(city);                // 새로운 것을 추가
                answer += 5;
            }
        }
        return answer;
    }
}
