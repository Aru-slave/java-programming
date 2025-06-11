class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        //pos는 String 형태로 주어진다. substring 함수를 이용해서 분으로 바꾼다.
        int curTime = Integer.parseInt(pos.substring(0,2)) * 60 + Integer.parseInt(pos.substring(3,5));
        int startOpTime = Integer.parseInt(op_start.substring(0,2)) * 60 + Integer.parseInt(op_start.substring(3,5));
        int endOpTime = Integer.parseInt(op_end.substring(0,2)) * 60 + Integer.parseInt(op_end.substring(3,5));
        int runningTime = Integer.parseInt(video_len.substring(0,2)) * 60 + Integer.parseInt(video_len.substring(3,5));

        for(int i = 0; i < commands.length; i++)
        {
            if(curTime < 0 )
                curTime = 0;
            if(curTime <= endOpTime && curTime >= startOpTime)
                curTime = endOpTime;
            if(curTime >= runningTime)
                curTime = runningTime;

            switch(commands[i])
            {
                case "prev":
                    curTime -= 10;
                    break;
                case "next":
                    curTime += 10;
                    break;
            }
            System.out.println(curTime);
        }
        if(curTime <= endOpTime && curTime >= startOpTime)
            curTime = endOpTime;
        if(curTime >= runningTime)
            curTime = runningTime;
        if(curTime < 0 )
            curTime = 0;
        int curHours = curTime / 60;
        int curtMins = curTime % 60;
        
        return String.format("%02d:%02d", curHours, curtMins);
    }
}