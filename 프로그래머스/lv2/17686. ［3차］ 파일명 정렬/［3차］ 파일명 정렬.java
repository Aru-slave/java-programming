import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String head1 = getHead(s1);
                String head2 = getHead(s2);
                int num1 = getNumber(s1, head1.length());
                int num2 = getNumber(s2, head2.length());
                
                int result = head1.compareToIgnoreCase(head2);
                if (result == 0) {
                    result = Integer.compare(num1, num2);
                }
                return result;
            }
        });
        return files;
    }
    
    private String getHead(String s) {
        int idx = 0;
        while (idx < s.length()) {
            if (Character.isDigit(s.charAt(idx))) break;
            idx++;
        }
        return s.substring(0, idx);
    }
    
    private int getNumber(String s, int idx) {
        int num = 0;
        while (idx < s.length()) {
            if (!Character.isDigit(s.charAt(idx))) break;
            num = num * 10 + (s.charAt(idx) - '0');
            idx++;
            if (num > 99999) break;
        }
        return num;
    }
}