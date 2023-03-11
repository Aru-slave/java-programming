class Solution
{
    public int solution(int n, int a, int b)
    {
    //홀수면 -> 3 -> 2 -> 1
    //짝수면 -> 6 -> 3 -> 2 -> 1
        int count = 0;
    while(n > 0){
        if(Math.abs(a-b) == 1 && a / 2 != b / 2)
            return count + 1;
        count ++;
        if(a % 2 == 0) a = a / 2;
        else a = a / 2 + 1;
        if(b % 2 == 0) b = b / 2;
        else b = b / 2 + 1;
        n = n / 2;
        
    }
        return count + 1;
    }
}