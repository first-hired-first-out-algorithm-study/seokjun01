class Solution {
    //재귀로 풀기
    // 합계를 나타낼  + 현재 탐색 중인 index 를 나타낼 변수 필요
    int answer = 0;
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    public void dfs(int[] numbers ,int target, int index, int sum) {
        if (index == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        
        dfs(numbers, target, index+1 , sum + numbers[index]);
        dfs(numbers, target, index+1 , sum - numbers[index]);
    }
}