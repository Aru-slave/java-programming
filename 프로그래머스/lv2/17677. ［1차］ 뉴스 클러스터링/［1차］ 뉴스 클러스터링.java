import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        //두 문자씩 잘라서 집합을 만드는데 문자 외 다른 기호는 제외
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        int a = 0;
        int b = 0;
        for(int i = 0; i < str1.length() - 1; i++){
            if(str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z'
                    && str1.charAt(i+1) >= 'a' && str1.charAt(i+1) <= 'z'){
                String str = str1.substring(i, i+2);
                map1.put(str,map1.getOrDefault(str,0)+1);
                a++;
            }
        }
        for(int i = 0; i < str2.length() - 1; i++){
            if(str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z'
                    && str2.charAt(i+1) >= 'a' && str2.charAt(i+1) <= 'z'){
                String str = str2.substring(i, i+2);
                map2.put(str,map2.getOrDefault(str,0)+1);
                b++;
            }
        }
        int count = 0;
        for(String str : map1.keySet()){
            if(map2.containsKey(str)){
                count = count + Math.min(map1.get(str),map2.get(str));
            }
        }

        if(a == 0 & b == 0) return 65536;
        return (int)(((double)count/(double)(a + b - count))*65536);
    }
}