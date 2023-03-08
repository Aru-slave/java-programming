class Solution {
    public int[] solution(String s) {
        int sum = 0;
        int ans = 0;
        while(s.length() != 1){
        int count = s.length();
        s = s.replace("0","");
        int num = s.length();
        sum = sum + count - num;
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            sb.append(num % 2);
            num = num / 2;
        }
        ans++;
        s = sb.reverse().toString();
        }
        return new int[]{ans,sum};
    }
}