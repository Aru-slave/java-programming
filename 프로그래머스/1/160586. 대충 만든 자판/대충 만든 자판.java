import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> scoreMap = new HashMap<>();
        
        for(int i = 0; i < keymap.length; i++)
        {
            for(int j = 0; j < keymap[i].length(); j++)
            {
                if(scoreMap.containsKey(keymap[i].charAt(j)))
                {
                    if(scoreMap.get(keymap[i].charAt(j)) > j + 1)
                        scoreMap.put(keymap[i].charAt(j), j + 1);
                }
                else
                    scoreMap.put(keymap[i].charAt(j), j + 1);
            }
        }
        System.out.println(scoreMap.entrySet());
        
        for(int i = 0; i < targets.length; i++)
        {
            int score = 0;
            for(int j = 0; j < targets[i].length(); j++)
            {
                if(scoreMap.containsKey(targets[i].charAt(j)))
                    score += scoreMap.get(targets[i].charAt(j));
                else
                {
                    score = -1;
                    break;
                }
            }
            answer[i] = score;
        }
        return answer;
    }
}