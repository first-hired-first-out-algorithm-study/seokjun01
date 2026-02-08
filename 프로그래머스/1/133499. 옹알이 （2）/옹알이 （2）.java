class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] possible = {"aya", "ye", "woo", "ma"};
        
        for (String bab : babbling) {
            
            if (bab.contains("ayaaya") || bab.contains("yeye") || 
                bab.contains("woowoo") || bab.contains("mama")) continue;

            for (String ps : possible) {
                bab = bab.replace(ps, " "); 
            }

           
            if (bab.replace(" ", "").equals("")) {
                answer++;
            }
        }
        return answer;
    }
}