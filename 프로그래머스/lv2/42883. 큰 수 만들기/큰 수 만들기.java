class Solution {
    public String solution(String number, int k) {
        int len = number.length() - k;
        StringBuilder answer = new StringBuilder();

        for (int i = 0, idx = -1; i < len; i++) {
            char maxNum = '0';
            for (int j = idx + 1; j <= k + i; j++) {
                if (number.charAt(j) > maxNum) {
                    maxNum = number.charAt(j);
                    idx = j;
                }
            }
            answer.append(maxNum);
        }

        return answer.toString();
    }
}