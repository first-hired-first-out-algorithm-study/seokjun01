class Solution {
    public int solution(int a, int b, int n) {
        // 빈 병 a개를 주면 b만큼 주는 마트가 있다  빈병의 갯수 n이 매개변수로 주어질때, 돌려받는 콜라의 병수 
        int answer = 0;
        
        while(n >= a ) {
            
            n -= a;
            n += b;
            answer += b;
            } 
        
        return answer;
        }    
        
    }
