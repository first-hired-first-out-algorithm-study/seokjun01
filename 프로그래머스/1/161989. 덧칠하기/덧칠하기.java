class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paintedUntil = 0; // 현재 롤러로 칠해진 마지막 위치
        
        for (int part : section) {
            // 현재 구역(part)이 이미 칠해진 범위보다 오른쪽에 있다면 (안 칠해졌다면)
            if (part > paintedUntil) {
                answer++; // 롤러질 1회 추가
                
                // 현재 구역부터 롤러 길이(m)만큼 칠해짐
                paintedUntil = part + m - 1; 
            }
        }
        
        return answer;
    }
}