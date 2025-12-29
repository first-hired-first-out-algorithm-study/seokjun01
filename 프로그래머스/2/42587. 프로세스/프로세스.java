import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
      
        Queue<int[]> q = new LinkedList<>();
        
        for (int i =0; i< priorities.length; i++) {
            q.offer(new int[]{priorities[i],i});
        }
        
        int answer = 0;
        
        while(true) {
            int[] cur = q.poll();
            boolean isMax = true;
            
            for (int[] p : q) {
                if(p[0] > cur[0]) {
                    isMax = false;
                    break;
                }
            }
            
            if (isMax) {
                answer++;
                if ( cur[1] == location) {
                    return answer;
                }
            }else {
                q.offer(cur);
            }
        }
      
    }
}