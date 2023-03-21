import java.util.*;
class Solution {
public int solution(int[] elements) {
    int n = elements.length;
    int count = 0;
    Set<Integer> set = new HashSet<>();
    
    for (int i = 0; i < n; i++) {
        int sum = 0;
        for (int j = i; j < i + n; j++) {
            sum += elements[j % n];
            if (set.add(sum)) {
                count++;
            }
        }
    }
    
    return count;
}
}