import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
     
        Arrays.sort(mats);
        int rows = park.length;      // 공원 세로 길이
        int cols = park[0].length;   // 공원 가로 길이

        // 가장 큰 돗자리(배열의 맨 뒤)부터 하나씩 꺼내서 확인
        for (int i = mats.length - 1; i >= 0; i--) {
            int currentMatSize = mats[i]; // 이번에 깔아볼 돗자리 크기
            // 단, 돗자리가 공원 밖으로 삐져나가지 않는 범위(rows - currentMatSize)까지만 돕니다.
            for (int r = 0; r <= rows - currentMatSize; r++) {
                for (int c = 0; c <= cols - currentMatSize; c++) {
                    
                    // (r, c) 위치에 돗자리를 깔 수 있는지 검사 시작
                    boolean isPossible = true; // 일단 깔 수 있다고 가정

                    // 돗자리 크기만큼 정사각형 영역을 하나하나 확인
                    for (int x = 0; x < currentMatSize; x++) {
                        for (int y = 0; y < currentMatSize; y++) {
                            // 빈 자리("-1")가 아니라면(알파벳이 있다면) 실패
                            if (!park[r + x][c + y].equals("-1")) {
                                isPossible = false;
                                break; // 안쪽 루프 탈출
                            }
                        }
                        if (!isPossible) break; // 바깥 루프 탈출 (다음 좌표로 이동)
                    }
                    if (isPossible) {
                        return currentMatSize;                    }
                }
            }
        }
        return -1;
    }
}