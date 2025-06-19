import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        boolean flag = true;
        List<int[]> list = new LinkedList<>();
        while(flag)
        {
            flag = false;
            for(int i = 0; i < board.length - 1; i++)
            {
                for(int j = 0; j < board[i].length() - 1; j++)
                {
                    if(board[i].charAt(j) == board[i].charAt(j + 1) 
                       && board[i].charAt(j) == board[i + 1].charAt(j) 
                       && board[i].charAt(j) == board[i+1].charAt(j+1))
                    {
                        flag = true;
                        list.add(new int[]{i,j});
                    }
                }
            } 
        }
        return answer;
    }
}