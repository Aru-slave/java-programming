class Solution {
    public int solution(int storey) {
        int answer = 0;
        //- 각 자리의 숫자 d가:
        //- d < 5 → 무조건 내림 (그대로 빼기)
        //- d > 5 → 무조건 올림 (올리고 다음 자리 +1)
        //- d == 5 → 다음 자리 수를 보고 결정!
        //→ 다음 자리 수 ≥ 5: 올리는 게 이득
        //→ 다음 자리 수 < 5: 내리는 게 이득
        int num = storey;
        while(num > 0)
        {
            if(num % 10 < 5)
            {
                answer += num % 10;
                num /= 10;
            }
            else if(num % 10 > 5)
            {
                answer += 10 - num % 10;
                num /= 10;
                num++;
            }
            else if(num % 10 == 5)
            {
                num /= 10;
                if(num % 10 < 5)
                    answer += 5;
                else
                {
                    answer += 5;
                    num++;
                }
            }
        }
        return answer;
    }
}