class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        for(int i = 1; i < food.length; i++)
        {
            for(int j = 0; j < food[i]/2; j++)
                tmp.append(i);
        }
        answer.append(tmp);
        answer.append("0");
        answer.append(tmp.reverse());
        return answer.toString();
    }
}