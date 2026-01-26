class Solution {
    public int solution(int n, int w, int num) {
        int rows = (n + w - 1) / w; 
        int[][] storage = new int[rows][w];
        
        int count = 1;
        int targetRow = 0;
        int targetCol = 0;

        
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < w; j++) {
                    if (count <= n) storage[i][j] = count++;
                    if (storage[i][j] == num) {
                        targetRow = i; targetCol = j; 
                    }
                }
            } else {
                for (int j = w - 1; j >= 0; j--) {
                    if (count <= n) storage[i][j] = count++;
                    if (storage[i][j] == num) {
                        targetRow = i; targetCol = j; 
                    }
                }
            }
        }

        
        int answer = 0;
        for (int i = targetRow; i < rows; i++) {
            if (storage[i][targetCol] != 0) {
                answer++;
            }
        }

        return answer;
    }
}