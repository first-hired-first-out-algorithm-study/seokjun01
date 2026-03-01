
class Solution {
    public int solution(int n) {
        //3진법에 대해서 ....
        // 3^0, 3^1 .. 이런식으로 (0,1,2)가 올 수 있음
        //규칙으로 어떻게 뽑아내냐
        // 0 , 3, 9, 27, 81, 243, ~ 이런식으로 늘어나는데 ..
        // 나누면서 나머지를 담는다.
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        
        String revThree = sb.toString(); // "0021" 같은 상태
        int answer = 0;
        int power = 1; // 3^0, 3^1... 가중치
        
       
        for (int i = revThree.length() - 1; i >= 0; i--) {
            int digit = revThree.charAt(i) - '0'; 
            answer += digit * power;
            power *= 3; // 다음 자릿수를 위해 3을 곱함
        }
        
        return answer;
    
    }
}