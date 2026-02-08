import java.util.*;

class Solution {
    public String solution(String X, String Y) {

        Map<Character, Integer> xMap = new HashMap<>();
        Map<Character, Integer> yMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        for (char x : X.toCharArray()) {
            xMap.put(x, xMap.getOrDefault(x, 0) + 1);
        }
        
        for (char y : Y.toCharArray()) {
            yMap.put(y, yMap.getOrDefault(y, 0) + 1);
        }


        for (char i = '9'; i >= '0'; i--) {
            if (xMap.containsKey(i) && yMap.containsKey(i)) {
                int count = Math.min(xMap.get(i), yMap.get(i));
                for (int j = 0; j < count; j++) {
                    sb.append(i);
                }
            }
        }
        String answer = sb.toString();

        if (answer.isEmpty()){
            return "-1";
        }
        
        if (answer.startsWith("0")) {
            return "0";
        }
        
        return answer;
    }
}