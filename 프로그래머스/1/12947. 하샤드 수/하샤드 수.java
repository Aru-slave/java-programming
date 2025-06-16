class Solution {
    public boolean solution(int x) {
        int num = 0;
        int tmp = x;
        
        while(tmp > 0)
        {
            num += tmp % 10;
            tmp = tmp / 10;
        }
        if(x % num == 0)
            return true;
        else
            return false;
    }
}