class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder str = new StringBuilder();
        
        while(n > 0)
        {
            str.append(n % 3);
            n /= 3;
        }
        
        System.out.println(str);
        int index = 0;
        for(int i = str.length() - 1; i >= 0; i--)
        {
            answer += Math.pow(3,i) * Integer.parseInt(Character.toString(str.charAt(index)));
            index++;
            System.out.println(answer);
        }

        return answer;
    }
}