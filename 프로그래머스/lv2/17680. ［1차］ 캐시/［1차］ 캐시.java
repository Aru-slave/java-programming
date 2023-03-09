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
