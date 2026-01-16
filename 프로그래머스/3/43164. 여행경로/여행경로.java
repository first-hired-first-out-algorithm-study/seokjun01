import java.util.*;

class Solution {
    int n;
    boolean[] visited;
    ArrayList<String> arr = new ArrayList<>();
    
    public String[] solution(String[][] tickets) {
        n = tickets.length;
        visited = new boolean[n]; // 티켓 개수만큼 방문 확인 배열 생성
        
        // 항상 ICN에서 시작
        dfs(0, "ICN", "ICN", tickets);
        
        // 획득한 모든 경로를 사전 순으로 정렬
        Collections.sort(arr);

        // 가장 앞선 경로를 꺼내서 공백 기준 배열로 변환
        return arr.get(0).split(" ");
    }
    
       public void dfs(int cnt, String start, String path, String[][] tickets) {
        // 모든 티켓을 다 사용했을 때 (종료 조건)
        if(cnt == n) {
            arr.add(path); // 완성된 전체 경로를 리스트에 저장
            return;
        }
        
        for(int i = 0; i < n; i++) {
            // 아직 안 쓴 티켓이고 출발지가 맞다면
            if (!visited[i] && tickets[i][0].equals(start)) {
                visited[i] = true; // 티켓 사용 처리
                // 목적지를 새로운 출발지로 설정하고, 경로 문자열에 추가하여 재귀 호출
                dfs(cnt + 1, tickets[i][1], path + " " + tickets[i][1], tickets);
                visited[i] = false; // 백트래킹: 다른 경로 탐색을 위해 티켓 반납
            }
        }
    }
    
}