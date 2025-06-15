import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = null;
        LinkedList<Integer> list = new LinkedList<>();
        int index  = 0;
        while( n > 0)
        {
            if(n / 10 > 0)
            {
                list.add((int)(n % 10));  
            }
            else
                list.add((int)(n % 10));
            n = n / 10;

        }
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);
        System.out.println(list);
        return answer;
    }
}