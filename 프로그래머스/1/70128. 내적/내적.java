class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int length  = 0;
        if(a.length >= b.length)
            length = b.length;
        else
            length = a.length;
        for(int i = 0; i < length; i++)
            answer += a[i]*b[i];
        return answer;
    }
}