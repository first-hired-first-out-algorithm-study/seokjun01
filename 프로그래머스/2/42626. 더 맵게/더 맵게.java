import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();


        for (int i : scoville) {
            q.add(i);
        } 

        while(q.peek() < K) {
     
            if(q.size() < 2) {
                return -1;
            }
            
            int first = q.poll();
            int second = q.poll();
            
            int mixed = first + (second * 2);
            
            q.add(mixed);
            answer++;
        }
        
        return answer;
    }
}