class Solution {
    public int solution(int n) {
        int ans = 0;
        for(int i = 1; i <= n; i++){
            int sum = 0;
            int start = i;
            while(sum <= n){
                sum = sum + start;
                start++;
                if(sum == n)
                    ans++;
            }
        }
        return ans;
    }
}