import java.util.*;

class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        //서버의 개수에 따라 수용 가능한 인원이 변화 됨 -> 이를 기준으로 서버를 증설할지 말지 결정
        //수용 가능한 인원 -> (m+1) * 그 시간대에 운영 중인 서버의 개수
        //필요한 변수 : 운영 중인 서버의 개수, 서버마다 운영 종료되는 시간
        //종료되는 시간은 Queue로 관리, 운영 중인 서버는 Queue의 사이즈로 알 수 있음.
        
        Queue<Integer> server = new LinkedList<>();
        for(int i = 0; i < 24; i++)
        {
            if(server.size() != 0)
            {
                while(server.peek() == i)
                {
                    server.poll();
                    if(server.size() == 0)
                        break;
                }
            }
            if(players[i] < (server.size() + 1) * m)
                continue;
            else
            {
                while(players[i] >= (server.size() + 1) * m)
                {
                    server.add(i + k);
                    answer++;  
                }
            }
            System.out.println(i);
            System.out.println(server);
        }
        return answer;
    }
}