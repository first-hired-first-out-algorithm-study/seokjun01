import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
// 요청 시각 순서대로 정렬 
// 현재 시점까지 요청된 작업들만 큐에 넣는다        
// Loop에서 현재시각 or 그전에 들어온 작업들을 jobs배열에 넣는다
//하나 씩 꺼내서 실행  (시간 동기화), 작업 없다면 시간 추가  
        
        Arrays.sort(jobs, (a,b) -> a[0] - b[0]);
        int answer =0;
        int currentTime =0;
        int idx =0;
        int completed = 0;
        
        PriorityQueue<int[]> wait = new PriorityQueue<>((a,b) -> {
            if(a[1] == b[1]) {
                return  a[0] - b[0];
        }
            return a[1] - b[1];
        });
                                                        
       while (completed < jobs.length) {
           while( idx < jobs.length && jobs[idx][0] <= currentTime) {
               wait.add(jobs[idx]);
               idx++;
           }
           
           if ( wait.isEmpty()) {
                currentTime = jobs[idx][0];
           }else {
               int[] job = wait.poll();
               answer += (currentTime + job[1] - job[0]);
               currentTime += job[1];
               completed++;
           }
       }
        return answer/jobs.length;                                                        
    }
}