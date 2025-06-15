class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int bigNum = a > b ? a : b;
        int smallNum = a > b ? b : a;
        if(bigNum == smallNum)
            return bigNum;
        for(int i = smallNum; i <= bigNum; i++)
            answer += i;
        return answer;
    }
}