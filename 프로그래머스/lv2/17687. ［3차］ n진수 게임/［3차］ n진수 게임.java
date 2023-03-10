class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        int num = 0; // 다음에 말해야 하는 숫자
        int turn = 0; // 튜브의 순서
        while(sb.length() < t) {
            String str = convert(num, n); // 현재 숫자를 n진법으로 변환
            for(int i = 0; i < str.length(); i++) {
                if(turn == p - 1) { // 튜브의 차례인 경우
                    sb.append(str.charAt(i)); // 현재 숫자의 i번째 자리를 출력
                    if(sb.length() == t) { // 미리 구할 숫자의 갯수에 도달한 경우
                        break;
                    }
                }
                turn = (turn + 1) % m; // 차례를 바꿈
            }
            num++; // 다음에 말해야 하는 숫자를 1 증가
        }
        return sb.toString();
    }
    
    // 10진수 num을 base진법으로 변환하는 메소드
    public String convert(int num, int base) {
        if(num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while(num > 0) {
            int remainder = num % base;
            if(remainder >= 10) { // 10 이상인 경우 대문자 A~F로 변환
                sb.append((char)('A' + remainder - 10));
            } else {
                sb.append(remainder);
            }
            num = num / base;
        }
        return sb.reverse().toString();
    }
}