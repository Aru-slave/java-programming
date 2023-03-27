import java.util.*;

class Solution {
    public int solution(int N, int number) {
        List<Set<Integer>> setList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Set<Integer> set = new HashSet<>();
            int num = 0;
            for (int j = 0; j <= i; j++) {
                num = num * 10 + N;
            }
            set.add(num);
            for (int j = 0; j < i; j++) {
                for (int x : setList.get(j)) {
                    for (int y : setList.get(i - j - 1)) {
                        set.add(x + y);
                        set.add(x - y);
                        set.add(x * y);
                        if (y != 0) {
                            set.add(x / y);
                        }
                    }
                }
            }
            setList.add(set);
            if (set.contains(number)) {
                return i + 1;
            }
        }
        return -1;
    }
}