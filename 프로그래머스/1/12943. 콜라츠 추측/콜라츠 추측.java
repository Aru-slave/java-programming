class Solution {
    public int solution(int num) {
    int count = 0;
    if(num == 1) return 0;
    long n = num;
    while(count <  500)
    {        
        if(n % 2 == 0)
            n /= 2;
        else
            n = n * 3 + 1;
        count++;
        if(n == 1)
            return count;
    }
    return -1;
    }
}