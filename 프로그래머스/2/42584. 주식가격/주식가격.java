class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        
        // i: 현재 시점의 주식 가격
        for (int i = 0; i < n; i++) {
            
            // j: i 이후의 주식 가격들 (미래)
            // i가 마지막 인덱스(n-1)일 때 j는 n이 되어 조건(j < n)을 만족하지 않아 실행되지 않음 (자동 해결)
            for (int j = i + 1; j < n; j++) {
                
                // 1초가 흘렀으므로 기간 증가
                answer[i]++; 
                
                // 가격이 떨어졌다면? 
                if (prices[i] > prices[j]) {
                    break; // 주식 가격이 떨어졌으므로 카운트 중단하고 다음 i로 넘어감
                }
            }
        }
        
        return answer;
    }
}