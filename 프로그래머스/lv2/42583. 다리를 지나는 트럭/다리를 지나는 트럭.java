import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Map<Integer, Integer> map = new HashMap<>();
        int time = 0;
        int sum = 0;
        int index = 0;
        
        while (true) {
            time++;

            if (map.containsKey(time)) {
                int truckWeight = map.get(time);
                sum -= truckWeight;
                map.remove(time);
            }

            if (index < truck_weights.length && sum + truck_weights[index] <= weight) {
                map.put(time + bridge_length, truck_weights[index]);
                sum += truck_weights[index];
                index++;
            }

            if (map.isEmpty() && index >= truck_weights.length) {
                break;
            }
        }
        
        return time;
    }
}