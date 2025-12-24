import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
       
        int n = progresses.length;
        int[] days = new int[n];
        
        for (int i=0; i<n; i++) {
            days[i] =(100 -progresses[i] + speeds[i] - 1) /speeds[i];
        }
        List<Integer> result = new ArrayList<>();
        
        int standard = days[0];
        int count = 1;
        
        for (int i=1; i<n; i++) {
            if(days[i]<= standard) {
                count++;
            } else {
                result.add(count);
                standard = days[i];
                count =1;
            }
        }
        
        result.add(count);
    
        return result.stream().mapToInt(i -> i).toArray();
    }
}