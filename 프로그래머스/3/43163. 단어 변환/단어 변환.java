import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
    //begin과 비교해서 하나만 다른 단어로만 변환 , 변환시 카운팅 +1
        // 아니면 비교적 구현이 쉬운 BFS? 
        int answer = 0;
        boolean exist = false;
        
        for (String str : words) { // 변환이 안되는경우
           if(str.equals(target)) {
               exist = true;
               break;
           }
       } 
        
        if (!exist) {
            return 0;
        }
        
        boolean[] visited = new boolean[words.length]; // 방문 체크
        Queue<String> q = new LinkedList<>(); // 단어를 담는 큐
        Queue<Integer> count = new LinkedList<>(); // 단계를 담는 큐
        
        q.offer(begin); //시작 단어 큐에 삽입
        count.offer(0); // 아직 변환 0회
        
        while(!q.isEmpty()) {
            String cur = q.poll();
            int step = count.poll();
            
            if(cur.equals(target)) { //현재 단어가 target이면 지금이 최소단계라 바로반환
                return step;
            }
            
            for (int i=0; i<words.length; i++) {
                if(!visited[i] && oneDiff(cur,words[i])) {
                    visited[i] = true;
                    q.offer(words[i]);
                    count.offer(step + 1);
                }
            }
        }
        
        return 0;
    }
    
    //한글자만 다른지 검증 하는 메소드
    private boolean oneDiff(String a, String b) {
        
        int diff = 0; 
        
        for (int i=0; i<a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diff++;
            }
        }
        return diff == 1;
    }
}