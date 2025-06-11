class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int tmp = 0;
        boolean pass = true;
        int maxTime = 0;
        //startday가 6이나 7일 경우에는 일주일 동안 주말의 횟수가 3
        for(int i = 0 ; i < timelogs.length; i++)
        {
            tmp = startday;
            pass = true;
            if(schedules[i] % 100 + 10 >= 60)
                maxTime = (schedules[i] / 100 + 1) * 100 + schedules[i] % 100 + - 50;
            else
                maxTime = schedules[i] + 10;
            System.out.println(maxTime);
            for(int j = 0; j < timelogs[i].length; j++)
            {
                if(tmp == 6)
                {
                    tmp++;
                    continue;
                }
                if(tmp == 7)
                {
                    tmp = 1;
                    continue;
                }
                if(timelogs[i][j] > maxTime)
                {
                    pass = false;
                    break;
                }
                tmp++;
            }
            if(pass)
                answer++;
        }
        return answer;
    }
}