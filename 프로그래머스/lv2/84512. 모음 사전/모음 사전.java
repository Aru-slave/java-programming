class Solution {
    int count = 0;
    int ans = 0;
    public int solution(String word) {
        String str = "AEIOU";
        StringBuilder sb = new StringBuilder();
        dfs(str,sb,word);
        return ans;
                
    }
    public void dfs(String str, StringBuilder nowWord,String word){
        if(nowWord.toString().equals(word)){
        ans = count;
        }
        if(nowWord.length() == 5){
       return;
        }
        for(int i = 0; i < str.length(); i++){
            nowWord.append(str.charAt(i));
            count++;
            dfs(str,nowWord,word);
            nowWord.deleteCharAt(nowWord.length() - 1);
        }
    }
}