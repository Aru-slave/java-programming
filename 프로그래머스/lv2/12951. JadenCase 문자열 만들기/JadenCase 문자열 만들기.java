class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");//String 배열로 변환해야 toUppercase함수를 사용가능하다.
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;//마찬가지고 equals함수를 이용하기 위해서는 String배열을 이용해야 한다. 
        }

        return answer;
    }
}