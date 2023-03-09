class Solution {
    public int solution(int n, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while(n > 0){
            sb.append(n % k);
            n = n / k;
        }
        String str = sb.reverse().toString();
        sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (c == '0') {
                if (sb.length() > 0 && isPrime(Long.parseLong(sb.toString()))) {
                    count++;
                }
                sb.setLength(0);
            } else {
                sb.append(c);
            }
        }
        if (sb.length() > 0 && isPrime(Long.parseLong(sb.toString()))) {
            count++;
        }
        return count;
    }
    
    public boolean isPrime(Long n){
        if(n == 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
