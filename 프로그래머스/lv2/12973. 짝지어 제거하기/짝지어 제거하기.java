import java.util.*;
class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();  // 스택을 생성합니다.

        for (char c : s.toCharArray()) {  // 문자열을 순회합니다.
            if (!stack.isEmpty() && stack.peek() == c) {  // 스택이 비어있지 않고, 스택의 맨 위와 같은 문자인 경우
                stack.pop();  // 스택에서 문자를 제거합니다.
            } else {  // 스택이 비어있거나, 스택의 맨 위와 다른 문자인 경우
                stack.push(c);  // 스택에 문자를 추가합니다.
            }
        }

        return stack.isEmpty() ? 1 : 0;  // 스택이 비어있으면 짝지어 제거하기를 성공적으로 수행한 것입니다.
    }
}