import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        //트럭은 bridge_length 만큼 올라갈 수 있고, 길이만큼 초가 소요된다 
        // 순서대로 건너야한다.
        // 동시에 갈 수 없다면 하나가 다 갈때까지 기다린다.
        
        Queue<Integer> bridge = new LinkedList<>();
        
        for (int i = 0; i< bridge_length; i++) {
            bridge.offer(0);
        }
        
        int time = 0;
        int currentWeight = 0;
        int idx = 0;
        
        while( idx < truck_weights.length) {
            time++;
            int out = bridge.poll();
            currentWeight -= out;
            
            int next = truck_weights[idx];
            
            if( currentWeight + next <= weight) {
                bridge.offer(next);
                currentWeight += next;
                idx++;
            }else {
                bridge.offer(0);
            }
        }
        
        return time + bridge_length;
    }
}