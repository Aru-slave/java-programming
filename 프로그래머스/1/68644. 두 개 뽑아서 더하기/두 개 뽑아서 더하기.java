import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int num = 0;
        for(int i = 0; i < numbers.length - 1; i++)
        {
            for(int j = i + 1; j < numbers.length; j++)
            {
                num = numbers[i] + numbers[j];
                if(set.size() == 0 || !set.contains(num))
                {
                    set.add(num);
                    list.add(num);
                }
                else
                    continue;
            }
        }
        Collections.sort(list);
        answer = new int[list.size()];
        int index = 0;
        for(int tmp : list)
            answer[index++] = tmp;
        return answer;
    }
}