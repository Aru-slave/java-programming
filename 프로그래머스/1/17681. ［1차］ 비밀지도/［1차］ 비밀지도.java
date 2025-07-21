class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            // 각 줄의 OR 결과를 2진수로 변환
            int value = arr1[i] | arr2[i];
            
            // 2진수로 변환한 문자열을 n자리로 맞춤 (앞에 0 채우기)
            String binary = String.format("%" + n + "s", Integer.toBinaryString(value));
            
            // #과 공백으로 변환
            binary = binary.replace('1', '#');
            binary = binary.replace('0', ' ');

            answer[i] = binary;
        }

        return answer;
    }
}