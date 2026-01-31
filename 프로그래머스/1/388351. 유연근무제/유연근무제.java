class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int i = 0; i < schedules.length; i++) {
            int count = 0;  
            int today = startday; 
            
            for (int j = 0; j < 7; j++) {
                
                if (today == 6 || today == 7) {
                } else {
                    int limitTime = schedules[i] + 10;
                    if (limitTime % 100 >= 60) { 
                        limitTime += 40; 
                    }

                    if (timelogs[i][j] <= limitTime) {
                        count++;
                    }
                }
                today++; 
                if (today > 7) { // 일요일 다음은
                    today = 1;   // 월요일로 리셋
                }
            }
            
            if (count == 5) {
                answer++;
            }
        }
        return answer;
    }
}