class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        boolean pass = false;
        while(true)
        {
            if(wallet[0] >= bill[0] && wallet[1] >= bill[1])
            {
                break;
            }  
            else if(wallet[0] >= bill[1] && wallet[1] >= bill[0])
            {
                break;
            }
            else if(wallet[1] >= bill[0] && wallet[0] >= bill[1])
            {
                break;
            }  
            else if(wallet[1] >= bill[1] && wallet[0] >= bill[0])
            {
                break;
            }
            else
            {
                if(bill[0] > bill[1])
                    bill[0] = bill[0]/2;
                else
                    bill[1] = bill[1]/2;
                answer++;
            }
        }
        return answer;
    }
}