import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int[] dx = {-1, 1 ,0 ,0};
        int[] dy = {0,0 ,-1, 1};
        int n = maps.length; // 행 크기
        int m = maps[0].length; //열 크기
        int[][] visited = new int[n][m]; // 방문 여부 및 이동거리 계산용 배열
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0}); // 시작점 설정
        visited[0][0] = 1; // 시작 거리도 1로 시작
        
        while(!q.isEmpty()) {
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];  //현재 위치  (0 ,0)
            
            if( x == n-1  && y == m-1) { // 목적지 도달 검증
                return visited[x][y];
            }
            
            for (int i =0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                //맵 범위를 벗어나는지 검증
                if ( nx >=0 && nx < n && ny >=0 && ny<m) {
                    if(maps[nx][ny] == 1 && visited[nx][ny] ==0){ // 길이 있고, 방문하지 않았다면 
                    visited[nx][ny] = visited[x][y] + 1;
                    q.add(new int[]{nx, ny});
                    }
                }
            }
        }
        return -1;
    }
}