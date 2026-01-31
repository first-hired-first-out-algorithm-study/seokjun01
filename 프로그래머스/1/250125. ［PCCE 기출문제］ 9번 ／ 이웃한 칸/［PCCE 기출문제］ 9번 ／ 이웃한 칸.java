class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;
        
        //상 하 좌 우 를 표현하는 배열 설정
        int[] dh = {0,0,1,-1};
        int[] dw = {1,-1,0,0};
        String targetColor = board[h][w];
        
        for (int i=0; i<4; i++) {
            int nh = h + dh[i];
            int nw = w + dw[i];
            
            if (nh >=0 && nh < n && nw>=0 && nw <n) {
                if (board[nh][nw].equals(targetColor)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}