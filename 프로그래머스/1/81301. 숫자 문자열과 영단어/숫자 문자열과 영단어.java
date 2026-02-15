import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Map<String, String> dict = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        
        dict.put("zero", "0");
        dict.put("one", "1");
        dict.put("two", "2");
        dict.put("three", "3");
        dict.put("four", "4");
        dict.put("five", "5");
        dict.put("six", "6");
        dict.put("seven", "7");
        dict.put("eight", "8");
        dict.put("nine", "9");
        // Character.isDigit() 로 숫자 판별
        for(char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }else {
                temp.append(c);
                if(dict.containsKey(temp.toString())) {
                    sb.append(dict.get(temp.toString()));
                    temp.setLength(0);
                }
            }
        }
        answer = Integer.parseInt(sb.toString());
        return answer;
    }
}