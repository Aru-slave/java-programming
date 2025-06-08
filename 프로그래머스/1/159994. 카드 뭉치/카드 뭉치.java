class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int firstIndex = 0;
        int secondIndex = 0;

        for (String word : goal) {
            if (firstIndex < cards1.length && cards1[firstIndex].equals(word)) {
                firstIndex++;
            } else if (secondIndex < cards2.length && cards2[secondIndex].equals(word)) {
                secondIndex++;
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}