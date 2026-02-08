import java.util.*;
class Solution {
    public int solution(String s) {
//  첫글자를 X , x가 나온횟수, x가 나오지 않은 횟수를 각각세서 두개가 같아지면 문자열 반환
        // 반환하면 다음걸로 넘어가야함
        int answer = 0;
        int cntX =0;
        int cntDiff = 0;
        char x =s.charAt(0);
        
        for (int i=0; i<s.length(); i++) {
            if(cntX== 0 && cntDiff ==0) {
                x= s.charAt(i);
            }
            if (x == s.charAt(i)) {
                cntX++;
            }else {
                cntDiff++;
            }
            
            if (cntX==cntDiff) {
                answer++;
                cntX =0;
                cntDiff =0;
            }
        }
        
        if( cntX != cntDiff) {
            answer++;
        }
        return answer;
    }
}