class Solution {
    public int solution(int n) {
        int num = n;
        int count = 0;
        int findCount = 0;
        while(num > 0){
            if(num % 2 == 1)
                count++;
            num = num / 2;
        }
        
        while(count != findCount){
            findCount = 0;
            num = n+1;
            while(num > 0){
                if(num % 2 == 1)
                    findCount++;
                num = num / 2;
            }
            n++;
        }
        return n;
    }
}