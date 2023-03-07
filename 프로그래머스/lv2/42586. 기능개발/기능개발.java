import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        int i = 0;
        int index = 0;
        int count = 0;
        List<Integer> list = new LinkedList<>();
        for(int j : progresses)
            q.add(j);
        
        while(!q.isEmpty()){
            if(q.peek() + i * speeds[index] >= 100){
                int size = q.size();
                for(int j = 0; j < size; j++){
                    if(q.peek() + i * speeds[index] >= 100){
                        q.poll();
                        index++;
                        count++; 
                    }
                }
                list.add(count);
                count = 0;
                i = 0;
            }else{
                i++;
            }
                
        }
        return list.stream().mapToInt(Integer :: intValue).toArray();
    }
}