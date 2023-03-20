import java.util.*;
class Solution {
    public int solution(String dirs) {
        int x = 0;
        int y = 0;
        Set<String> set = new HashSet<>();
        for(int i = 0; i < dirs.length(); i++){
            StringBuilder start = new StringBuilder();
            StringBuilder end = new StringBuilder();
            start.append(x);
            start.append(y);
            if(dirs.charAt(i) == 'U' && y < 5){
                y = y + 1;
                end.append(x);
                end.append(y);
            }

            if(dirs.charAt(i) == 'D' && y > -5){
                y = y - 1;
                end.append(x);
                end.append(y);

            }

            if(dirs.charAt(i) == 'R' && x < 5){
                x = x + 1;
                end.append(x);
                end.append(y);
            }

            if(dirs.charAt(i) == 'L' && x > -5){
                x = x - 1;
                end.append(x);
                end.append(y);
            }
            if(end.length() != 0){
                set.add(start.toString() + end.toString());
                set.add(end.toString() + start.toString());
            }
        }
        return set.size() / 2;
    }
}