public class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGCD(n, m); // 최대공약수
        int lcm = (n * m) / gcd; // 최소공배수는 두 수의 곱을 최대공약수로 나눈 것

        return new int[]{gcd, lcm};
    }

    // 최대공약수를 구하는 유클리드 호제법
    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}