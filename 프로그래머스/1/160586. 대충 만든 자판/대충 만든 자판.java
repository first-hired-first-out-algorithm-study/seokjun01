import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // 키를 최소 몇번 눌러야 문자열을 완성하는가
        // 배열에 담아서 반환 없으면 -1
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();
        
        //자판 전용 MAP
        for (String key : keymap) {
            for (int i=0; i<key.length(); i++) {
                char c = key.charAt(i);
                int count = i + 1;
                
                if (!map.containsKey(c) || count <map.get(c)) {
                    map.put(c,count);
                }
            }
        }
        
        // target카운팅용
        for (int i=0; i<targets.length; i++) {
            int total =0;
            boolean isPossible =true;
            
            for( char c : targets[i].toCharArray()) {
                if(map.containsKey(c)) {
                    total += map.get(c);
                }else {
                    isPossible =false;
                    break;
                }
            }
            answer[i] = isPossible ? total : -1;
        }
        return answer;
    }
}