class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int num = 0;
        for(int i = 0; i < nums.length - 2; i++)
        {
            for(int j = i + 1; j < nums.length - 1; j++)
            {
                for(int k = j + 1; k < nums.length; k++)
                {
                    num = nums[k] + nums[j] + nums[i];
                    if(isPrime(num))
                        answer++;
                }
            }
        }
        return answer;
    }
    public boolean isPrime(int num)
    {
        if(num < 2) return false;
        for(int i = 2; i < num; i++)
        {
            if(num % i == 0)
                return false;
        }
        return true;
    }
}