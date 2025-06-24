import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
    Stack<Integer> stack = new Stack<>();
    for (int num : arr) 
    {
        if(stack.size() == 0)
            stack.add(num);
        else if(stack.peek() != num)
            stack.add(num);
    }

    int[] answer = new int[stack.size()];
    int index = 0;
    for (int num : stack) answer[index++] = num;

    return answer;
    }
}