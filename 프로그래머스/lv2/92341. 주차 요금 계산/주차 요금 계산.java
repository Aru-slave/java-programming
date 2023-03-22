import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        //기록에는 입차 출차 기록이 담겨있다.
        //fees에는 기본 시간, 기본 요금, 단위 시간, 단위 시간 당 요금이 있다.
        Map<String, String> map = new HashMap<>();
        Map<String, Integer> ans = new HashMap<>();
        int fee = 0;
        int time = 0;
        for (int i = 0; i < records.length; i++) {
            String[] str = records[i].split(" ");
            if (!map.containsKey(str[1])) {
                map.put(str[1], str[0]);
            } else {
                String in = map.get(str[1]);
                String out = str[0];
                time = time(in, out);
                map.remove(str[1]);
                ans.put(str[1],ans.getOrDefault(str[1],0) + time);
            }
        }
        if (!map.isEmpty()) {
            for (String s : map.keySet()) {
                time = time(map.get(s), "23:59");
                ans.put(s,ans.getOrDefault(s,0) + time);
            }
        }
        for(String key : ans.keySet()){
            fee = charge(ans.get(key),fees);
            ans.put(key,fee);
        }
        return ans.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .mapToInt(Map.Entry::getValue)
                .toArray();
    }

    public int charge(int time, int[] fees) {
        if (time <= fees[0]) {
            return fees[1];
        } else {
            return (int) (fees[1] + Math.ceil((double) (time - fees[0]) / (double) fees[2]) * fees[3]);
        }
    }

    public int time(String in, String out) {
        String[] time1 = in.split(":");
        String[] time2 = out.split(":");
        return Integer.parseInt(time2[0]) * 60 + Integer.parseInt(time2[1]) - Integer.parseInt(time1[0]) * 60 - Integer.parseInt(time1[1]);
    }
}
