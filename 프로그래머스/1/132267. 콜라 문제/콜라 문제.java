class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        //a병의 빈병 -> b병을 줌
        //총 n개의 빈 병일 때, 몇 개를 받을 수 있는가?
        
        while(n >= a)
        {
            answer += (n / a) * b;
            n = (n / a) * b + n % a;
        }
        return answer;
    }
}