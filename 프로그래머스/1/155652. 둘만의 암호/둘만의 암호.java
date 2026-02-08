class Solution {
    public String solution(String s, String skip, int index) {
        String answer = ""; 

        for (char c : s.toCharArray()) {
         
            for (int i = 0; i < index; i++) {
                c++; 
                if (c > 'z') {
                    c = 'a';
                }
                // skip에 포함되면 건너뜀 횟수도 미포함
                if (skip.contains(String.valueOf(c))) {
                    i--;
                }
            }
            
            answer += c;
        }
        return answer;
    }
}