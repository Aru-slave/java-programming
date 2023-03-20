import java.util.Arrays;

class Solution {
    public int[] solution(int n, long left, long right) {
        //2
        int[] arr = new int[(int)(right - left) + 1];
        for(int i = 0; i < arr.length; i ++){
            int y = (int)(left / n + 1);
            int x = (int)(left % n + 1);
            left++;
            arr[i] = Math.max(y, x);
            }
        
        return arr;
    }
}