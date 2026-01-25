import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
    
        int answer = 0;
        Queue<Integer>q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        
        for (int i=0; i<n; i++) { // 1번 컴퓨터 기준으로 연결된거 찾아보자 
            if(!visited[i]) {   // 방문하지 않았다면,
                answer++; // 새로운 네트워크 발견이라고 치고
                q.add(i); // 얘랑 누구랑 연결되어있는지 찾자
                visited[i] = true; //일단 지금 방문했으니 얘는 true로 변경
                
                while(!q.isEmpty()) {
                    int curr = q.poll(); // 현재 조사중인 컴퓨터 번호

                    for (int j=0; j<n; j++) { //현재 조사중인 컴퓨터와 어떤 컴퓨터가 연결되어있는지 루프로 찾아보자
                        if (computers[curr][j] == 1 && !visited[j]) {
                            // 연결되어있고, 방문하지 않았다면 방문했다치고
                            visited[j] = true;
                            q.add(j); // 방문할 큐에 저장
                        }
                    }
                }
            }
        }
     
        return answer;
    }
}